
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:directive.include file="/WEB-INF/menus/header.jsp" />
        <!--==============================Content=================================-->
        <div class="content">
            <div class="ic">More Website Templates @ TemplateMonster.com - December 02, 2013!</div>
            <div class="container_12">

                <div class="tabs tb gallery">
                    <div class="div-nav  ">
                        <div class="grid_12">
                            <ul class="nav">

                                <li class="selected"><a href="#tab-1" class="">Detail du formule</a></li>

                            </ul>
                        </div>    
                    </div>
                    <div class="div-tabs">
                        <div  id="tab-1" class="tab-content gallery1">  
                            <c:url value="FrontControleur?section=panier-operations&origine=formule&action=add" var="urllc" />
                                    <form name="statutLC" action="${urllc}" method="POST">  
                            
                            <c:forEach items="${map.keySet()}" var="key">

                                <div class="grid_12">
                                    <h3 class="head2">${key}</h3> 
                                </div>   

                                <div class="grid_12">
                                      
                                    <c:forEach items="${map.get(key)}" var="p">
                                        <div class="grid_3">
                                            <c:url value="FrontControleur?section=catalogue&category=produit&ref=${p.id}" var="urlf" />
                                            <a href="${urlf}" class="gal"><img src="/restaurant-war/images/${p.image}" alt=""><span></span></a>
                                            <input type="radio" name="ref${p.id}" value="${p.id}" >${p.nomProduit}<br> 
                                            <div class="col2"><span class="col3">                                            
                                                    <a href="${urlf}">Voir detail</a>
                                                </span> $ ${p.prixTTC}
                                            </div>
                                        </div>
                                            
                                    </c:forEach> .
                                    
                                    
                                </div>  

                            </c:forEach> 
                                        <br>
                            <input type="submit" name="DoIt" value="Ajouter au panier" > 
                                    </form>  
                            
                        </div>
                    </div>
                </div>
            </div>
        </div> 
        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />




























