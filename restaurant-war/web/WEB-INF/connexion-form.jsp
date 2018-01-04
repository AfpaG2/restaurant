<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/restaurant-war/css/style.css" rel="stylesheet" type="text/css"/>
        <style>
            input.button{
                background-color:blue;        
                color:#555555;
                font-weight:bold;
                font-size:26px ;
                height:50px;        
                text-decoration:none;
                width:70px;
            }
            .myForm input:valid{
                background-color: lightGreen;
            }
            .myForm input:invalid{
                background-color: lightPink;
            }
        </style>
        <title>Connexion</title>
    </head>
    <body>

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


        <script type="text/javascript">

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
