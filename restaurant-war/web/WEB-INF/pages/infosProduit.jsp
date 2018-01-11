<%-- 
    Document   : infosProduit
    Created on : Jan 11, 2018, 8:55:03 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:directive.include file="/WEB-INF/menus/header.jsp" />
<!--==============================Content=================================-->
<div class="content">
    <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
    <div class="container_12">
        <div>
            <h1>Informations sur le plat</h1> 
            <table style="border: #000 solid thin">
                <thead>
                    <tr>

                        <th><img src="images/${patesLegumes.image}" width="100" alt=""></th>
                        <th style="padding-top: 2em"><c:out value="${patesLegumes}<br/>(Ingredients)" escapeXml="false"/></th>

                        <th style="padding-top: 2em">Apport calorique</th>
                    </tr>

                </thead>
                <tbody>
                    <c:forEach items="${patesLegumes.ingredients}" var="ingredient" >
                        <tr style="text-align: center">
                            <td></td>
                            <td>${ingredient.nomIngredient}</td>
                            <td >${ingredient.apportCalorique}</td>
                        </tr>
                    </c:forEach>

                    <tr style="text-align: center">
                        <td><div class="col2">
                                <c:url value="FrontControleur?section=carte" var="carte" />
                                <a href="${carte}" class="ajouterAuPanier">Afficher la carte</a>
                            </div></td>
                        <td></td>
                        <td>
                            <div class="col2">
                                <c:url value="FrontControleur?section=panier-operations&origine=catalogue&action=add&ref=${patesLegumes.id}" var="panierOperation" />
                                <a href="${panierOperation}" class="ajouterAuPanier" onclick="modifierMenuPanier('${panierOperation}'); return false;">Ajouter au Panier</a>
                            </div>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div> 
    </div>
</div> 
<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />