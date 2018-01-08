<%-- 
    Document   : index-1
    Created on : Jan 2, 2018, 8:34:56 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                <ol class="seats">

                    <!-- Partie de Gauche -->

                    <li class="seat">
                        <input type="checkbox" id="1A" name="seat1A"/>
                        <label for="1A">1A</label>
                    </li>

                    <li class="seat">
                        <input type="checkbox" id="1B" name="seat1B"/>
                        <label for="1B">1B</label>
                    </li>

                </ol>

                <ol class="seats">

                    <li class="seat">
                        <input type="checkbox" id="1C" name="seat1C"/>
                        <label for="1C">1C</label>
                    </li>

                    <li class="seat">
                        <input type="checkbox" id="1D" name="seat1D"/>
                        <label for="1D">1D</label>
                    </li>

                </ol>

                <ol class="seats">

                    <!-- Partie de droite haute -->

                    <li class="seat">
                        <input type="checkbox" id="2A" name="seat2A"/>
                        <label for="2A">2A</label>
                    </li>

                    <li class="seat">
                        <input type="checkbox" id="2C" name="seat2C"/>
                        <label for="2C">2C</label>
                    </li>

                </ol>

                <ol class="seats">
                    <li class="seat">
                        <input type="checkbox" id="2B" name="seat2B"/>
                        <label for="2B">2B</label>
                    </li>

                    <li class="seat">
                        <input type="checkbox" id="2D" name="seat2D"/>
                        <label for="2D">2D</label>
                    </li>

                </ol>

                <ol class="seats">
                    <!-- Partie de droite basse -->

                    <li class="seat">
                        <input type="checkbox" id="3A" name="seat3A"/>
                        <label for="3A">3A</label>
                    </li>

                    <li class="seat">
                        <input type="checkbox" id="3C" name="seat3C"/>
                        <label for="3C">3C</label>
                    </li>

                </ol>

                <ol class="seats">
                    <li class="seat">
                        <input type="checkbox" id="3B" name="seat3B"/>
                        <label for="3B">3B</label>
                    </li>

                    <li class="seat">
                        <input type="checkbox" id="3D" name="seat3D"/>
                        <label for="3D">3D</label>
                    </li>
                </ol>

                <input class="tableSelectionne" type="submit" name="submit" value="Valider votre sélection de Tables" />
            </form>
        </div>

        <div class="grid_8">
            <h3>Reserver Votre Table</h3>
            <img src="images/page5_img1.jpg" alt="" class="img_inner fleft">
            <div class="extra_wrapper">
                <p class="col1">Hoivamus at magna non nunc tristiquencus. Fliquam nibh ante, egestas id dictum modo luctus libero. Praesent faucibus malesuad faucibu. </p>
                <p>Dorem ipsum dolor sit amet, consecteturer adipiscing elit. Nullam consectetur orci se nulla facilisis consequat. Kurabitur vellore sit amet nulla ullamcorper ermentum. In vitae varius auguem.</p>
            </div>
            <p>Gamus at magna non nunc tristique rhoncus. Aliquam nibh ante, egestas id dictum ammodo luctus libero. Praesent faucibus malesuada faucibus. Forem ipsum dolor sit ametconsectetur adipiscing elit. <span class="cont_phone">For Parties call (023) 101-1100</span> . Nullam  consectetur orci sed. </p>
            Murabitur vel lorem sit amet nulla ullamcorper fermentum. In vitae varius augue, eu consectetur ligula. Etiam dui eros. <span class="cont_phone">For Parties call (023) 101-1100</span> <br>
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
                    <p class="col1"><a href="#">Saint-Valentin<br>A ne pas manquer ! </a></p>En amoureux, plusieurs surprises vous attendent. <br>Plus d'infos chez <a href=#>Minh Thuong</a>
                </div>
            </div>
            <div class="news">
                <time datetime="2018-04-02">Avril<span>02</span></time>
                <div class="extra_wrapper">
                    <p class="col1"><a href="#">Joyeuses Pâques</a></p>Venez fêter avec nous, plusieurs avantages et réductions. <br>Plus d'infos chez <a href=#>Minh Thuong</a>
                </div>
            </div>
        </div>
    </div>
</div>



<script>
    $(document).ready(function () {

        $().UItoTop({easingType: 'easeOutQuart'});
    });
</script>

<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
