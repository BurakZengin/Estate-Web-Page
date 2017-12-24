<%-- 
    Document   : HomeDetail
    Created on : 24.Kas.2017, 21:02:54
    Author     : ELIDOR
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"/>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    <s:url var="url_css" value="/static/css/HomeDetail.css"/>
    <s:url var="url_bg" value="/static/images/bgSale.jpg"/>
    <s:url var="url_bge" value="/static/images/bgRent.jpg"/>
    <link href="${url_css}" rel="stylesheet" type="text/css"/>
    <s:url var="url_tl" value="/static/images/tl.jpg"/>
    <title>GZ Gayrimenkul</title>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar navbar-light" style="background-color: #222222;" id="nav">
        <a style="color: #999999" class="navbar-brand mb-0 h1" href="/emlak/HouseForSale">GZ Gayrimenkul & Danışmanlık</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto" id="li">
                <li class="nav-item active" >
                    <a style="color: #999999" class="nav-link" href="/emlak/HouseForSale">Ana Sayfa <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a style="color: #999999" class="nav-link" href="/emlak/About">Hakkında</a>
                </li>  
            </ul>
        </div>
    </nav>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-1"></div>
        <div class="col-md-8">
            <div class="col-md-12" style="margin-top: 20px;">
                <table class="table table-striped" >
                    <thead>
                        <tr>
                            <th width="70%">İlan Fotoğrafları</th>
                            <th font-size="1">İlan İçeriği</th>
                        </tr>
                    </thead>
                    <tbody>            
                        <tr>
                            <c:forEach var="c" items="${homeDetail}" varStatus="st">
                                <td>
                        <div id="myCarousel" class="carousel slide" data-ride="carousel">
                            <!-- Indicators -->
                            <ol class="carousel-indicators">
                                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                                <li data-target="#myCarousel" data-slide-to="1"></li>
                                <li data-target="#myCarousel" data-slide-to="2"></li>
                            </ol>

                            <!-- Wrapper for slides -->
                            <div class="carousel-inner">

                                <div class="carousel-item active">
                                    <img src="${url_bg}" alt="Los Angeles" style="width:100%;">
                                </div>

                                <div class="carousel-item">
                                    <img src="${url_bge}" alt="Chicago" style="width:100%;">
                                        <div class="carousel-caption">
                                            <h3>Chicago</h3>
                                            <p>Thank you, Chicago!</p>
                                        </div>
                                </div>

                                <div class="carousel-item">
                                    <img src="${url_bg}" alt="New York" style="width:100%;">
                                        <div class="carousel-caption">
                                            <h3>New York</h3>
                                            <p>We love the Big Apple!</p>
                                        </div>
                                </div>

                            </div>

                            <!-- Left and right controls -->
                            <a class="carousel-control-prev" href="#myCarousel" role="button" data-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="sr-only">Previous</span>
                            </a>
                            <a class="carousel-control-next" href="#myCarousel" data-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="sr-only">Next</span>
                            </a>
                        </div>
                        <div>
                            <h5 id="aciklama" align="left">İlan Detayları</h5>
                            <textarea disabled style="border:solid 1px #999999;" name="" id="textArea" cols="45" rows="10">${c.aciklama}</textarea>
                        </div>
                        </td>
                        <td>
                        <div id="icerik">
                            <h3 id="fiyat" align="left">${c.fiyat} <img src="${url_tl}" alt=""></img></h3>
                            <font align="left" size="2.5">${c.adres}</font>
                            <table class="table" id="table2" items="${homeDetail}" style="font-size: 14px;">
                                <tr>
                                    <td align="left">Emlak Tipi</td>
                                    <td align="left">${c.tip}</td>
                                </tr>
                                <tr>
                                    <td align="left">m²</td>
                                    <td align="left">${c.metreKare}</td>
                                </tr>
                                <tr>
                                    <td align="left">Oda</td>
                                    <td align="left">${c.odaSayisi}</td> 
                                </tr> 
                                <tr>
                                    <td align="left">Bina Yaşı</td>
                                    <td align="left">${c.binaYasi}</td>
                                </tr>
                                <tr>
                                    <td align="left">Bulunduğu Kat</td>
                                    <td align="left">${c.bulunduguKat}</td>
                                </tr>
                                <tr>
                                    <td align="left">Kat Sayısı</td>
                                    <td align="left">${c.katSayisi}</td>
                                </tr>
                                <tr>
                                    <td align="left">Isınma</td>
                                    <td align="left">${c.isinma}</td>
                                </tr>
                                <tr>
                                    <td align="left">Banyo Sayısı</td>
                                    <td align="left">${c.banyoSayisi}</td>
                                </tr>
                                <tr>
                                    <td align="left">Eşyalı</td>
                                    <td align="left">${c.esyali}</td>
                                </tr>
                                <tr>
                                    <td align="left">Kullanım Durumu</td>
                                    <td align="left">${c.kullanimDurumu}</td>
                                </tr>
                                <tr>
                                    <td align="left">Site İçerisinde</td>
                                    <td align="left">${c.siteIcerisinde}</td>
                                </tr>
                                <tr>
                                    <td align="left">Aidat</td>
                                    <td align="left">${c.aidat}</td>
                                </tr>
                                <tr>
                                    <td align="left">Krediye Uygun</td>
                                    <td align="left">${c.krediyeUygun}</td>
                                </tr>
                                <tr>
                                    <td align="left">Kimden</td>
                                    <td align="left">${c.kimden}</td>
                                </tr>
                                <tr>
                                    <td align="left">Takas</td>
                                    <td align="left">${c.takas}</td>
                                </tr>
                            </table>
                        </div>
                        </td>
                    </c:forEach>
                    </tr> 
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-md-3">
            <div class="col-md-12 text-center" style="margin-top: 40px;">
                <ul class="list-group text-center">
                    <li class="list-group-item" style="background-color: #f2dede; color: #b94a48; font-size: 25px;"><i class="fa fa-check"><p><span class="glyphicon glyphicon-envelope" aria-hidden="true"> GZ Gayrimenkul</span></p></li>
                    <li class="list-group-item"><i class="fa fa-check"><p><span class="glyphicon glyphicon-envelope" aria-hidden="true"><strong> İletişim</strong></span></p>0542 716 33 52<br>0545 786 15 57</li>
                    <li class="list-group-item"><i class="fa fa-check"><p><span class="glyphicon glyphicon-home" aria-hidden="true"><strong> Adres</strong></span></p>Karargahtepe Mah. Çavdar Sok. No:10/B Keçiören/Ankara</li>
                    <li class="list-group-item"><i class="fa fa-check"><p><span class="glyphicon glyphicon-envelope" aria-hidden="true"><strong> E-posta</strong></span></p>gzgayrimenkul@gmail.com</li> 
                </ul>
            </div>
        </div>
    </div>
</div>

</body>
</html>
