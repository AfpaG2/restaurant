<%-- 
    Document   : serveur
    Created on : 4 janv. 2018, 09:31:32
    Author     : youssef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Interface Serveur</title>
    </head>
    <body>
        <h1>Interface Serveur à faire !</h1>
        
        <c:if test="${empty aide}">
            <c:out value="Vous n'avez pas de nouveaux messages" />
        </c:if>
        
        <c:set var="message" value="" scope="application" />
        
        <c:if test="${not empty aide}">
            <c:set var="message" value="${message}${aide} <br/>" scope="application" />
            <c:out value="${message}" default="Vous n'avez pas de message" escapeXml="true"/>
        </c:if>
        
        
    </body>
</html>
