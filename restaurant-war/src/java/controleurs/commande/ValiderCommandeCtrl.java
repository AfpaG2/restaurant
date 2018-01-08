/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs.commande;

import com.gp2.metiers.GestionCommandeLocal;
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
        String page = "/WEB-INF/commandeClient/validerCommande.jsp";
        HttpSession session = request.getSession();
        Collection<LignePanier> lp =  (Collection<LignePanier>) session.getAttribute("gestionPanier");
        Commande com = gestionCommande.validerCommande(lp);
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
    
}
