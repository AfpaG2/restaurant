
package controleurs;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface SousControleur extends Serializable{
    public String executer(HttpServletRequest request, HttpServletResponse response); 
}
