<%-- 
    Document   : index
    Created on : Dec 28, 2017, 5:40:13 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <jsp:directive.include file="/restaurant-war/WEB-INF/menus/header.jsp" /> --%>

<!DOCTYPE html>
<html>
    <head>
        <title>Accueil</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="/restaurant-war/images/favicon.ico">
        <link rel="shortcut icon" href="/restaurant-war/images/favicon.ico" />
        <link rel="stylesheet" href="/restaurant-war/css/style.css">
        
        <script src="/restaurant-war/js/jquery.js"></script>
        <script src="/restaurant-war/js/jquery-migrate-1.1.1.js"></script>
        <script src="/restaurant-war/js/jquery.equalheights.js"></script>
        <script src="/restaurant-war/js/jquery.ui.totop.js"></script>
        <script src="/restaurant-war/js/jquery.easing.1.3.js"></script>
        
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
        
    </head>
    
    <body class="page1">

        <!--==============================header=================================-->
        <header> 
            <div class="container_12">
                <div class="grid_12"> 
                    <div class="socials">
                        <a href="#"></a>
                        <a href="#"></a>
                        <a href="#"></a>
                        <a href="#" class="last"></a>
                    </div>
                    
                    <div style="position: relative; ">
                        
                        <c:url value="FrontControleur?section=accueil" var="accueil" scope="session"/>
                        <!--<a href="/restaurant-war/index.jsp">-->
                        <a href="${accueil}">
                            <img src="/restaurant-war/images/icon/Restaurant Minh Thuong.png" alt="Restaurant Minh Thuong" style="position: absolute; top: -100px; left:-20%; width: 290px">
                        </a>
                        
                        <a href="${accueil}">
                            <img src="/restaurant-war/images/logo.png" alt="Boo House" style="position: relative; left: 27%">
                        </a> 
                    </div>
                            
                    <!--<h1><a href="index.html"><img src="/restaurant-war/images/logo.png" alt="Boo House"></a> </h1>-->
                    <div class="menu_block">
                        <nav id="bt-menu" class="bt-menu">

                            <a href="#" class="bt-menu-trigger"><span>Menu</span></a>

                            <ul>
                                <li class="current bt-icon ">
                                    <a href="${accueil}">Accueil</a>
                                </li>
                                <%-- <li class="bt-icon"><a href="/restaurant-war/WEB-INF/pages/index-1.jsp">About</a></li> --%>
                                
                                <li class="bt-icon">
                                    <c:url value="FrontControleur?section=equipe" var="equipe" />
                                    <a href="${equipe}">Equipe</a>
                                </li>
                                
                                <li class="bt-icon">
                                    <c:url value="FrontControleur?section=carte" var="carte" />
                                    <a href="${carte}">Carte</a>
                                </li>
                                
                                <li class="bt-icon">
                                    <c:url value="FrontControleur?section=blog" var="blog" />
                                    <a href="${blog}">Blog</a>
                                </li>
                                
                                <li class="bt-icon">
                                    <c:url value="FrontControleur?section=salle" var="salle" />
                                    <a href="${salle}">Gestion Salle</a>
                                </li>
                                
                                <li class="bt-icon">
                                    <c:url value="FrontControleur?section=contact" var="contact" />
                                    <a href="${contact}">Contacts</a>
                                </li>
                            </ul>
                        </nav>

                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </header>


<!--==============================Content=================================-->

<div class="content">
    <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2017!</div>
    <a href="index-2.html" class="block1">
        <img src="images/blur_img1.jpg" alt="">
        <span class="price"><span>magna non nunc</span><span><small>$</small> 29.35</span><strong></strong></span>
    </a>
    <a href="index-2.html" class="block1">
        <img src="images/blur_img2.jpg" alt="">
        <span class="price"><span>terto nomino</span><span><small>$</small> 35.45</span><strong></strong></span>
    </a>
    <a href="index-2.html" class="block1">
        <img src="images/blur_img3.jpg" alt="">
        <span class="price"><span>metus feugiat</span>
            <span><small>$</small> 50.10</span><strong></strong></span>
    </a>

    <div class="container_12">
        <div class="grid_12">
            <h3>Nos Nouvelles Spécialités Maison</h3>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/box_img1.jpg" alt="">
                <div class="title">Lorem Ipsum</div>
                Integer convallis orci vel mi nelaoreet, at ornare lorem consequat. Phasellus era nisl auctor vel veliterol. 
                <br>
                <a href="#">More Info</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/box_img2.jpg" alt="">
                <div class="title">Aliquamh ante</div>
                Benteger convallis orci veli elaoreet, at ornare loremo konsequat. Phasellus era nisl auctor vel veliterut. 
                <br>
                <a href="#">More Info</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/box_img3.jpg" alt="">
                <div class="title">Ulum volutpat</div>
                Hrtolieger convallis omi tem aore, at ornare loren coate. Pasellus era nisl auctor vel veliterolsed pharetra. 
                <br>
                <a href="#">More Info</a>
            </div>
        </div>
        <div class="grid_3">
            <div class="box maxheight">
                <img src="images/box_img4.jpg" alt="">
                <div class="title">Vestibulum volu</div>
                Convallis orci vel mi oreet, at kotornare lorem consequat. Sellus era nisl auctor vel veliterolvenenatis nulla. 
                <br>
                <a href="#">More Info</a>
            </div>
        </div>
    </div>
</div>

<%--<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />--%>

<%@include file="WEB-INF/menus/newfooter.jsp" %>

