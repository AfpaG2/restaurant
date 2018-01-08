<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

        <c:if test="${not empty commande}">
            <c:forEach items="$commande.ligneCommandes" var="lc">
                ${lc.quantite} <br/>
            </c:forEach>
        </c:if>
        <c:if test="${empty commande}">
            
<<<<<<< HEAD
        </c:if>
=======
        </c:if>
>>>>>>> 0ebbf5bbef1bedeb7200b57490c816290b8fc3c0
