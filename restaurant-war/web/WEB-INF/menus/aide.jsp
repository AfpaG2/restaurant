<%-- 
    Document   : aide
    Created on : Jan 11, 2018, 5:20:35 AM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="grid_1212" style="text-align: center; padding: 60px 15px 30px">
    <c:url value="FrontControleur?section=serveur-interface-affichage" var="aideServeur" />
    <a href="${aideServeur}" >
        
        <div style="margin-bottom: 20px; font: 24px/20px 'Open Sans', sans-serif;">Vous pouvez faire appel à un serveur en appuyant sur le bouton suivant.</div>
        <img src="images/besoin-aide.jpg" alt="Appeler Serveur" onclick="confirm('Merci de confirmer l\'appel d\'un serveur');" />
        
        <c:set var="aide" value="Le client sur le terminal No... a besoin de votre aide" scope="application"/>
    </a>
</div>
