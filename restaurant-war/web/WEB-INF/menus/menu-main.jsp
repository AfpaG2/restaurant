<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<p>
    <c:url value="FrontControleur?section=donnees-create" var="url01" />
    <a href="${url01}">Créer les Données</a>
    
    <c:url value="FrontControleur?section=affichage-carte" var="url02" />
    <a href="${url02}">Carte de votre restaurant "Minh Thuong"</a>
    
</p>
