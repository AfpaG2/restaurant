<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:directive.include file="/WEB-INF/menus/header.jsp" />
<!--==============================Content=================================-->
<div class="content">
    <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
    <div class="container_12">
        <div>
            <h1>Commandes</h1>
            <c:forEach items="${commandes}" var="c">
                <table>
                    <caption> Commande de la table N°: ${c.emplacement.numeroTable}</caption>
                    <thead>
                        <tr>
                            <th>Nom</th>
                            <th>Reference</th>
                            <th>Quantite</th>
                            <th>Statut</th>
                            <th>Changer Statut</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${c.ligneCommandes}" var="lc">
                            <tr>
                                <td>${lc.nomProduit}</td>
                                <td>${lc.id}</td>
                                <td>${lc.quantite}</td>
                                <td>${lc.statut}</td>
                                <td>
                                    <c:forEach items="${statutLigneCommandes}" var="slc">
                                        <input type="radio" name="statutLigneCommande" value="${slc.valeurStatut}" checked><br>
                                    </c:forEach>                                  
                                    <c:url value="FrontControleur?section=changerStatut-ligneCommande&ligneCommande=${lc.id}&statut=${slc.valeurStatut}" var="urlp" />
                                    <a href="${urlp}"> Changer Statut </a> 
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td colspan="2">
                                <c:forEach items="${statutCommandes}" var="sc">
                                        <input type="radio" name="statutLigneCommande" value="${sc.valeurStatut}" checked><br>
                                    </c:forEach> 
                                 </td>
                                 <td>
                                    <c:url value="FrontControleur?section=changerStatut-commande&commande=${c.id}&statut=${sc.valeurStatut}" var="urlp" />
                                    <a href="${urlp}"> Changer Statut </a> 
                            </td>
                        </tr>
                    </tfoot> 

                </table>
            </c:forEach>

        </div> 
    </div>
</div> 
<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
