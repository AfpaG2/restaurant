<%-- 
   Document   : index-1
    Created on : Jan 2, 2018, 8:34:56 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:directive.include file="/WEB-INF/menus/header.jsp" />

<!--==============================Content=================================-->

<div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
    <div class="container_12">
        <div class="grid_12">
            <h3 class="head2">Notre Carte</h3>
        </div>  

        <div class="tabs tb gallery">
            <div class="div-nav  ">
                <div class="grid_12">
                    <ul class="nav">
                        <li class="selected">
                            <c:url value="FrontControleur?section=carte&type=cocktail" var="urlCocktail" scope="session" />
                            <!--<a href="${urlCocktail}" class="">Cocktails</a>-->
                            <a href="#tab-1" class="">Cocktails</a>
                        </li>
                        <li>
                            <a href="#tab-2">Entrées</a>
                        </li>
                        <li>
                            <a href="#tab-3">Plats</a>
                        </li>
                        <li>
                            <a href="#tab-4">Sauces</a>
                        </li>
                        <li>
                            <a href="#tab-5">Desserts</a>
                        </li>
                        <li>
                            <a href="#tab-6">Formules</a>
                        </li>
                    </ul>
                </div>    
            </div>
            <div class="div-tabs">
                <div  id="tab-1" class="tab-content gallery1">
                    <c:forEach items="${cocktails}" var="cocktail">
                        <div class="grid_3">
                            <a href="images/${cocktail.image}" class="gal">
                                <img src="images/${cocktail.image}" alt="">
                                <span></span>
                            </a>

                            <div class="col2">
                                <span class="col3">
                                    <a href="#">${cocktail.nomProduit}</a>
                                </span> <br>Prix : 
                                <fmt:setLocale value="fr_FR" scope="session" />
                                <fmt:formatNumber value="${cocktail.prixTTC}" type="currency" />
                            </div>
                            <div class="col2">
                                <a href="FrontControleur?section=panier-operations&origine=catalogue&action=add&ref=${cocktail.id}" class="button">Ajouter au Panier</a>
                            </div>
                        </div>

                    </c:forEach>
                </div>

                <div  id="tab-2" class="tab-content gallery2">

                    <div class="clear"></div>
                    <c:forEach items="${entrees}" var="entree">
                        <div class="grid_3">
                            <a href="images/${entree.image}" class="gal">
                                <img src="images/${entree.image}" alt="">
                                <span></span>
                            </a>

                            <div class="col2">
                                <span class="col3">
                                    <a href="#">${entree.nomProduit}</a>
                                </span> <br>Prix : 
                                <fmt:setLocale value="fr_FR" scope="session" />
                                <fmt:formatNumber value="${entree.prixTTC}" type="currency" />
                            </div>
                            <h4>
                                <a href="FrontControleur?section=panier-operations&origine=catalogue&action=add&ref=${entree.id}" class="button">Ajouter au Panier</a>
                            </h4>
                        </div>

                    </c:forEach>
                </div>

                <div  id="tab-3" class="tab-content gallery3">
                    <c:forEach items="${plats}" var="plat">
                        <div class="grid_3">
                            <a href="images/${plat.image}" class="gal">
                                <img src="images/${plat.image}" alt="">
                                <span></span>
                            </a>

                            <div class="col2">
                                <span class="col3">
                                    <a href="#">${plat.nomProduit}</a>
                                </span> <br>Prix : 
                                <fmt:setLocale value="fr_FR" scope="session" />
                                <fmt:formatNumber value="${plat.prixTTC}" type="currency" />
                            </div>
                            <h4>
                                <a href="FrontControleur?section=panier-operations&origine=catalogue&action=add&ref=${plat.id}" class="button">Ajouter au Panier</a>
                            </h4>
                        </div>

                    </c:forEach>

                </div>

                <div  id="tab-4" class="tab-content gallery4">

                    <div class="grid_3">
                        <a href="images/big2.jpg" class="gal"><img src="images/page3_img2.jpg" alt=""><span></span></a>
                        <div class="col2"><span class="col3"><a href="#">Phasellus erat </a></span> $ 21.99</div>
                    </div>
                    <div class="grid_3">
                        <a href="images/big3.jpg" class="gal"><img src="images/page3_img3.jpg" alt=""><span></span></a>
                        <div class="col2"><span class="col3"><a href="#">Kneras facilisis </a></span> $ 23.90</div>
                    </div>
                    <div class="grid_3">
                        <a href="images/big4.jpg" class="gal"><img src="images/page3_img4.jpg" alt=""><span></span></a>
                        <div class="col2"><span class="col3"><a href="#">Dert facilis</a></span> $ 25.30</div>
                    </div>
                    <div class="grid_3">
                        <a href="images/big5.jpg" class="gal"><img src="images/page3_img5.jpg" alt=""><span></span></a>
                        <div class="col2"><span class="col3"><a href="#">Destro fetolis </a></span> $ 10.99</div>
                    </div>

                </div>

                <div  id="tab-5" class="tab-content gallery5">
                    <c:forEach items="${desserts}" var="dessert">
                        <div class="grid_3">
                            <a href="images/${dessert.image}" class="gal">
                                <img src="images/${dessert.image}" alt="">
                                <span></span>
                            </a>

                            <div class="col2">
                                <span class="col3">
                                    <a href="#">${dessert.nomProduit}</a>
                                </span> 
                                <br>Prix : 
                                <fmt:setLocale value="fr_FR" scope="session" />
                                <fmt:formatNumber value="${dessert.prixTTC}" type="currency" /> 
                            </div>
                            <h4>
                                <a href="FrontControleur?section=panier-operations&origine=catalogue&action=add&ref=${dessert.id}" class="button">Ajouter au Panier</a>
                            </h4>
                        </div>

                    </c:forEach>
                </div>
                <div  id="tab-6" class="tab-content gallery6">
                    <c:forEach items="${formules}" var="formule">
                        <div class="grid_3">
                            <a href="images/${formule.image}" class="gal">
                                <img src="images/${formule.image}" alt="">
                                <span></span>
                            </a>

                            <div class="col2">
                                <span class="col3">
                                    <a href="#">${formule.nomFormul}
                                    <br>    
                                    ${formule.descrpition}</a>
                                </span> 
                                <br>Prix : 
                                <fmt:setLocale value="fr_FR" scope="session" />
                                <fmt:formatNumber value="${formule.prixTTC}" type="currency" /> 
                            </div>
                            <h4>
                                <a href="FrontControleur?section=catalogue&category=formule&ref=${formule.id}" class="button">Ajouter au Panier</a>
                            </h4>
                        </div>

                    </c:forEach>

                </div>

            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {

        $().UItoTop({easingType: 'easeOutQuart'});
        $('.gallery a.gal').touchTouch();

    });
</script>

<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
