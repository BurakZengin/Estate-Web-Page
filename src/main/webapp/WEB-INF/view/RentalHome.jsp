<%-- 
    Document   : newjsp
    Created on : 23.Kas.2017, 19:27:07
    Author     : ELIDOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">  
        <meta http-equiv="content-type" content="text/html; charset=utf-8"> 

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
    <s:url var="url_js" value="/static/js/Javascript.js"/>
    <script type="text/javascript" src="${url_js}" ></script>
    <s:url var="url_HouseForSale" value="/HouseForSale"/>
    <s:url var="url_css" value="/static/css/HomePage.css"/>
    <link href="${url_css}" rel="stylesheet" type="text/css"/>
    <title>GZ Gayrimenkul</title>
</head>
<s:url var="url_bge" value="/static/images/bgRent.jpg"/>
<body background="${url_bge}">
    <jsp:include page="include/nav.jsp"/>
<div class="container">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4" style="margin-bottom: 10px; margin-top: 70px;">
            <a href="${url_HouseForSale}"><button  type="button" class="btn btn-default btn-lg" style="margin-left: 30px; width: 130px;">SATILIK</button></a>
            <button  type="button" class="btn btn-lg btn-warning" style="margin-left: 30px; width: 130px;" >KİRALIK</button> 
        </div>
        <div class="col-md-4"></div>
    </div>
</div>
<div class="container">
    <div class="row align-items-center" style="margin: auto;">

        <div class="col-md-3"></div>
        <div class="col-md-6" style="margin: auto;">
            <div class="col-md-2"></div>  
            <div class="col-md-8 well" style="opacity: 0.93;">
                <div class="col-md-1 "></div>
                <div class="col-md-10 " style="margin-top: 10px;">
                    <h3 align="center">Aradığınız Evi Bulun</h3>
                    <div style="margin-top: 30px;">
                        <s:url var="url_homes"  value="/Homes"/>
                        <f:form action="${url_homes}" modelAttribute="command" class="form-horizontal">
                            <div class="form-group align-items-center">
                                <h4 align="center">Konum</h4>
                                <f:select path="konum" items="${konum}" class="form-control" onchange="setBolge();" id="location1"></f:select>
                                </div>
                                <div class="form-group" style="margin-top: 30px;">
                                    <h4 align="center">Bölge</h4>
                                <f:select path="bolge" class="form-control" name="" id="type1"></f:select>
                                </div>      
                                <div align="center" class="form-group" >
                                    <button name="Type" value="Kiralik" class="btn btn-primary" type="submit" style="width: 100px; margin-top: 20px;">ARA</button>
                                </div>            
                        </f:form>
                    </div>
                </div>
                <div class="col-md-1"></div>
            </div>

            <div class="col-md-2"></div>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
</body>
</html>
