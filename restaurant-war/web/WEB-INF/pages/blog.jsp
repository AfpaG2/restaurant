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
        <title>Blog</title>
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
                                
                                <li class="current_bt-icon">
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

        <div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
            <div class="container_12">
                <div class="grid_8">  
                    <h3 class="">Blog</h3>
                    <div class="post">
                        <img src="images/page4_img1.jpg" alt="" class="img_inner fleft">
                        <div class="extra_wrapper">
                            <div class="title col3"><a href="#">Fusce adipiscing quam id risusyn </a></div>
                            <p class="col1">
                                <time datetime="2013-01-01">22.10.2013</time><span></span>posted by 
                                <a href="#">admin</a><span></span><a href="#">comments:5</a>
                            </p>Etiam dui eros, laoreet sit amet est vel,odo venenatis eros. Fusce adipiscing quam id risus sagittis, non consequaty lacus terdm. Proin ut tincidunt nulla, eu sodales arcum. Quisque viverra nulla nunc, eu ultrices. libero ultricies egehasellus.
                            <br>
                            <a href="#" class="link1">More Info</a>
                        </div>
                    </div>
                    <div class="post">
                        <img src="images/page4_img2.jpg" alt="" class="img_inner fleft">
                        <div class="extra_wrapper">
                            <div class="title col3"><a href="#">Piscing quam id risusyn sagittisyl</a></div>
                            <p class="col1">
                                <time datetime="2013-01-01">18.10.2013</time><span></span>posted by 
                                <a href="#">admin</a><span></span><a href="#">comments:3</a>
                            </p>Jtiam dui eros, laoreet sit amet est vel,odo venenatis eros. Musce adipiscing quam ill risus sagittis, non consequat lacus terdo. Droin ut tincidunt nulla, eu sodales arcu. Quisque viverra nulla nunc, eu ultrice. libero ultricies egehasellus dertoli.
                            <br>
                            <a href="#" class="link1">More Info</a>
                        </div>
                    </div>
                    <div class="post">
                        <img src="images/page4_img3.jpg" alt="" class="img_inner fleft">
                        <div class="extra_wrapper">
                            <div class="title col3"><a href="#"></a></div>
                            <p class="col1">
                                <time datetime="2013-01-01">16.10.2013</time><span></span>posted by 
                                <a href="#">admin</a><span></span><a href="#">comments:2</a>
                            </p>Viam dui eros, laoreet sit amet est vel,odot venenatis eros. Busce adipiscing quam ko risus sagittis, non consequati lacus terdy. Oroin ut tincidunt nulla, eu sodales arcum. Buisque viverra nulla nunc, eu ultrice. libero ultricies egehasellus molotiko.
                            <br>
                            <a href="#" class="link1">More Info</a>
                        </div>
                    </div>
                </div>  
                <div class="grid_3 prefix_1">
                    <h3 class="head3">Categories</h3>
                    <ul class="list">
                        <li><a href="#">Aurabitur Mellore Jito</a></li>
                        <li><a href="#">Kou Monsectetur Gigula</a></li>
                        <li><a href="#">Nui eros Vaoreet Dit Sawstvel</a></li>
                        <li><a href="#">Commodo Venenatis Erossce </a></li>
                        <li><a href="#">Nedipiscing Muam id Risus</a></li>
                        <li><a href="#">Ittis  Consequat Lacus </a></li>
                        <li><a href="#">Onterdumoin ut </a></li>
                        <li><a href="#">Mincidunt Тullau Sodales  </a></li>
                        <li><a href="#">Buisque Viverra nulla </a></li>
                        <li><a href="#">Ultrices Libero Ultricieeget.</a></li>
                        <li><a href="#">Phasellus Accumsan Justo </a></li>
                    </ul>
                    <h3 class="head3">Archives</h3>
                    <ul class="list">
                        <li><a href="#">November - 2013</a></li>
                        <li><a href="#">October - 2013</a></li>
                        <li><a href="#">September - 2013</a></li>
                        <li><a href="#">August - 2013</a></li>
                        <li><a href="#">July-2013</a></li>
                        <li><a href="#">June-2013</a></li>
                    </ul>
                </div>
            </div>
        </div>

        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
        