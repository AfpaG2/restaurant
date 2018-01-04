package controleurs.client;

import com.gp2.metiers.GestionCatalogueLocal;
import com.gp2.persistence.carte.NatureProduit;
import controleurs.SousControleur;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Katia
 */
public class CarteMainCtrl implements SousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {

        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();
        String category = request.getParameter("category");
        String reference = request.getParameter("ref");

        String page = "/WEB-INF/pages/carte.jsp";

        if ("formule".equals(category)) {
            if (reference != null) {
                Long ref = Long.parseLong(reference);
                request.setAttribute("map", gestionCatalogue.getAllProduitsByFormule(ref));
                page = "/WEB-INF/client/formule-detail.jsp";
            } else {
                request.setAttribute("formules", gestionCatalogue.getAllFormules());
                page = "/WEB-INF/client/formules.jsp";
            }
        }
        if ("natureProduit".equals(category)) {
            page = "/WEB-INF/client/natureProduit-detail.jsp";
            Collection<NatureProduit> nameNatureProduits = gestionCatalogue.getAllNatureProduits();
            request.setAttribute("natureProduits",nameNatureProduits);            
            request.setAttribute("produitsByNature", gestionCatalogue.getAllProduitsByNature("NOS SOUPES"));
            if (reference != null) {
             request.setAttribute("produitsByNature", gestionCatalogue.getAllProduitsByNature(reference));
            }
        }

        return page;
    }

    private GestionCatalogueLocal lookupGestionCatalogueLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCatalogueLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionCatalogue!com.gp2.metiers.GestionCatalogueLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
