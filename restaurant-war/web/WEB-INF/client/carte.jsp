<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/restaurant-war/css/votre-style.css" rel="stylesheet" type="text/css"/>
        <title>Carte</title>
    </head>
    <body>
        
        <div>
            <h1>Carte</h1>
            <table>
                <thead>
                    <tr>
                        <th>om Formule</th> 
                        <th>Descrpition</th>  
                        <th>Image</th>  
                        <th>prixHT</th>
                        <th>prixTTC</th>
                        <th>action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${formules}" var="p">
                        <tr>
                            <td>${p.nomFormul}</td>
                            <td>${p.descrpition}</td>
                            <td>${p.image}</td>
                            <td>${p.prix}</td>
                            <td>${p.prixTTC}</td>
                            <td>
                                <c:url value="FrontControleur?section=catalogue&action=detail&ref=${p.id}" var="urlf" />
                                <a href="${urlf}">Detail Formule</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>        
    </body>
</html>
