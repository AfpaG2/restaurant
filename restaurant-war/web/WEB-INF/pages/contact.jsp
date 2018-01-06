<%-- 
    Document   : index-1
    Created on : Jan 2, 2018, 8:34:56 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:directive.include file="/WEB-INF/menus/header.jsp" />

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

<script src="js/TMForm.js"></script>
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA9a8AtjTT4kqfj01n5thHFBn9vQdZMUh4&callback=initMap"></script>
<script>
    $(document).ready(function () {

        $().UItoTop({easingType: 'easeOutQuart'});
    });
</script>
<script src="js/map.js"></script>
<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
