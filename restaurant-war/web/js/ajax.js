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

function modifierMenuPanier(url){
    var xhr =getXhr();
    xhr.onreadystatechange = function(){
        if(xhr.readyState === 4 && xhr.status === 200){
            var resp = xhr.responseText;
            // alert(resp);
            var elemp = document.getElementById("menuMain");
            elemp.innerHTML = resp;
        }
    };    
    xhr.open("GET", url, true);
    xhr.send(null);    
    }

