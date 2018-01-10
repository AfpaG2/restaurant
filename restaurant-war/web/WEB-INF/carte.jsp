<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/restaurant-war/css/style-footer.css" rel="stylesheet" type="text/css"/>
        <title>Carte Restaurant</title>
        
        
    </head>
    <body>
        <div>
            <h1>Carte de votre restaurant "Minh Thuong"</h1>
            <table>
                <thead>
                    <tr>
                        <th>Reference Plat</th>
                        <th>Image</th>
                        <th>Nom ${typePlat}</th>
                        <!--<th>stock</th>-->
                        <th>Prix HT</th>
                        <th>Prix TTC</th>
                        <th>Action</th>

                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${produits}" var="p">
                        <tr>
                            <td>${p.id}</td>
                            <td><img src="images/${p.image}" alt="Image Plat" style="height: 100px; width: 100px"></td>
                            <td>${p.nomProduit}</td>
                            <!--<td><%--${p.qte}--%></td>-->
                            <td>
                                <strong>
                                    <fmt:setLocale value="fr_FR" scope="session" />
                                    <fmt:formatNumber value="${p.prix}" type="currency" />
                                </strong>
                            </td>
                            <td>
                                <strong>
                                    <fmt:setLocale value="fr_FR" scope="session" />
                                    <fmt:formatNumber value="${p.prixTTC}" type="currency" />
                                </strong>
                            </td>
                            <td>
                                <c:url value="FrontControleur?section=operations-panier&origine=carte&action=add&ref=${p.id}" var="urlp" />
                                <a href="${urlp}">Ajouter au Panier</a>
                            </td>
                        </tr>
                    </c:forEach>

                    <%--
                    <tr>
                        <form method="get" action="FrontControleur?section=affichage-carte">
                            <table>
                                <tr>
                                    <c:forEach items="${pages}" var="page">
                                        <td>
                                            <a href="FrontControleur?section=affichage-carte&pageNumber=${page}">${page}</a>
                                        </td>
                                    </c:forEach>
                                </tr>
                            </table>
                        </form>
                    </tr>
                    --%>
                </tbody>
            </table>
        </div>

        <%--<jsp:directive.include file="menus/footer.jsp" /> --%>
        <jsp:directive.include file="/menus/newfooter.jsp" />
