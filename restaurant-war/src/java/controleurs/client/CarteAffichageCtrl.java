package controleurs.client;

import com.gp2.persistence.carte.Produit;
import com.gp2.metiers.GestionCatalogueLocal;
import controleurs.SousControleur;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Ibrahim Kelani <ibrahim.kelani@gmail.com>
 */
public class CarteAffichageCtrl implements SousControleur {

    private static final long serialVersionUID = 1L;

    int offset;
    int longueur;

    @Override
    public String executer(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();

        GestionCatalogueLocal gestionCatalogue = lookupGestionCatalogueLocal();

        // Gestion de la pagination
        int maxEntriesPerPage = 5;
        int pageNumber = 1;

        String pageNumberValue = request.getParameter("pageNumber");

        if (pageNumberValue != null) {
            try {
                pageNumber = Integer.parseInt(pageNumberValue);
                System.out.println("Page Number : " + pageNumber);

            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }
        }

        this.offset = maxEntriesPerPage * (pageNumber - 1);
        this.longueur = maxEntriesPerPage;

//        request.setAttribute("typePlat", StringUtils.capitalize(request.getParameter("type")));
//        request.setAttribute("typePlat", "salut");

        request.setAttribute("cocktails", gestionCatalogue.findAllProduitsByTypePlat("COCKTAILS"));
        request.setAttribute("entrees", gestionCatalogue.findAllProduitsByTypePlat("ENTREES"));
        request.setAttribute("plats", gestionCatalogue.findAllProduitsByTypePlat("PLATS"));
        request.setAttribute("desserts", gestionCatalogue.findAllProduitsByTypePlat("DESSERTS"));
        request.setAttribute("sauces", gestionCatalogue.findAllProduitsByTypePlat("SAUCES"));
        // request.setAttribute("formules", gestionCatalogue.findAllProduitsByTypePlat("FORMULES"));

        String page = "/WEB-INF/pages/carte.jsp";
        return page;
    }

    /**
     * @return List
     */
    public ArrayList getListByOffsetAndLength(List result) {
        ArrayList arrayList = new ArrayList();

        int to = this.offset + this.longueur;

        if (this.offset > result.size()) {
            this.offset = result.size();
        }

        if (to > result.size()) {
            to = result.size();
        }

        for (int i = this.offset; i < to; i++) {
            arrayList.add(result.get(i));
        }

        return arrayList;
    }

    /**
     * @return List with page numbers
     *
     */
    public List getPages(List result) {

        List pageNumbers = new ArrayList();

        int pages = result.size() / this.longueur;

        if (result.size() % this.longueur != 0) {
            pages += 1;
        }

        for (int i = 1; i < pages; i++) {
            pageNumbers.add(new Integer(i));
        }

        return pageNumbers;
    }

    private GestionCatalogueLocal lookupGestionCatalogueLocal() {
        try {
            Context c = new InitialContext();
            return (GestionCatalogueLocal) c.lookup("java:global/restaurant/restaurant-ejb/GestionCatalogue!com.gp2.metiers.GestionCatalogueLocal");
        } catch (NamingException ne) {
            java.util.logging.Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}
