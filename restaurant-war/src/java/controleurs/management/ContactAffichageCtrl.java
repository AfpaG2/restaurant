/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controleurs.management;

import com.gp2.metiers.GestionPersonnelLocal;
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
public class ContactAffichageCtrl implements SousControleur {

    private static final long serialVersionUID = 1L;


    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        GestionPersonnelLocal gestionPersonnel = lookupGestionPersonnelLocal();
        
        return "/WEB-INF/pages/contact.jsp";
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
