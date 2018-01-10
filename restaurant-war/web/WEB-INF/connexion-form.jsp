
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:directive.include file="/WEB-INF/menus/header.jsp" />
        <!--==============================Content=================================-->
        
        <div>
            <h1>Connexion</h1>
            <c:url value="FrontControleur" var="url01" />
            <form class="myForm" action="${url01}" method="POST" accept-charset="UTF-8">
                <label class="erreur">${erreur}</label><br />
                <input type="hidden" name="section" value="connexion" />
                <input type="text"  id="paveNumerique" name="mdp" value="">
                <input type="button" onclick="cancel(event)" name="Cancel" value="Cancel">
                <input type="submit" name="submit" value="Valider">
            </form>
            <br>
            <input class="button" type="button" onclick="miseAjourInput(event)" id="un"  value="1"><input class="button" type="button" onclick="miseAjourInput(event)" id="deux"  value="2"><input class="button" type="button" onclick="miseAjourInput(event)" id="trois"  value="3"><br>
            <input class="button" type="button" onclick="miseAjourInput(event)" id="quatre"  value="4"><input class="button" type="button" onclick="miseAjourInput(event)" id="cinq"  value="5"><input class="button" type="button" onclick="miseAjourInput(event)" id="six"  value="6"><br>
            <input class="button" type="button" onclick="miseAjourInput(event)" id="sept"  value="7"><input class="button" type="button" onclick="miseAjourInput(event)" id="huit"  value="8"><input class="button" type="button" onclick="miseAjourInput(event)" id="neuf"  value="9"><br>
            <input class="button" type="button" onclick="miseAjourInput(event)" id="zero"  value="0">
        </div> 

        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />

    