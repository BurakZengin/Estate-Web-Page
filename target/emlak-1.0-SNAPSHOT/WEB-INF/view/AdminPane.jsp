<%-- 
    Document   : AdminPane
    Created on : 25.Kas.2017, 21:13:42
    Author     : ELIDOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-9">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    <s:url var="url_HouseForSale" value="/HouseForSale/"/>
    <title>GZ Gayrimenkul</title>
</head>
<body>
    <jsp:include page="include/nav.jsp"/>
<div class="row">
    <div class="col-md-5">
        <div class="col-md-1"></div>
        <div class="col-md-10">
            <div class="list-group">
                <c:forEach var="c" items="${adresList}" varStatus="st">
                    <a href="<s:url value="/SetHome/${c.evlerId}"/>"><button style="width: 100%; font-size: small;"type="button" class="btn btn-default btn-lg">${c.adres}</button></a>
                    </c:forEach>
            </div>
        </div>  
        <div class="col-md-1"></div>
    </div>
    <div class="col-md-6">
        <s:url var="url_reg"  value="/SaveHome"/>
        <f:form action="${url_reg}" modelAttribute="command">
            <div class="row">
                <div class="col-md-6">
                    <table class="table">
                        <thead>
                            <tr>
                                <th style="width: 150px;">İlan Detayları</th>
                                <th style="text-align: center;">İçerik</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Emlak Tipi</td>
                                <td><f:select path="emlak.tip" class="form-control" name="" id="location1">
                            <option>Satilik</option>
                            <option>Kiralik</option>
                        </f:select>
                        </td>
                        </tr>
                        <tr>
                            <td>Metrekare</td>
                            <td><f:input path="emlak.metreKare" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Oda</td>
                            <td><f:input path="emlak.odaSayisi" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Bina Yaşı</td>
                            <td><f:input path="emlak.binaYasi" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Bulunduğu Kat</td>
                            <td><f:input path="emlak.bulunduguKat" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Kat Sayısı</td>
                            <td><f:input path="emlak.katSayisi" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Isınma</td>
                            <td><f:input path="emlak.isinma" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Banyo Sayısı</td>
                            <td><f:input path="emlak.banyoSayisi" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Eşyalı</td>
                            <td><f:select path="emlak.esyali" class="form-control" name="" id="location1">
                            <option>Evet</option>
                            <option>Hayır</option>
                        </f:select></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="col-md-6">
                    <table class="table" id="table2">
                        <thead>
                            <tr>
                                <th style="width: 150px;">İlan Detayları</th>
                                <th style="text-align: center;" scope="col">İçerik</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Kullanım Durumu</td>
                                <td><f:select path="emlak.kullanimDurumu" class="form-control" name="" id="location1">
                            <option>Bos</option>
                            <option>Dolu</option>
                        </f:select></td>
                        </tr>
                        <tr>
                            <td>Site İçerisinde</td>
                            <td><f:select path="emlak.siteIcerisinde" class="form-control" name="" id="location1">
                            <option>Evet</option>
                            <option>Hayir</option>
                        </f:select>
                        </td>
                        </tr>
                        <tr>
                            <td>Aidat</td>
                            <td><f:input path="emlak.aidat" type="text" class="form-control" id="usr"/>
                            </td>
                        </tr>
                        <tr>
                            <td>Krediye Uygun</td>
                            <td><f:select path="emlak.krediyeUygun" class="form-control" name="" id="location1">
                            <option>Evet</option>
                            <option>Hayir</option>
                        </f:select></td>
                        </tr>
                        <tr>
                            <td>Kimden</td>
                            <td><f:select path="emlak.kimden" class="form-control" name="" id="location1">
                            <option>Sahibinden</option>
                            <option>Emlak Ofisinden</option>
                        </f:select></td>
                        </tr>
                        <tr>
                            <td>Takas</td>
                            <td><f:select path="emlak.takas" class="form-control" name="" id="location1">
                            <option>Evet</option>
                            <option>Hayir</option>
                        </f:select></td>
                        </tr>
                        <tr>
                            <td>İl</td>
                            <td><f:input path="emlak.konum" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>İlçe</td>
                            <td><f:input path="emlak.bolge" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Adres</td>
                            <td><f:input path="emlak.adres" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        <tr>
                            <td>Fiyat</td>
                            <td><f:input path="emlak.fiyat" type="text" class="form-control" id="usr"/></td>
                        </tr>
                        </tbody>
                    </table>  
                </div>
                <div class="row"> 
                    <h5 align="left" style="margin-left: 20px;">İlan Detayları</h5>
                    <f:textarea path="emlak.aciklama" style="border:solid 1px cornflowerblue; width: 100%; height: 300px; margin-bottom: 30px; resize: vertical; border-radius: 10px;" ></f:textarea>
                    <div class="pull-right">
                        <button style="width: 110px; margin-right: 10px; margin-bottom: 50px;" class="btn btn-primary" type="submit" >İlan Ekle</button> 
                    </div>
                </div>
            </div>
        </f:form>
    </div>
    <div class="col-md-1"></div>
</div>
</body>
</html>
