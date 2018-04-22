<%--
  Created by IntelliJ IDEA.
  User: Ali
  Date: 4/19/2018
  Time: 12:15 AM
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
    <%@ include file="/Scripts/includes.jsp" %>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login Form</title>


    <%--<jsp:include page="../../Scripts/includes.jsp"></jsp:include>--%>

    <link rel="stylesheet" href="/Scripts/LoginScripts/custom.css">

    <script type="text/javascript" language="JavaScript" >

    </script>

</head>
<body >
<div class="login-form">
    <form action="/examples/actions/confirmation" method="post">
        <h2 class="text-center">وارد کردن اطلاعات</h2>
        <div class="form-group">
            <input type="text" class="form-control" dir="rtl" placeholder="کد ملی" required="required">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" dir="rtl" placeholder="نام" required="required">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" dir="rtl" placeholder="نام خانوادگی" required="required">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" dir="rtl" placeholder="نام کاربری" required="required">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" dir="rtl" placeholder="کلمه عبور" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Log in</button>
        </div>

    </form>

</div>
</body>
</html>
