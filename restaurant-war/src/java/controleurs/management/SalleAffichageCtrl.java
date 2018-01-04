/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleurs.management;

import com.gp2.metiers.GestionEmplacementLocal;
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
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
public class SalleAffichageCtrl implements SousControleur {

    private static final long serialVersionUID = 1L;

    

    private GestionEmplacementLocal lookupGestionEmplacementLocal() {
        try {
            Context c = new InitialContext();
            return (GestionEmplacementLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionEmplacement!com.gp2.metiers.GestionEmplacementLocal");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        
        GestionEmplacementLocal gestionEmplacement = lookupGestionEmplacementLocal();
        
        return "/WEB-INF/pages/salle.jsp";
        
    }
    
    

}
