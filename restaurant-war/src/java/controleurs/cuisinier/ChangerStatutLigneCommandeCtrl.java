package controleurs.cuisinier;

import com.gp2.metiers.GestionCuisineLocal;
import com.gp2.outils.CustomedException;
import controleurs.SousControleur;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangerStatutLigneCommandeCtrl implements SousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        GestionCuisineLocal gestionCuisine = lookupGestionCuisineLocal();
        String page = "/WEB-INF/cuisinier/cuisinier.jsp";
        String idLignecommande = request.getParameter("ligneCommande");
        String valeurStatut = request.getParameter("statutLigneCommande"+idLignecommande);
        
        System.out.println(valeurStatut);
        System.out.println(idLignecommande);
                
        
        
        if (valeurStatut != null && idLignecommande != null) {
            
            try {
                gestionCuisine.changerStatutLigneCommande(valeurStatut, idLignecommande);
                System.out.println(idLignecommande+"ok");
                page = "FrontControleur?section=cuisinier-interface-affichage";
                request.setAttribute("redirect", true);
            } catch (CustomedException ex) {
                request.setAttribute("erreur", ex.getMessage());
                page = "/WEB-INF/cuisinier/cuisinier.jsp";
            }
        }
        
        return page;
    }
    
    private GestionCuisineLocal lookupGestionCuisineLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCuisineLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionCuisine!com.gp2.metiers.GestionCuisineLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
