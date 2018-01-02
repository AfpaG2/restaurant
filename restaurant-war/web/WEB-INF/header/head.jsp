<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="fr">
<head>
	<title> Titre de la page</title>
	<meta charset="utf-8">
    <link rel="icon" href="../../images/favicon.ico">
     <link rel="shortcut icon" href="images/favicon.ico" />
     <link rel="stylesheet" href="../..css/style.css">
     <script src="../../js/jquery.js"></script>
     <script src="../../js/jquery-migrate-1.1.1.js"></script>
     <script src="../../js/jquery.equalheights.js"></script>
     <script src="../../js/jquery.ui.totop.js"></script>
     <script src="../../js/jquery.easing.1.3.js"></script>
     <script>
        $(document).ready(function(){
          $( ".block1" ).mouseover(function() {
            $(this).addClass( "blur" );
          });
          $( ".block1" ).mouseout(function() {
            $(this).removeClass( "blur" );
          });
          $().UItoTop({ easingType: 'easeOutQuart' });
        }) 
     </script>
</head>