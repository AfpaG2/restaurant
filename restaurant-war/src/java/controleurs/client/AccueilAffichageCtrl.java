/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs.client;

import com.gp2.metiers.GestionCatalogueLocal;
import com.gp2.persistence.carte.Produit;
import controleurs.SousControleur;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
public class AccueilAffichageCtrl implements SousControleur {

    private static final long serialVersionUID = 1L;

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {

        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();

        String section = request.getParameter("section");

        if ("accueil".equals(section)) {
            
            request.setAttribute("patesLegumes", gestionCatalogue.findProduitByName("Nouilles sautées aux légumes"));
            request.setAttribute("patesPoulet", gestionCatalogue.findProduitByName("Nouilles sautées au poulet"));
            request.setAttribute("rizCantonnais", gestionCatalogue.findProduitByName("Riz Cantonnais"));
            
            request.setAttribute("saladeLotus", gestionCatalogue.findProduitByName("Salade de lotus aux crevettes"));
            request.setAttribute("saladeCalamar", gestionCatalogue.findProduitByName("Salade de calamars"));
            request.setAttribute("rizGluantTaro", gestionCatalogue.findProduitByName("Riz gluant au taro et noix coco"));
            request.setAttribute("phoLegumes", gestionCatalogue.findProduitByName("Phô légumes et boeuf"));
        }

        return "/WEB-INF/accueil.jsp";
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
