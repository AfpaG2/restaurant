<%-- 
    Document   : nav
    Created on : Dec 19, 2017, 10:29:45 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<nav class="products-main">
    <ul class="lft">
        <li>
            <a href="/produits/menus">
                <img src="/image/layout_icon?img_id=11849" alt="NOS MENUS">
                NOS Formules
            </a>
        </li>

        <li>
            <a href="/produits/burgers">
                <img src="/image/layout_icon?img_id=304901" alt="NOS BURGERS">
                NOS COCKTAILS
            </a>
        </li>

        <li>
            <c:url value="FrontControleur?section=affichage-carte&type=entree" var="urlEntree" />
            <a href="${urlEntree}">
                <img src="/image/layout_icon?img_id=11855" alt="NOS ENTREE">
                NOS ENTREES
            </a>

        </li>

        <li>
             <c:url value="FrontControleur?section=affichage-carte&type=plat" var="urlPlat" />
             <a href="${urlPlat}">
                <!--<img src="/images/layout_icon?img_id=11860" alt="NOS PLATS">-->
                <img src="/images/icon/plat-icon.jpg" alt="NOS PLATS">
                NOS PLATS
            </a>
        </li>

        <li>
            <c:url value="FrontControleur?section=affichage-carte&type=dessert" var="urlDessert" />
            <a href="${urlDessert}">
                <img src="/image/layout_icon?img_id=11870" alt="NOS DESSERTS">
                NOS DESSERTS
            </a>
        </li>

        <li>
            <c:url value="FrontControleur?section=affichage-carte&type=sauce" var="urlSauce" />
            <a href="${urlSauce}">
                <img src="/image/layout_icon?img_id=11875" alt="NOS FRITES &amp; SAUCES">
                NOS FRITES &amp; SAUCES
            </a>
        </li>

        <li>
            <a href="/commande/restaurant">
                <img src="/image/layout_icon?img_id=234650" alt="COMMANDE EN LIGNE">
                COMMANDE EN LIGNE
            </a>
        </li>
    </ul>
</nav>