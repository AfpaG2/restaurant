
package controleurs.commande;

import com.gp2.metiers.GestionPanierLocal;
import com.gp2.persistence.carte.LignePanier;
import controleurs.SousControleur;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cdi307
 */
public class PanierAffichageCtrl implements SousControleur{
    
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();

        if (session.getAttribute("gestionPanier") == null) {
            session.setAttribute("gestionPanier", lookupGestionPanierLocal());
        }
        GestionPanierLocal gestionPanier = (GestionPanierLocal) session.getAttribute("gestionPanier");

        Collection<LignePanier> clp = gestionPanier.getListe();
        request.setAttribute("maListe", clp);
        return "/WEB-INF/client/panier-detail.jsp";

    }

    private GestionPanierLocal lookupGestionPanierLocal() {
        try {
            Context c = new InitialContext();
            return (GestionPanierLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionPanier!com.gp2.metiers.GestionPanierLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
