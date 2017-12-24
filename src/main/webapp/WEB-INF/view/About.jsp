<%-- 
    Document   : About
    Created on : 25.Kas.2017, 18:56:33
    Author     : ELIDOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
    <s:url var="url_profile" value="/static/images/profile.jpg"/>
    <s:url var="url_css" value="/static/css/About.css"/>
    <link href="${url_css}" rel="stylesheet" type="text/css"/>
    <s:url var="url_bg" value="/static/images/bgAbout.jpg"/>
     <title>GZ Gayrimenkul</title>
</head>

<body background="${url_bg}">

    <jsp:include page="include/nav.jsp"/>

<div class="row">
    <div class="col-md-5">
        <img id="lefDiv" class="img-rounded" src="${url_profile}" alt="profile" style="width:80%; height: 80%;"/>
    </div>

    <div class="col-md-7">
        <h1>Gürkan Zengin</h1>
        <h4 id="h4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Albert Einstein, Güney Almanya'nın Ulm kentinde dünyaya geldi. Küçük bir elektrokimya fabrikasının sahibi olan babası başarılı bir iş adamı değildi. Annesinin dünyası müzikti; özellikle Beethoven'in piyano parçalarını çalmak en büyük tutkusuydu. Aile Musevî kökenliydi, ama dinsel bağnazlıktan uzak, açık görüşlü, kültürel etkinliklerle zengin bir yaşam içindeydi. Ne var ki, çocuğun ilk yıllardaki gelişmesi kaygı vericiydi. Özellikle konuşmadaki gecikmesi aileyi telaşa düşürmüştü.
            Albert, içine kapanıktı; çocukların arasına katılmaktan, oyun oynamaktan hoşlanmıyordu. Okulu sıkıcı buluyor, ezbere dayanan eğitim disiplinine katlanamıyordu. "Gimnazyum"da geçen orta öğrenimi mutsuz ve başarısızdı. Mühendis amcasının özel ilgisi olmasaydı, belki de öğrenimden tümüyle kopacaktı. Amca, yeğene cebir ve geometriyi sevdirdi. Geometri özellikle Albert'i bir tür büyülemişti.
            Einstein, yıllar sonra amcasına borcunu şöyle dile getirir: "Çocukluğumda yaşadığım iki önemli olayı unutamam. Biri, beş yaşımda iken amcamın armağanı pusulada bulduğum gizem; diğeri on iki yaşımda iken tanıştığım Öklit geometrisi. Gençliğinde bu geometrinin büyüsüne girmeyen bir kimsenin ilerdi kuramsal bilimde parlak bir atılım yapabileceği hiç beklenmemelidir!" 
            Einstein, yüksek öğrenimini güç koşullara göğüs gererek Zürih Teknik Üniversitesi'nde yapar. Mezun olduğunda iş bulmak sorunuyla karşılaşır. Üniversitede asistanlık bir yana orta okul öğretmenliği bile bulamaz. Sonunda bir okul arkadaşının yardımıyla Bern Patent Ofisi'nde sıradan bir işe yerleşir; ama asıl dünyası olan bilimden kopmaz; çok geçmeden büyüsü bugün de süren devrimsel atılımlarıyla yaratıcı dehasını kanıtlar. 1905'te Annalen der Physik dergisinde yayımlanan üç çalışmasının her biri, fizik tarihinde bir dönüm noktası sayılabilecek nitelikteydi.
        </h4>
    </div>
</div>
</body>
</html>
