<%-- 
    Document   : index-1
    Created on : Jan 2, 2018, 8:34:56 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Reservation</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="images/favicon.ico">
        <link rel="shortcut icon" href="images/favicon.ico" />
        <link rel="stylesheet" href="css/style.css">
        <script src="js/jquery.js"></script>
        <script src="js/jquery-migrate-1.1.1.js"></script>
        <script src="js/jquery.equalheights.js"></script>
        <script src="js/jquery.ui.totop.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script>
            $(document).ready(function () {

                $().UItoTop({easingType: 'easeOutQuart'});
            });
        </script>
        <!--[if lt IE 8]>
          <div style=' clear: both; text-align:center; position: relative;'>
            <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
              <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
            </a>
   
       <![endif]-->
        <!--[if lt IE 9]>
          <script src="js/html5shiv.js"></script>
          <link rel="stylesheet" media="screen" href="css/ie.css">
        <![endif]-->
        <!--[if lt IE 10]>
          <script src="js/html5shiv.js"></script>
          <link rel="stylesheet" media="screen" href="css/ie1.css">
        <![endif]-->

    </head>
    <body  class="">

        <!--==============================header=================================-->
        <header> 
            <div class="container_12">
                <div class="grid_12"> 
                    <div class="socials">
                        <a href="#"></a>
                        <a href="#"></a>
                        <a href="#"> </a>
                        <a href="#" class="last"></a>
                    </div>
                    
                    <div style="position: relative; ">

                        <a href="/restaurant-war/index.jsp">
                            <img src="/restaurant-war/images/icon/Restaurant Minh Thuong.png" alt="Restaurant Minh Thuong" style="position: absolute; top: -100px; left:-20%; width: 290px">
                        </a>
                        <a href="/restaurant-war/index.jsp">
                            <img src="/restaurant-war/images/logo.png" alt="Boo House" style="position: relative; left: 27%">
                        </a> 
                    </div>
                    
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

                                <li class="current_bt-icon">
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

        <div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
            <div class="container_12">
                <div class="grid_8">
                    <h3>Reserve Your Table</h3>
                    <img src="images/page5_img1.jpg" alt="" class="img_inner fleft">
                    <div class="extra_wrapper">
                        <p class="col1">Hoivamus at magna non nunc tristiquencus. Fliquam nibh ante, egestas id dictum modo luctus libero. Praesent faucibus malesuad faucibu. </p>
                        <p>Dorem ipsum dolor sit amet, consecteturer adipiscing elit. Nullam consectetur orci se nulla facilisis consequat. Kurabitur vellore sit amet nulla ullamcorper ermentum. In vitae varius auguem.</p>
                    </div>
                    <p>Gamus at magna non nunc tristique rhoncus. Aliquam nibh ante, egestas id dictum ammodo luctus libero. Praesent faucibus malesuada faucibus. Forem ipsum dolor sit ametconsectetur adipiscing elit. <span class="cont_phone">For Parties call (023) 101-1100</span> . Nullam  consectetur orci sed. </p>
                    Murabitur vel lorem sit amet nulla ullamcorper fermentum. In vitae varius augue, eu consectetur ligula. Etiam dui eros. <span class="cont_phone">For Parties call (023) 101-1100</span> <br>
                    <a href="#" class="reserv"><span>@ </span> Click here to Make a reservation Online</a>
                </div>
                <div class="grid_4">
                    <div class="hours">
                        <div class="title">Our Hours</div>
                        <div>
                            Lunch<br>
                            Tues - Sat 11:45 am - 2:30 pm<br>
                            Brunch<br>
                            Sunday 10:30 am - 2 pm<br>
                            Cafe Dinner<br>
                            Sun - Fri 5:30 pm - 9:00 pm<br>
                            Prix Fixe Dinner<br>
                            Saturday 5:30 pm - 9:00 pm<br>
                            Greens to Go<br>
                            Mon - Thurs 8:30 am - varies <br>
                        </div>
                    </div>
                    <h3 class="head3">Our news</h3>
                    <div class="news">
                        <time datetime="2013-01-01">Sept<span>04</span></time>
                        <div class="extra_wrapper">
                            <p class="col1"><a href="#">Fliquam nibh ante, egestas id </a></p>In vitae varius auguemonsectetur ligulatiam dui eros, laoreet sit 
                        </div>
                    </div>
                    <div class="news">
                        <time datetime="2013-01-01">Oct<span>08</span></time>
                        <div class="extra_wrapper">
                            <p class="col1"><a href="#">Fliquam nibh ante, egestas id </a></p>In vitae varius auguemonsectetur ligulatiam dui eros, laoreet sit 
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
