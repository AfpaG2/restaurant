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
<div class="content" style="padding-bottom: 0; align:center;">

    <div class="container_12">

        <div class="grid_12">
            <h3 class="head2">Interface Serveur</h3>
        </div> 

        <c:if test="${empty aide}">
            <c:out value="Vous n'avez pas de nouveaux messages" />
        </c:if>

        <c:set var="message" value="" scope="application" />

        <c:if test="${not empty aide}">
            <p style="font-size: 2em">Attention: Vous avez de nouveaux messages</p>

            <c:set var="message" value="${message}${aide} <br/>" scope="application" />
            <c:out value="${message}" default="Vous n'avez pas de message" escapeXml="false"/>
        </c:if>

        <p></p>

    </div>
</div>

<script>
    $(document).ready(function () {

        $().UItoTop({easingType: 'easeOutQuart'});
        $('.gallery a.gal').touchTouch();

    });
</script>

<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />


