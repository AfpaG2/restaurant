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
                                <c:forEach items="${natureProduits}" var="n" varStatus="status" >
                                <li class="selected"><a href="#tab-${status.count}" class="">${n.nomNatureProduit}</a></li>
                                </c:forEach> 
                            </ul>
                        </div>    
                    </div>
                    
                    <div class="div-tabs">
                         <c:forEach items="${natureProduits}" var="n" varStatus="status"  >
                        <div  id="tab-${status.count}" class="tab-content gallery1">
                            <c:forEach items="${produitsByNature}" var="p">
                                <div class="grid_3">
                                        <c:url value="FrontControleur?section=catalogue&category=produit&ref=${p.id}" var="urlf" />
                                    <a href="${urlf}" class="gal"><img src="/restaurant-war/images/${p.image}" alt=""><span></span></a>
                                    ${p.nomProduit}<br>
                                    <div class="col2"><span class="col3">
                                            <a href="${urlf}">Voir detail</a>
                                        </span> $ ${p.prixTTC}
                                    </div>
                                </div>
                            </c:forEach> 
                        </div>
                        </c:forEach> 
                        
                    </div>
                </div>
            </div>
        </div> 
        <jsp:directive.include file="/WEB-INF/menus/newfooter.jsp" />

