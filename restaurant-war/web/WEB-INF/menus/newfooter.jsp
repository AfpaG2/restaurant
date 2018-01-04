
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
     

            function  miseAjourInput(event) {
                var monPaveNumerique = document.getElementById('paveNumerique');
                if (monPaveNumerique.value.length < 4) {
                    monPaveNumerique.value += event.target.value;
                    if (monPaveNumerique.value.length <= 3) {
                        paveNumerique.setCustomValidity("Le code d'accès est composé de 4 chiffres");
                    } else
                        paveNumerique.setCustomValidity("");

                }


            }
            ;

            function cancel(event) {
                var monPaveNumerique = document.getElementById('paveNumerique');
                var monPaveNumeriqueValue = monPaveNumerique.value;
                paveNumerique.value = monPaveNumeriqueValue.substring(0, monPaveNumeriqueValue.length - 1)

                if (monPaveNumerique.value.length <= 3) {
                    paveNumerique.setCustomValidity("Le code d'accès est composé de 4 chiffres");
                } else
                    paveNumerique.setCustomValidity("");

            }
            ;


      
    </script>
    
</body>
</html>