<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/magasinEJB-v02-war/css/votre-style.css" rel="stylesheet" type="text/css"/>
        <title>home</title>
    </head>
    <body>

        <div>
            <c:url value="FrontControleur?section=donnees-create" var="url01" />
            <a href="${url01}">créer les données</a> |
        </div>   

        <div>
            <h1>accueil</h1>
            <p>Bienvenue dans votre Restaurant.</p>
            <p class="${dClasse}">${msg}</p>
        </div>        
    </body>
</html>
