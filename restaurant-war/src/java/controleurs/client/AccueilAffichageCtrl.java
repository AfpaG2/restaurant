/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs.client;

import com.gp2.metiers.GestionCatalogueLocal;
import com.gp2.metiers.GestionEmplacementLocal;
import controleurs.SousControleur;
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
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
public class AccueilAffichageCtrl implements SousControleur {
    GestionEmplacementLocal gestionEmplacement = lookupGestionEmplacementLocal();

    private static final long serialVersionUID = 1L;

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {

        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();
         HttpSession session = request.getSession();

        String section = request.getParameter("section");
        
        String page = "/WEB-INF/accueil.jsp";

        if ("accueil".equals(section)) {
            
            session.setAttribute("patesLegumes", gestionCatalogue.findProduitByName("Nouilles aux légumes"));
            session.setAttribute("patesPoulet", gestionCatalogue.findProduitByName("Nouilles sautées au poulet"));
            session.setAttribute("rizCantonnais", gestionCatalogue.findProduitByName("Riz Cantonnais"));
            
            session.setAttribute("saladeLotus", gestionCatalogue.findProduitByName("Salade de lotus aux crevettes"));
            session.setAttribute("saladeCalamar", gestionCatalogue.findProduitByName("Salade de calamars"));
            session.setAttribute("rizGluantTaro", gestionCatalogue.findProduitByName("Riz gluant au taro et noix coco"));
            session.setAttribute("phoLegumes", gestionCatalogue.findProduitByName("Phô légumes et boeuf"));
            
            session.setAttribute("terminaux", gestionEmplacement.findAllTerminals(6001));
            
            System.out.println("Tous les terminaux : " + gestionEmplacement.findAllTerminals(6001));
        }
        
        if ("nouilles-legumes".equalsIgnoreCase(request.getParameter("type-plat"))) {
            
            page = "/WEB-INF/pages/infosProduit.jsp";
            
        }

        return page;
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

    private GestionEmplacementLocal lookupGestionEmplacementLocal() {
        try {
            Context c = new InitialContext();
            return (GestionEmplacementLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionEmplacement!com.gp2.metiers.GestionEmplacementLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    

}
