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

        <!--
        <div class="grid_12" style="text-align: center">
            <h3>Sélectionnez votre table</h3> 
            <p class="col1">En appuyant sur les numéros tables disponibles en salle (Tables en vert)</p>
            <img id="minhThuongSalle" src="images/minh-thuong-salle-transparent-background.png" alt="Plan Restaurant Minh Thuong"  width="740" height="740" style="background: url(images/minh-thuong-resto.png) -228px -324px;" >
        </div>
        -->

        <h3 style="margin-left: 4.5rem">Sélectionnez votre table</h3> 
        <p class="col1" style="font:  27px/27px 'Open Sans', sans-serif; margin-left: 5rem">
            Les tables encore disponibles sont en vert.
        </p>

        <div class="grid_12" style="background: white url(images/minh-thuong-resto.png) -228px -324px; width: 750px; height: 750px; margin-bottom: 3rem">

            <c:url value="FrontControleur?section=accueil" var="accueil" />
            <form class="seatForm" method="GET" action="${accueil}" accept-charset="UTF-8">

                <c:forEach items="${emplacements}" var="emplacement" >
                    <c:if test="${emplacement.numeroTable eq 'seat1A' || emplacement.numeroTable eq 'seat1B' }">

                        <!-- Partie de Gauche -->
                        <c:if test="${emplacement.numeroTable eq 'seat1A'}">
                            <ol class="seats">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="1A" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="1A" name="${emplacement.numeroTable}" disabled="disabled"/> 
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="1A">1A</label>
                                </li>
                            </c:if>

                            <c:if test="${emplacement.numeroTable eq 'seat1B'}">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="1B" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="1B" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="1B">1B</label>
                                </li>
                            </ol>
                        </c:if>

                    </c:if>
                </c:forEach>

                <c:forEach items="${emplacements}" var="emplacement" >
                    <c:if test="${emplacement.numeroTable eq 'seat1C' || emplacement.numeroTable eq 'seat1D' }">
                        <!-- Partie de Gauche -->
                        <c:if test="${emplacement.numeroTable eq 'seat1C'}">

                            <ol class="seats">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="1C" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="1C" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="1C">1C</label>
                                </li>
                            </c:if>

                            <c:if test="${emplacement.numeroTable eq 'seat1D'}">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="1D" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="1D" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="1D">1D</label>
                                </li>
                            </ol>
                        </c:if>

                    </c:if>
                </c:forEach>  

                <c:forEach items="${emplacements}" var="emplacement" >
                    <c:if test="${emplacement.numeroTable eq 'seat2A' || emplacement.numeroTable eq 'seat2C' }">
                        <!-- Partie de droite haute -->
                        <c:if test="${emplacement.numeroTable eq 'seat2A'}">
                            <ol class="seats">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="2A" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="2A" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="2A">2A</label>
                                </li>
                            </c:if>

                            <c:if test="${emplacement.numeroTable eq 'seat2C'}">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="2C" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="2C" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="2C">2C</label>
                                </li>
                            </ol>
                        </c:if>

                    </c:if>
                </c:forEach>

                <c:forEach items="${emplacements}" var="emplacement" >
                    <c:if test="${emplacement.numeroTable eq 'seat2B' || emplacement.numeroTable eq 'seat2D' }">
                        <!-- Partie de droite haute -->
                        <c:if test="${emplacement.numeroTable eq 'seat2B'}">
                            <ol class="seats">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="2B" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="2B" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="2B">2B</label>
                                </li>
                            </c:if>

                            <c:if test="${emplacement.numeroTable eq 'seat2D'}">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="2D" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="2D" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="2D">2D</label>
                                </li>
                            </ol>
                        </c:if>

                    </c:if>
                </c:forEach>


                <c:forEach items="${emplacements}" var="emplacement" >
                    <c:if test="${emplacement.numeroTable eq 'seat3A' || emplacement.numeroTable eq 'seat3C' }">
                        <!-- Partie de droite basse -->
                        <c:if test="${emplacement.numeroTable eq 'seat3A'}">
                            <ol class="seats">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="3A" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="3A" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="3A">3A</label>
                                </li>
                            </c:if>

                            <c:if test="${emplacement.numeroTable eq 'seat3C'}">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="3C" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="3C" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="3C">3C</label>
                                </li>
                            </ol>
                        </c:if>

                    </c:if>
                </c:forEach>

                <c:forEach items="${emplacements}" var="emplacement" >
                    <c:if test="${emplacement.numeroTable eq 'seat3B' || emplacement.numeroTable eq 'seat3D' }">
                        <!-- Partie de droite basse -->
                        <c:if test="${emplacement.numeroTable eq 'seat3B'}">
                            <ol class="seats">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="3B" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="3B" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="3B">3B</label>`
                                </li>
                            </c:if>

                            <c:if test="${emplacement.numeroTable eq 'seat3D'}">
                                <li class="seat">
                                    <c:choose>
                                        <c:when test="${emplacement.statut.id == 6001}">
                                            <input type="checkbox" id="3D" name="${emplacement.numeroTable}"/>
                                        </c:when>
                                        <c:otherwise>
                                            <input type="checkbox" id="3D" name="${emplacement.numeroTable}" disabled="disabled"/>
                                        </c:otherwise>
                                    </c:choose>

                                    <label for="3D">3D</label>
                                </li>
                            </ol>
                        </c:if>

                    </c:if>
                </c:forEach>

                <input class="tableSelectionne" type="submit" name="submit" value="Valider votre sélection de Tables" />
            </form>
        </div>

        <div class="grid_8">
            <h3>Reserver Votre Table</h3>
            <img src="images/page5_img1.jpg" alt="" class="img_inner fleft">
            <div class="extra_wrapper">
                <p class="col1">Un voyage culinaire au coeur du continent Asiatique ? Venez découvrir les saveurs de la cuisine vietnamienne notamment son copieux Bo-Bun, ses nems aux crevettes et ses parfums délicats de coco et citronnelle, la cuisine chinoise et ses délicieuses nouilles sautées, ou encore, la fraîcheur des sushis japonais (à venir) … </p>
                <p>Selon vos préférences, choisissez parmi notre sélection à la carte ou suivant des formules concoctées par nos Chefs étoilés.</p>
            </div>
            <p>Ce ne sont que des exemples de plats que vous découvrirez dans votre restaurant <a class="col1" href="#">Minh-Thuong</a>.</p> <p>Pleins d'autres surpises vous y attendent! </p>
            <p>LE PLUS – Les prix attractifs du restaurant Minh-Thuong et ses portions généreuses.. </p>
            <p><span class="cont_phone">Pour les soirées en groupe, appeler le (+33) 01.78.98.76.89</span></p>
            Les promotions sont également disponible en réservant sur <a class="col1" href="#">Minh-Thuong.fr</a> ou en appelant directement :<span class="cont_phone"> le (+33) 01.78.98.76.89</span> <br>
            <a href="#" class="reserv"><span>@ </span> Cliquez ici pour réserver en ligne</a>
        </div>

        <div class="grid_4">
            <div class="hours">
                <div class="title">Ouverture</div>
                <div>
                    Déjeuner<br>
                    Mardi - Samedi 11:45 - 14:30<br>
                    Brunch<br>
                    Dim. 10:30 - 14:00<br>
                    Cafe, Diner<br>
                    Dim. - Vend. 19:00 - 23:00<br>
                    Diner<br>
                    Samedi 18:30 pm - 23:00<br>
                </div>
            </div>
            <h3 class="head3">Nos actualités</h3>
            <div class="news">
                <time datetime="2018-02-14">Fév<span>14</span></time>
                <div class="extra_wrapper">
                    <p class="col1"><a href="#" class="col2">Saint-Valentin<br>A ne pas manquer ! </a></p>En amoureux, plusieurs surprises vous attendent. <br>Plus d'infos chez <a href=# class="col2">Minh Thuong</a>
                </div>
            </div>
            <div class="news">
                <time datetime="2018-04-02">Avril<span>02</span></time>
                <div class="extra_wrapper">
                    <p class="col1"><a href="#" class="col2">Joyeuses Pâques</a></p>Venez fêter avec nous, plusieurs avantages et réductions. <br>Plus d'infos chez <a href=# class="col2">Minh Thuong</a>
                </div>
            </div>
        </div>
    </div>

    <%@include file="/WEB-INF/menus/aide.jsp" %>
</div>



<script>
    $(document).ready(function () {

        $().UItoTop({easingType: 'easeOutQuart'});
    });
</script>

<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
