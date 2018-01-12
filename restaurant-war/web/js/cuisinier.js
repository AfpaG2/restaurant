// Function getXhr

function getXhr() {
    var xhr = null;
    if (window.XMLHttpRequest){ // Firefox et autres
        xhr = new XMLHttpRequest();
    } else if (window.ActiveXObject) { // Internet Explorer
        try {
            xhr = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            xhr = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    else { // XMLHttpRequest non supporté par le navigateur
        alert("Votre navigateur ne supporte pas les objets XMLHTTPRequest...");
        xhr = false;
    }
    return xhr;
}



function changerStatutLigneCommande(idCommande) {
    var nameStatut = statutLigneCommande+idCommande;
    var TabInputs=document.getElementsByTagName("input."+nameStatut); 
    var xhr = getXhr();
    var url = "FrontControleur?section=changerStatut-ligneCommande";
    xhr.onreadystatechange = function () {
        if (xhr.status == 200 && xhr.readyState == 4) {
            for (i=0;i<TabInputs.length;i++){
               if(TabInputs[i].checked===true)  {
                   url +="&ligneCommande="+idCommande+"&statut="+TabInputs[i].value;
             
             }
      }
        }
    };
    xhr.open("GET", url, true);
    xhr.send();
};


setInterval(function actualiserInterfaceCuisine() {
    var xhr = getXhr();
    var url = "FrontControleur?cuisinier-interface-affichage";
    xhr.onreadystatechange = function () {
        if (xhr.status == 200 && xhr.readyState == 4) {
            var txt = xhr.responseText;
            var elem = document.getElementById("content");
            elem.innerHTML = txt;
        }
    };
    xhr.open("GET", url, true);
    xhr.send();
}, 30000);


