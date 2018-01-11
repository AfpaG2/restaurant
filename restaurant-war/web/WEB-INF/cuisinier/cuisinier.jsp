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
                                <td>${lc.produit.nomProduit}</td>
                                <td>${lc.id}</td>
                                <td>${lc.quantite}</td>
                                <td>${lc.statut.valeurStatut}</td>
                                <td>
                                    <c:url value="FrontControleur?section=cuisinier-changerStatut-lignecommande&ligneCommande=${lc.id}" var="urllc" />
                                    <form name="statutLC" action="${urllc}" method="POST">
                                        <c:forEach items="${statutLigneCommandes}" var="slc">
                                            <input type="radio" name="statutLigneCommande${lc.id}" value="${slc.valeurStatut}" >${slc.valeurStatut}
                                        </c:forEach>  
                                        <input type="submit" name="DoIt" value="Changer Statut" > 
                                    </form>  

                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tfoot>
                        <tr>
                            <td>
                                ${c.statut.valeurStatut}  

                            </td>


                            <td colspan="2">
                                <c:url value="FrontControleur?section=cuisinier-changerStatut-commande&idCommande=${c.id}" var="urlc" />
                                <form name="statutC" action="${urlc}" method="POST">
                                    <c:forEach items="${statutCommandes}" var="sc">
                                        <input type="radio" name="statutCommande${c.id}" value="${sc.valeurStatut}" >${sc.valeurStatut}
                                    </c:forEach> 
                                    <input type="submit" name="DoIt" value="Changer Statut" > 
                                </form>  
                            </td>

                            <td></td>
                            <td></td>

                        </tr>
                    </tfoot> 

                </table>
            </c:forEach>

        </div> 
    </div>
</div> 

<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
