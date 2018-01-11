/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author youssef
 */
public class ChangerStatutCommandeCtrl implements SousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        GestionCuisineLocal gestionCuisine = lookupGestionCuisineLocal();
        String page = "/WEB-INF/cuisinier/cuisinier.jsp";
        
        String idcommande = request.getParameter("idCommande");
        String valeurStatut = request.getParameter("statutCommande"+idcommande);
            
        if (valeurStatut != null && idcommande != null) {
            
            try {
                gestionCuisine.changerStatutCommande(valeurStatut, idcommande);
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
