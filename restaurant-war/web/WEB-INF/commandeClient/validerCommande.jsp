<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:directive.include file="/WEB-INF/menus/header.jsp" />

        <c:if test="${not empty commande}">
            <p>Salut la commande</p>
            <c:forEach items="${commande}" var="lc">
                
                <c:out value="${lc.quantite}" /> <br/>
            </c:forEach>
        </c:if>
        <c:if test="${empty commande}">
            <p>Salut Toi</p>

        </c:if>
            
            <script>
    $(document).ready(function () {

        $().UItoTop({easingType: 'easeOutQuart'});
        $('.gallery a.gal').touchTouch();

    });
</script>

<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />