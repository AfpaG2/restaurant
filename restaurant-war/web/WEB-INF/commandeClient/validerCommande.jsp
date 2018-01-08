<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <c:if test="${not empty commande}">
            <c:forEach items="$commande.ligneCommandes" var="lc">
                ${lc.quantite} <br/>
            </c:forEach>
        </c:if>
        <c:if test="${empty commande}">
            
        </c:if>
