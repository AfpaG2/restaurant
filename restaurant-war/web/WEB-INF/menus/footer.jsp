<%-- 
    Document   : footer
    Created on : Dec 17, 2017, 9:25:20 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>


<footer role="contentinfo" class="not-printable">
    <div class="header">
        <div class="site">
            <a href="#" class="logo">MinhThuong France</a>
            <section>
                <nav>
                    <ul>
                        <li><a href="https://www.minh-thuong.fr/faq">FAQ</a></li>
                        <li><a href="https://www.minh-thuong.fr/contacts">CONTACT</a></li>
                        <li><a href="https://www.minh-thuong.fr/mentions-legales">MENTIONS LEGALES</a></li>
                        <li><a href="https://www.minh-thuong.fr/cgu-mes-avantages">CGU FID�LIT�</a></li>
                        <li><a href="https://www.minh-thuong.fr/cgv">CGV COMMANDE EN LIGNE</a></li>
                    </ul>
                </nav>
            </section>
        </div>
    </div>






    <nav class="site">
        <div class="block">
            <h4>NOS PRODUITS</h4>
            <ul class="menu">
                <li>
                    <a href="/produits/menus">Nos formules</a>
                </li>
                
                <li>
                    <c:url value="FrontControleur?section=affichage-carte&type=cocktail" var="urlCocktail" />
                    <a href="${urlCocktail}">Nos cocktails</a>
                </li>
                
                <li>
                    <c:url value="FrontControleur?section=affichage-carte&type=entree" var="urlEntree" />
                    <a href="${urlEntree}">Nos entr�es</a>
                </li>
                
                <li>
                    <c:url value="FrontControleur?section=affichage-carte&type=plat" var="urlPlat" />
                    <a href="${urlPlat}">Nos plats</a>
                </li>
                
                <li>
                    <c:url value="FrontControleur?section=affichage-carte&type=dessert" var="urlDessert" />
                    <a href="${urlDessert}">Nos d�sserts</a>
                </li>
                
                <li>
                    <c:url value="FrontControleur?section=affichage-carte&type=sauce" var="urlSauce" />
                    <a href="${urlSauce}">Nos sauces</a>
                </li>

            </ul>
        </div>
        <div class="block">
            <h4>NOS ACTUALIT�S</h4>
            <ul class="menu">
                <li>
                    <a href="/actualites">En ce moment</a>
                </li>

            </ul>
        </div>

        <div class="block">
            <h4>VOTRE RESTAURANT</h4>
            <ul class="menu">

                <li>
                    <a href="/restaurant/espaces-mccafe">Chez Minh-Thuong</a>
                </li>
                <li>
                    <a href="/restaurant/services">Les services</a>
                </li>
            </ul>
        </div>
        <div class="block">
            <h4>L'ENTREPRISE</h4>
            <ul class="menu">
                <li>
                    <a href="/entreprise/qui-sommes-nous">Qui sommes-nous ?</a>
                </li>

                <li>
                    <a href="/espace-presse/actualites">Espace presse</a>
                </li>

                <li>
                    <a href="/entreprise/qualite-mcdonald-s">La qualit�</a>
                </li>

                <li>
                    <a href="/entreprise/nutrition/nutrition-chez-minh-thuong">La nutrition</a>
                </li>

            </ul>
        </div>

        <div class="clear"></div>
    </nav>
    <div class="footer">
        <div class="site">
            <ul class="ticker">
                <li style="display: none;">
                    <p></p><p>
                        Pour votre sant�, �vitez de manger trop gras, trop sucr�, trop sal�. <a href="http://www.mangerbouger.fr">www.mangerbouger.fr</a></p>
                    <p></p>
                </li>
                <li style="display: none;">
                    <p></p><p>
                        Pour votre sant�, mangez au moins cinq fruits et l�gumes par jour. <a href="http://www.mangerbouger.fr">www.mangerbouger.fr</a></p>
                    <p></p>
                </li>
                
                <li style="display: list-item;" id="pratiquerSport">
                    <p></p><p>
                        Pour votre sant�, pratiquez une activit� physique r�guli�re. <a href="http://www.mangerbouger.fr">www.mangerbouger.fr</a></p>
                    <p></p>
                </li>
                
                <li style="display: none;">
                    Pour votre sant�, �vitez de grignoter entre les repas. <a href="http://www.mangerbouger.fr">www.mangerbouger.fr</a>
                </li>
                
                <li id="minhDev">
                    <p></p><p>
                    @ Copyright MinhThuong FRANCE 2017, created by MinhDev.
                    <p></p>
                </li>
            </ul>
        </div>
        
        <div>
            
        </div>
</footer>