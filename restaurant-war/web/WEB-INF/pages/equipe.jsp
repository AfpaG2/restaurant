<%-- 
    Document   : index-1
    Created on : Jan 2, 2018, 8:34:56 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <jsp:directive.include file="/restaurant-war/WEB-INF/menus/header.jsp" /> --%>

<!DOCTYPE html>
<html>
    <head>
        <title>Equipe</title>
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

                                <li class="current_bt-icon">
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

        <div class="content"><div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
            <div class="container_12">
                <div class="grid_8">
                    <h3>About Us</h3>
                    <img src="images/page2_img.jpg" alt="" class="img_inner fleft">
                    <div class="extra_wrapper">
                        <p class="col1">
                            Following the <span><a href="http://blog.templatemonster.com/free-website-templates/" rel="copyright">link</a></span>, you’ll learn more about this goodie produced by <br> TemplateMonster.com. </p>
                        <p class="col1">Want to get more designs of this kind? Check out the category of premium <span><a href="http://www.templatemonster.com/category/cafe-and-restaurant-website-templates/" rel="nofollow">Cafe &amp; Restaurant templates</a></span>.</p>
                        <p>Aliquam nibh ante, egestas id dictum modo luctus libero. Praesent faucibus malesorem ipsum dolor sit amet, consecteturer. </p>
                    </div>
                    at magna non nunc tristique rhoncus. Aliquam nibh ante, egestas id dictum ammodo luctus libero. Praesent faucibus malesuada faucibus. Lorem ipsum dolor sit ametconsectetur adipiscing elit. Nullam consectetur orci sed nulla facilisis consequat. 
                </div>
                <div class="grid_4">
                    <h3>Features</h3>
                    <p class="col1 pad1">Magna non nunc tristiquencus. Aliquam nibh ante, egestas id dictum modo luctus libero. </p>
                    <p class="pad1">Dolor sit amet, consectetureripiscingelit. Nullam consectetur orci se nullafaci.</p>
                    <ul class="list">
                        <li><a href="#">Curabitur Vellore Sit</a></li>
                        <li><a href="#">Eu Consectetur Ligula</a></li>
                        <li><a href="#">Dui eros Laoreet Sit amet </a></li>
                        <li><a href="#">Estvel Dertolino</a></li>
                        <li><a href="#">Commodo Venenatis Erossce</a></li>
                        <li><a href="#">Adipiscing Quam id Risus </a></li>
                        <li><a href="#">Sagittis  Consequat Lacus </a></li>
                        <li><a href="#">Onterdumoin ut </a></li>
                    </ul>
                </div>
                <div class="grid_12">
                    <h3 class="head1">The Best of Professionals</h3>
                </div>
                <div class="grid_3">
                    <div class="box maxheight">
                        <img src="images/page2_img1.jpg" alt="">
                        <div class="title"><a href="#">Emma Smith</a></div>
                        Deneger convallis orci vel mi delaoreet, at ornare lorem consequat. Phasellus era nisl auctor vel velitero. 

                    </div>
                </div>
                <div class="grid_3">
                    <div class="box maxheight">
                        <img src="images/page2_img2.jpg" alt="">
                        <div class="title"><a href="#">Thomas Nelson</a></div>
                        Reenteger convallis orci veli saelaoreet, at ornare lorem konsequat. Khasellus era  jauctor vel veliteru.  
                    </div>
                </div>
                <div class="grid_3">
                    <div class="box maxheight">
                        <img src="images/page2_img3.jpg" alt="">
                        <div class="title"><a href="#">Linda Grey</a></div>
                        Ortolieger convallis omi tem more, at ornare loren coatr. Lasellus era nisl auctor vel veliterolsed pharetr. 

                    </div>
                </div>
                <div class="grid_3">
                    <div class="box maxheight">
                        <img src="images/page2_img4.jpg" alt="">
                        <div class="title"><a href="#">Richard Cox</a></div>
                        Gonvallis orci vel mi oreilat otornare lorem consequat. Kllus era nisl auctor veli detelolvenenatis nullo. 

                    </div>
                </div>
            </div>
        </div>

        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
        