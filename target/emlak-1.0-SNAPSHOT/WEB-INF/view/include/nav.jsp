<%-- 
    Document   : nav
    Created on : 24.Kas.2017, 19:58:38
    Author     : ELIDOR
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="k" %>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<k:url var="url_key" value="/static/images/key.png"/>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <a class="navbar-brand" href="/emlak/HouseForSale">
            <img src="${url_key}" class="d-inline-block align-top" alt="">    GZ Gayrimenkul & Danışmanlık</a>
        <ul class="nav navbar-nav" id="nav" style="margin-top: 8px;">          
            <li><a href="/emlak/HouseForSale">Ana Sayfa</a></li>
            <li><a href="/emlak/About">Hakkında</a></li>
        </ul>
    </div>
</nav>