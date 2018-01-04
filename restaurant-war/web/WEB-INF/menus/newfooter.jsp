<%-- 
    Document   : newfooter
    Created on : Dec 20, 2017, 10:20:16 PM
    Author     : Ibrahim Kelani <ibrahim.kelani@gmail.com>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--==============================footer=================================-->

<footer>    
  <div class="container_12">
    <div class="grid_6 prefix_3">
       
        <%--
        <c:url value="FrontControleur?section=catalogue&action=detail&ref=${p.id}" var="urlf" />
                                <a href="${urlf}">Detail Formule</a>
        
        --%>
        <c:url value="FrontControleur?section=catalogue" var="urlCatalogue" /> 
        <a href="/restaurant-war/index.jsp" class="f_logo">
            <img src="/restaurant-war/images/f_logo.png" alt="">
        </a>
      <div class="copy">
      &copy; 2017 | <a href="#">Privacy Policy</a> <br> Website   designed by <a href="http://www.templatemonster.com/" rel="nofollow">TemplateMonster.com</a>
      </div>
    </div>
  </div>
</footer>
     <script>
      $(document).ready(function(){ 
         $(".bt-menu-trigger").toggle( 
          function(){
            $('.bt-menu').addClass('bt-menu-open'); 
          }, 
          function(){
            $('.bt-menu').removeClass('bt-menu-open'); 
          } 
        ); 
      }); 
    </script>
</body>
</html>