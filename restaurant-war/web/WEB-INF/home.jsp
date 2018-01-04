
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:directive.include file="/WEB-INF/menus/header.jsp" />
        <!--==============================Content=================================-->
        <div>
            <h1>accueil</h1>
            <p>Bienvenue dans votre Restaurant.</p>
            <p class="${dClasse}">${msg}</p>
        </div>  
 <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />


