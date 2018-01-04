













<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <title>Menu</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="images/favicon.ico">
        <link rel="shortcut icon" href="images/favicon.ico" />
        <link rel="stylesheet" href="css/touchTouch.css">
        <link rel="stylesheet" href="css/style.css">
        <script src="js/jquery.js"></script>
        <script src="js/jquery-migrate-1.1.1.js"></script>
        <script src="js/jquery.equalheights.js"></script>
        <script src="js/jquery.ui.totop.js"></script>
        <script src="js/jquery.tabs.min.js"></script>
        <script src="js/touchTouch.jquery.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script>
            $(document).ready(function () {

                $().UItoTop({easingType: 'easeOutQuart'});
                $('.gallery a.gal').touchTouch();

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

        <div>
            <c:url value="FrontControleur?section=donnees-create" var="url01" />
            <a href="${url01}">créer les données</a> |
        </div>  
        <div> 
            <c:url value="FrontControleur?section=connexion" var="url01" />
            <a href="${url01}">Se connecter</a> 
        </div>
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

                                <li class="current_bt-icon">
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
            <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
            <div class="container_12">

                <div class="tabs tb gallery">
                    <div class="div-nav  ">
                        <div class="grid_12">
                            <ul class="nav">

                                <li class="selected"><a href="#tab-1" class="">Detail du formule</a></li>

                            </ul>
                        </div>    
                    </div>
                    <div class="div-tabs">
                        <div  id="tab-1" class="tab-content gallery1">                            
                            <c:forEach items="${map.keySet()}" var="key">

                                <div class="grid_12">
                                    <h3 class="head2">${key}</h3> 
                                </div>   

                                <div class="grid_12">

                                    <c:forEach items="${map.get(key)}" var="p">
                                        <div class="grid_3">
                                            <c:url value="FrontControleur?section=catalogue&category=produit&ref=${p.id}" var="urlf" />
                                            <a href="${urlf}" class="gal"><img src="/restaurant-war/images/${p.image}" alt=""><span></span></a>
                                            ${p.nomProduit}<br> 
                                            <div class="col2"><span class="col3">                                            
                                                    <a href="${urlf}">Voir detail</a>
                                                </span> $ ${p.prixTTC}
                                            </div>
                                        </div>
                                    </c:forEach> 
                                </div>  

                            </c:forEach>  
                        </div>
                    </div>
                </div>
            </div>
        </div> 
        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />




























