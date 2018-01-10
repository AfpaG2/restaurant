<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:directive.include file="/WEB-INF/menus/header.jsp" /> 

<!--==============================Content=================================-->

<div class="content">
    <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2017!</div>

    <a href="${carte}" class="block1">
        <img src="images/pates-de-riz-sautees-aux-legumes.jpg" alt="Pates aux Legumes">
        <span class="price">
            <span>${patesLegumes.nomProduit}</span>
            <span> 
                <fmt:setLocale value="fr_FR" scope="session" />
                <fmt:formatNumber value="${patesLegumes.prix}" type="currency" />
            </span>
            <strong></strong>
        </span>
    </a>
    <a href="${carte}" class="block1">
        <img src="images/pates-de-riz-sautees-au-poulet.jpg" alt="Pates au poulet">
        <span class="price">
            <span>${patesPoulet.nomProduit}</span>
            <span>
                <fmt:setLocale value="fr_FR" scope="session" />
                <fmt:formatNumber value="${patesPoulet.prix}" type="currency" />
            </span><strong></strong>
        </span>
    </a>
    <a href="${carte}" class="block1">
        <img src="images/riz-cantonnais-long.jpg" alt="Riz cantonnais">
        <span class="price">
            <span>${rizCantonnais.nomProduit}</span>
            <span>
                <fmt:setLocale value="fr_FR" scope="session" />
                <fmt:formatNumber value="${rizCantonnais.prix}" type="currency" />
            </span><strong></strong>
        </span>
    </a>

    <div class="container_12">
        <div class="grid_12" style="padding-bottom: 3em; text-align: center">
            <h3>Nos Nouvelles Spécialités Maison</h3>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/${saladeLotus.image}" alt="">
                <div class="title">${saladeLotus.nomProduit}</div>
                
                <h4>Ingredients</h4>
                
                <c:forEach items="${saladeLotus.ingredients}" var="ingredient" begin="0" end="7" step="1">
                    <span>${ingredient.nomIngredient}, </span>
                </c:forEach> ...
                <br>
                <a href="#">Plus d'infos</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/${saladeCalamar.image}" alt="">
                <div class="title">${saladeCalamar.nomProduit}</div>
                
                <h4>Ingredients</h4>
                
                <c:forEach items="${saladeCalamar.ingredients}" var="ingredient" begin="0" end="5" step="1">
                    <span>${ingredient.nomIngredient}, </span>
                </c:forEach> ...
                <br>
                <a href="#">Plus d'infos</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/${rizGluantTaro.image}" alt="">
                <div class="title">${rizGluantTaro.nomProduit}</div>
                
                <h4>Ingredients</h4>
                <c:forEach items="${rizGluantTaro.ingredients}" var="ingredient" begin="0" end="5" step="1">
                    <span>${ingredient.nomIngredient}, </span>
                </c:forEach> ...
                <br>
                <a href="#">Plus d'infos</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/${phoLegumes.image}" alt="">
                <div class="title">${phoLegumes.nomProduit}</div>
                
                <h4>Ingredients</h4>
                <c:forEach items="${phoLegumes.ingredients}" var="ingredient" begin="0" end="3" step="1">
                    <span>${ingredient.nomIngredient}, </span>
                </c:forEach> ...
                <br>
                <a href="#">Plus d'infos</a>
            </div>
        </div>
    </div>
</div>

<script>
    $(document).ready(function () {
        $(".block1").mouseover(function () {
            $(this).addClass("blur");
        });
        $(".block1").mouseout(function () {
            $(this).removeClass("blur");
        });
        $().UItoTop({easingType: 'easeOutQuart'});
    });
</script>

<%@include file="/WEB-INF/menus/newfooter.jsp" %>

