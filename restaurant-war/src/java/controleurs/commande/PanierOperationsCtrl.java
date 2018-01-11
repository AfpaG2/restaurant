/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs.commande;

import com.gp2.metiers.GestionPanierLocal;
import controleurs.SousControleur;
import java.util.Enumeration;
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
public class PanierOperationsCtrl implements SousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();

        String action = request.getParameter("action");
        String origine = request.getParameter("origine");
        String reference = request.getParameter("ref");
        String page = "/WEB-INF/accueil.jsp";

        if (session.getAttribute("gestionPanier") == null) {
            session.setAttribute("gestionPanier", lookupGestionPanierLocal());
        }
        GestionPanierLocal gestionPanier = (GestionPanierLocal) session.getAttribute("gestionPanier");

        if ("add".equals(action)) {
            if ("formule".equals(origine)) {
                Enumeration names = request.getParameterNames();
                for (int i = 0; names.hasMoreElements(); i++) {
                    String name = (String) names.nextElement();
                    if ("ref".equals(name.substring(0, 3))) {
                        reference = request.getParameter(name);
                       gestionPanier.ajouter(reference);
                    }
                }

            } else {

                gestionPanier.ajouter(reference);
            }
        }
        if ("dec".equals(action)) {
            gestionPanier.enlever(reference);
        }
        if ("supp".equals(action)) {
            gestionPanier.supprimer(reference);
        }

        if ("formule".equals(origine)) {
            page = "FrontControleur?section=carte";
        }

        if ("catalogue".equals(origine)) {
            page = "FrontControleur?section=carte";
        }
        if ("panier".equals(origine)) {
            page = "FrontControleur?section=panier-affichage";
        }

        request.setAttribute("redirect", true);
        return page;
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
