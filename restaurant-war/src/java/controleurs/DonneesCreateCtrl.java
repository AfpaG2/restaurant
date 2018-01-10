/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import com.gp2.data.CreationDataLocal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cdi314
 */
public class DonneesCreateCtrl implements SousControleur{
    
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        CreationDataLocal creationData = lookupCreationDataLocal();
        
        try {
                creationData.creerDonnees();
                request.setAttribute("dClasse", "info");
                request.setAttribute("msg", "données créées!");
            } catch (Exception ex) {
                ex.printStackTrace();
                request.setAttribute("dClasse", "erreur");
                request.setAttribute("msg", "echec de votre action");
            }

            return"/WEB-INF/home.jsp";
    
    }

    private CreationDataLocal lookupCreationDataLocal() {
        try {
            Context c = new InitialContext();
            return (CreationDataLocal) c.lookup("java:global/restaurant/restaurant-ejb/CreationData!com.gp2.data.CreationDataLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    
}
