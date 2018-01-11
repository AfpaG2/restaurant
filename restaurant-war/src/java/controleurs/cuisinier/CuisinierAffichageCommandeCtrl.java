/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs.cuisinier;

import com.gp2.metiers.GestionCuisineLocal;
import com.gp2.outils.CustomedException;
import com.gp2.persistence.Statut;
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

/**
 *
 * @author youssef
 */
public class CuisinierAffichageCommandeCtrl implements SousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        GestionCuisineLocal gestionCuisine = lookupGestionCuisineLocal();
        String page = "/WEB-INF/cuisinier/cuisinier.jsp";
        Collection<Commande> commandes = null;
        Collection<Statut> statutCommandes = null;      
        Collection<Statut> statutLigneCommandes = null;      
        try {
                commandes = gestionCuisine.findCommandeByStatut("1002");
                statutCommandes=gestionCuisine.findAllStatutCommande();
                statutLigneCommandes=gestionCuisine.findAllStatutLigneCommande();
            } catch (CustomedException ex) {
                request.setAttribute("erreur", ex.getMessage());
                page = "/WEB-INF/cuisinier/cuisinier.jsp";
            }
//        for (Commande commande : commandes) {
//
//            for (LigneCommande LigneCommande : commande.getLigneCommandes()) {
//                if ((LigneCommande.getStatut().getId() != 2004)
//                        ||(LigneCommande.getStatut().getId() != 2005)
//                        ||(LigneCommande.getStatut().getId() != 2006 )) {
//                    commande.getLigneCommandes().remove(LigneCommande);
//                }
//            }
//
//        }
        request.setAttribute("commandes", commandes);
        request.setAttribute("statutCommandes", statutCommandes);
        request.setAttribute("statutLigneCommandes", statutLigneCommandes);
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
