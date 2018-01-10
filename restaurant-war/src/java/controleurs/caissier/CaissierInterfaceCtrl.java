/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs.caissier;

import controleurs.SousControleur;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author youssef
 */
public class CaissierInterfaceCtrl implements SousControleur {

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        
        String page = "/WEB-INF/caissier/caissier.jsp";
       
        
        
        
        
        return page; 
    }
}
