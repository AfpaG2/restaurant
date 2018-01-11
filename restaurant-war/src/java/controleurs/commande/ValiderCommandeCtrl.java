/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs.commande;

import com.gp2.metiers.GestionCommandeLocal;
import com.gp2.metiers.GestionPanier;
import com.gp2.metiers.GestionPanierLocal;
import com.gp2.persistence.carte.LignePanier;
import com.gp2.persistence.commande.Commande;
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
 * @author mumu
 */
public class ValiderCommandeCtrl implements SousControleur{

    private static final long serialVersionUID = 1L;

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        GestionCommandeLocal gestionCommande = lookupGestionCommandeLocal();
        GestionPanierLocal gestionPanier = lookupGestionPanierLocal();
        
        String page = "/WEB-INF/commandeClient/validerCommande.jsp";
        HttpSession session = request.getSession();
        
        
       GestionPanierLocal lpc =   (GestionPanierLocal) session.getAttribute("gestionPanier");
       Collection<LignePanier>lp = lpc.getListe();
       System.out.println("ibraa "+lpc);
       Commande com = gestionCommande.validerCommande(lp,"5");
        session.setAttribute("commande", com);
        return page;
    }

    
    private GestionCommandeLocal lookupGestionCommandeLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCommandeLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionCommande!com.gp2.metiers.GestionCommandeLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
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
