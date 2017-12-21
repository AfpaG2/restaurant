<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/restaurant-war/css/votre-style.css" rel="stylesheet" type="text/css"/>
        <title>Formules</title>
    </head>
    <body>
        
        <div>
            <h1>Nos formules</h1>
            <table>
                <thead>
                    <tr>
                        <th>Nom Formule</th> 
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
                            <td><img src="images/${p.image}" alt="Image Plat" style="height: 100px; width: 100px"></td>
                            <td>${p.prix}</td>
                            <td>${p.prixTTC}</td>
                            <td>
                                <c:url value="FrontControleur?section=catalogue&category=formule&ref=${p.id}" var="urlf" />
                                <a href="${urlf}">Detail Formule</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>        
    </body>
</html>
