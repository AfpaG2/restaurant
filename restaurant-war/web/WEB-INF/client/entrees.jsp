<%-- 
    Document   : entrees
    Created on : Jan 6, 2018, 4:49:54 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:directive.include file="/WEB-INF/menus/header.jsp" />


<script>
    $(document).ready(function () {

        $().UItoTop({easingType: 'easeOutQuart'});
        $('.gallery a.gal').touchTouch();

    });
</script>

<jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />
