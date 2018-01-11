<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:directive.include file="/WEB-INF/menus/header.jsp" />
        <!--==============================Content=================================-->
        <div class="content">
            <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
            <div class="container_12">
                
                <div>
            <h1>Panier</h1>
            <table>
                <caption>Ma commande</caption>
                <thead>
                    <tr>
                        <th>nom</th>
                        <th>reference</th>
                        <th>qte</th>
                        <th>prixHT</th>
                        <th>prixTTC</th>
                        <th>action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${maListe}" var="l">
                        <tr>
                            <td>${l.produit.nomProduit}</td>
                            <td>${l.produit.id}</td>
                            <td>${l.qte}</td>
                            <td>${l.prixHT}</td>
                            <td>${l.prixTTC}</td>
                            <td>
                                <c:url value="FrontControleur?section=panier-operations&origine=panier&action=add&ref=${l.produit.id}" var="urlp" />
                                <c:url value="FrontControleur?section=panier-operations&origine=panier&action=dec&ref=${l.produit.id}" var="urlp1" />
                                <c:url value="FrontControleur?section=panier-operations&origine=panier&action=supp&ref=${l.produit.id}" var="urlp2" />
                                <a href="${urlp}"> + </a> | <a href="${urlp1}"> - </a> | <a href="${urlp2}"> x </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
                <tfoot>
                    <tr>
                         <td colspan="2">
                 <c:url value="FrontControleur?section=valider-commande" var="urlp3" />
           <a href="${urlp3}"> Valider commande </a>
           </td>
            </tr>
               </tfoot> 
            </table>
          
        </div> 
            </div>
        </div> 
        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />


