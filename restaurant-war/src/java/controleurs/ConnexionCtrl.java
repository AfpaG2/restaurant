/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import com.gp2.metiers.GestionPersonnelLocal;
import com.gp2.outils.CustomedException;
import java.util.HashMap;
import java.util.Set;
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
 * @author youssef
 */
public class ConnexionCtrl implements SousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        GestionPersonnelLocal gestionPersonnel = lookupGestionPersonnelLocal();
        String mdp = request.getParameter("mdp");        
        String page = "/WEB-INF/connexion-form.jsp";
        HttpSession session = request.getSession();

        if ((mdp==null) || mdp.isEmpty()) {
            page = "/WEB-INF/connexion-form.jsp";
        } else {

            try {
                String fonction = gestionPersonnel.seconnecter(mdp);
                request.setAttribute("dClasse", "info");
                request.setAttribute("msg", "Binvenue : " + fonction);
                session.setAttribute("fonction", fonction);
                page = "FrontControleur?section="+fonction+"-interface-affichage";
                request.setAttribute("redirect", true);
                
                
//                page = "/WEB-INF/" + fonction.toLowerCase() + "/" + fonction.toLowerCase() + ".jsp";

            } catch (CustomedException ex) {
                if (ex.getNumero() == CustomedException.USER_ERR) {
                    request.setAttribute("mdp", mdp);
                    String erreur = ex.getMessage();
                    request.setAttribute("erreur", erreur);

                    HashMap<String, String> mp = ex.getErreurs();
                    Set<String> clefs = mp.keySet();
                    for (String cle : clefs) {
                        request.setAttribute(cle, mp.get(cle));
                    }

                    page = "/WEB-INF/connexion-form.jsp";
                }

            }
        }

        return page;

    }

    private GestionPersonnelLocal lookupGestionPersonnelLocal() {
        try {
            Context c = new InitialContext();
            return (GestionPersonnelLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionPersonnel!com.gp2.metiers.GestionPersonnelLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
