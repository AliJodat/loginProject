<%--
  Created by IntelliJ IDEA.
  User: Ali
  Date: 4/19/2018
  Time: 5:40 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>


<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <%@ include file="../../Scripts/includes.jsp" %>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login Form</title>


    <%--<jsp:include page="../../Scripts/includes.jsp"></jsp:include>--%>

    <link rel="stylesheet" href="../../Scripts/LoginScripts/custom.css">

<body>
<div class="login-form">
    <form action="" method="post">
        <h2 class="text-center"> مشخصات</h2>
        <div class="form-group">
            <input type="text" class="form-control rtl" placeholder="نام کاربری" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control rtl" placeholder="کلمه عبور" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">جستجو</button>
        </div>
        <%--<div class="clearfix">
            <label class="pull-left checkbox-inline"><input type="checkbox"> Remember me</label>
            <a href="#" class="pull-right">Forgot Password?</a>
        </div>--%>
    </form>
    <%--<p class="text-center"><a href="#">Create an Account</a></p>--%>
</div>
</body>
</html>
