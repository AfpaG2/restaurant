<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:directive.include file="WEB-INF/menus/header.jsp" /> 

<!--==============================Content=================================-->

<div class="content">
    <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2017!</div>

    <a href="${carte}" class="block1">
        <img src="images/${patesLegumes.image}" alt="Pates aux Legumes">
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
        <img src="images/${patesPoulet.image}" alt="Pates au poulet">
        <span class="price">
            <span>${patesPoulet.nomProduit}</span>
            <span>
                <fmt:setLocale value="fr_FR" scope="session" />
                <fmt:formatNumber value="${patesPoulet.prix}" type="currency" />
            </span><strong></strong>
        </span>
    </a>
    <a href="${carte}" class="block1">
        <img src="images/${rizCantonnais.image}" alt="Riz cantonnais">
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
                <img src="images/box_img1.jpg" alt="">
                <div class="title">Lorem Ipsum</div>
                Integer convallis orci vel mi nelaoreet, at ornare lorem consequat. Phasellus era nisl auctor vel veliterol. 
                <br>
                <a href="#">Plus d'infos</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/box_img2.jpg" alt="">
                <div class="title">Aliquamh ante</div>
                Benteger convallis orci veli elaoreet, at ornare loremo konsequat. Phasellus era nisl auctor vel veliterut. 
                <br>
                <a href="#">Plus d'infos</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/box_img3.jpg" alt="">
                <div class="title">Ulum volutpat</div>
                Hrtolieger convallis omi tem aore, at ornare loren coate. Pasellus era nisl auctor vel veliterolsed pharetra. 
                <br>
                <a href="#">Plus d'infos</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/box_img4.jpg" alt="">
                <div class="title">Vestibulum volu</div>
                Convallis orci vel mi oreet, at kotornare lorem consequat. Sellus era nisl auctor vel veliterolvenenatis nulla. 
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

<%@include file="WEB-INF/menus/newfooter.jsp" %>

