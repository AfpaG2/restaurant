package controleurs.client;

import com.gp2.metiers.GestionEmplacementLocal;
import com.gp2.persistence.commande.Emplacement;
import controleurs.SousControleur;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ibrahim KELANI <ibrahim.kelani@gmail.com>
 */
public class EmplacementAffichageCtrl implements SousControleur {

    GestionEmplacementLocal gestionEmplacement = lookupGestionEmplacementLocal();
    private static final long serialVersionUID = 1L;
    
    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        
        
        String section = request.getParameter("section");
        
        if ("salle".equals(section)) {
            
            List<Emplacement> emplacements = gestionEmplacement.findAllTables();
            
            request.setAttribute("emplacements", emplacements);
            // System.out.println(gestionEmplacement.findAllTablessByStatut(6001));
            // System.out.println(gestionEmplacement.findTableByNum("seat1A"));
        }
        
        return "/WEB-INF/pages/salle.jsp";        
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
