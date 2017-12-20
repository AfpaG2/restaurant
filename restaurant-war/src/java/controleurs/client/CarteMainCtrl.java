

package controleurs.client;
import com.gp2.metiers.GestionCatalogueLocal;
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
 * @author Katia
 */
public class CarteMainCtrl implements  SousControleur   {
    
    

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) { 
        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();
        request.setAttribute("formules", gestionCatalogue.getAllFormules());
//        request.setAttribute("natureProduits", gestionCatalogue.getAllProduitsByNature());
//        request.setAttribute("typePlats", gestionCatalogue.getAllProduitsByTypePlat());
    return "/WEB-INF/client/carte.jsp";
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
