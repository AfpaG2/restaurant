<%-- 
    Document   : header
    Created on : Dec 20, 2017, 10:18:49 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-- Lien Pages -->


<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
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
          <link rel="stylesheet" media="screen" href="css/ie1.css">
        <![endif]-->

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
                        
                        <a href="/restaurant-war/index.jsp">
                            <img src="/restaurant-war/images/icon/Restaurant Minh Thuong.png" alt="Restaurant Minh Thuong" style="position: absolute; top: -100px; left:-20%; width: 290px">
                        </a>
                        <a href="/restaurant-war/index.jsp">
                            <img src="/restaurant-war/images/logo.png" alt="Boo House" style="position: relative; left: 27%">
                        </a> 
                    </div>
                    <!--<h1><a href="index.html"><img src="/restaurant-war/images/logo.png" alt="Boo House"></a> </h1>-->
                    <div class="menu_block">


                        <nav id="bt-menu" class="bt-menu">
                            <a href="#" class="bt-menu-trigger"><span>Menu</span></a>
                            <ul>
                                <li class="current bt-icon "><a href="/restaurant-war/index.jsp">Accueil</a></li>
                                <%-- <li class="bt-icon"><a href="/restaurant-war/WEB-INF/pages/index-1.jsp">About</a></li> --%>
                                <li class="bt-icon"><a href="/restaurant-war/WEB-INF/pages/index-1.jsp">Equipe</a></li>
                                <li class="bt-icon"><a href="/restaurant-war/WEB-INF/pages/index-2.jsp">Carte</a></li>
                                <li class="bt-icon"><a href="/restaurant-war/WEB-INF/pages/index-3.jsp">Blog</a></li>
                                <li class="bt-icon"><a href="/restaurant-war/WEB-INF/pages/index-4.jsp">Gestion Salle</a></li>
                                <li class="bt-icon"><a href="/restaurant-war/WEB-INF/pages/index-5.jsp">Contacts</a></li>
                            </ul>
                        </nav>

                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </header>

