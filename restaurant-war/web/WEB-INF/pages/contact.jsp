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
        <title>Contacts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="images/favicon.ico">
        <link rel="shortcut icon" href="images/favicon.ico" />
        <link rel="stylesheet" href="css/form.css">
        <link rel="stylesheet" href="css/style.css">
        <script src="js/jquery.js"></script>
        <script src="js/jquery-migrate-1.1.1.js"></script>
        <script src="js/jquery.equalheights.js"></script>
        <script src="js/jquery.ui.totop.js"></script>
        <script src="js/TMForm.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyASm3CwaK9qtcZEWYa-iQwHaGi3gcosAJc&amp;sensor=false"></script>
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

                                <li class="bt-icon">
                                    <c:url value="FrontControleur?section=salle" var="salle" />
                                    <a href="${salle}">Gestion Salle</a>
                                </li>

                                <li class="current_bt-icon">
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

        <div class="content contact">
            <div class="container_12">
                <div class="grid_12">
                    <div id="map"></div>
                </div>
                <div class="clear"></div>
                <div class="grid_4">
                    <h3 class="head3">Address</h3>
                    <div class="map">


                        <address>
                            <dl>
                                <dt>The Company Name Inc. <br>
                                    8901 Marmora Road,<br>
                                    Glasgow, D04 89GR.
                                </dt>
                                <dd><span>Freephone:</span>+1 800 559 6580</dd>
                                <dd><span>Telephone:</span>+1 800 603 6035</dd>
                                <dd><span>FAX:</span>+1 800 889 9898</dd>
                                <dd>E-mail: <a href="#" class="col2">mail@demolink.org</a></dd>
                                <dd>Skype: <a href="#" class="col2">@skypename</a></dd>                              </dl>
                        </address>
                        <p>We’re glad to provide support services for all <a href="http://www.templatemonster.com/website-templates.php" rel="nofollow" class="col2">premium designs</a>
                            that we produce. The goodies that are available for free (free templates) go without support. </p>
                        If you’re looking for some professionals to help you polish the chosen free theme, address to  <a href="http://www.templatetuning.com/"  rel="nofollow" class="col2">Template Tuning </a>
                        guys for help. Please note that it’s a paid service.
                    </div>
                </div>
                <div class="grid_8">
                    <h3 class="head3">Contact Form</h3>
                    <form id="form">

                        <div class="success_wrapper">
                            <div class="success-message">Contact form submitted</div>
                        </div>
                        <label class="name">
                            <input type="text" placeholder="Name:" data-constraints="@Required @JustLetters" />
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*This is not a valid name.</span>
                        </label>

                        <label class="email">
                            <input type="text" placeholder="E-mail:" data-constraints="@Required @Email" />
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*This is not a valid email.</span>
                        </label>
                        <label class="phone">
                            <input type="text" placeholder="Phone:" data-constraints="@Required @JustNumbers"/>
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*This is not a valid phone.</span>
                        </label>
                        <label class="message">
                            <textarea placeholder="Message:" data-constraints='@Required @Length(min=20,max=999999)'></textarea>
                            <span class="empty-message">*This field is required.</span>
                            <span class="error-message">*The message is too short.</span>
                        </label>
                        <div>
                            <div class="clear"></div>
                            <div class="btns">
                                <a href="#" data-type="reset" class="btn">Clear</a>
                                <a href="#" data-type="submit" class="btn">Send</a></div>
                        </div>
                    </form>   
                </div>
            </div>
        </div>

        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
        