<%--
  Created by IntelliJ IDEA.
  User: Ali
  Date: 4/19/2018
  Time: 12:15 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>


<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<jsp:include page="/Scripts/includes.jsp"></jsp:include>
<title>Login Form</title>


    <script type="text/javascript" language="JavaScript" >
        $(document).ready(function () {
            $.getJSON('<c:url value="/Login/Login" />', function (indexEnter) {
                //$('#trTemplate').tmpl(indexEnter).appendTo('#reportGrid');
            });
        });

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
