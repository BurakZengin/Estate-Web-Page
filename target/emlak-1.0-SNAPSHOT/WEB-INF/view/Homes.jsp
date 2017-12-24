<%-- 
    Document   : newjsp
    Created on : 24.Kas.2017, 14:33:08
    Author     : ELIDOR
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
    <s:url var="url_css" value="/static/css/Homes.css"/>
    <link href="${url_css}" rel="stylesheet" type="text/css"/>
    <s:url var="url_bg" value="/static/images/bgSale.jpg"/>
    <s:url var="url_bge" value="/static/images/bgRent.jpg"/>
    <s:url var="url_tl" value="/static/images/tl.jpg"/>

    <title>GZ Gayrimenkul</title>
</head>
<body>

    <jsp:include page="include/nav.jsp"/>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-8">
            <div class="col-md-12" style="margin-left: 30px;">
                <table class="table table-striped" id="table" >
                    <thead>
                        <tr>
                            <th align="right" width="50%"></th>
                            <th>İlan Başlığı</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="c" items="${homeList}" varStatus="st">
                            <tr>
                                <td><a href="<s:url value="/HomeDetail/${c.evlerId}"/>"><img class="img-rounded" src="${url_bg}" border=3 height=350 width=500/></a></td>
                                <td>
                        <div id="icerik">
                            <br><br>
                            <h3 align="left">${c.fiyat} <img src="${url_tl}" alt=""></img></h3>

                            <h5 align="left">${c.adres}</h5><br>

                            <table class="table" id="table2">
                                <tr>
                                    <td path align="left">Oda</td>
                                    <td align="left">${c.odaSayisi}</td> 
                                </tr> 
                                <tr>
                                    <td align="left">m²</td>
                                    <td align="left">${c.metreKare}</td>
                                </tr>
                                <tr>
                                    <td align="left">Bulunduğu Kat</td>
                                    <td align="left">${c.bulunduguKat}</td>
                                </tr>
                            </table>
                            <br><a href="<s:url value="/HomeDetail/${c.evlerId}"/>"><h5 align="right" id="detaylar">Detayları Gör</h5></a>
                        </div>
                        </td>
                        </tr> 
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-md-3">
            <div class="col-md-10 text-center" style=" margin-top: 40px;">
                <div class="panel panel-danger panel-pricing">
                    <div class="panel-heading">
                        <i class="fa fa-desktop"></i>
                        <h3>GZ Gayrimenkul</h3>
                    </div>
                    <div class="panel-body text-center">                      
                        <p><span class="glyphicon glyphicon-earphone" aria-hidden="true"><strong> İletişim</strong></span></p>
                        <p>0542 716 33 52</p>
                        <p>0545 786 15 57</p>
                    </div>
                    <ul class="list-group text-center">
                        <li class="list-group-item"><i class="fa fa-check"><p><span class="glyphicon glyphicon-home" aria-hidden="true"><strong> Adres</strong></span></p>Karargahtepe Mah. Çavdar Sok. No:10/B Keçiören/Ankara</li>
                        <li class="list-group-item"><i class="fa fa-check"><p><span class="glyphicon glyphicon-envelope" aria-hidden="true"><strong> E-posta</strong></span></p>gzgayrimenkul@gmail.com</li> 
                    </ul>
                </div>  
                <div>
                    <iframe height="320" scrolling="no" src="https://tr.dailyforex.com/forex-widget/widget/23162" style="width: 255px; height:320px; display: block;border:0px;overflow:hidden;" width="255"></iframe>
                    <span style="position:relative;display:block;color:#000000;width:255px;font-family:arial,sans-serif;font-size:10px;"></span>   
                </div>
            </div>
            <div class="col-md-2"></div>
        </div>
    </div>    
</div>

</body>
</html>


