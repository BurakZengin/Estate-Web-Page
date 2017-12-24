<%-- 
    Document   : Login
    Created on : 25.Kas.2017, 20:41:06
    Author     : ELIDOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet"/>
    <title>GZ Gayrimenkul</title>
</head>
<body>
    <jsp:include page="include/nav.jsp"/>
<div class="col-md-5"></div>

<div class="col-md-2"><br><br>

    <s:url var="url_login"  value="/AdminPane"/>
    <f:form action="${url_login}" modelAttribute="command" id="form">
        <h2 class="form-signin-heading" align="center">Admin Paneli</h2>
        <f:input path="username" type="user" id="inputEmail" class="form-control" placeholder="Kullanıcı Adı" required="" autofocus=""/><br>
        <f:input path="password" type="password" id="inputPassword" class="form-control" placeholder="Şifre" required=""/><br>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </f:form>
</div>

<div class="col-md-5"></div>
</body>
</html>
