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
<jsp:include page="/assets/includes.jsp"></jsp:include>
<title>Login Form</title>


    <script type="text/javascript" language="JavaScript" >

        function saveNewUserAJAX() {
            var sendJson = {
                id: -1,
                code: $("#numCode").val(),
                name: $("#txtName").val(),
                family: $("#txtFamily").val(),
                username: $("#txtUsername").val(),
                password: $("#txtPassword").val()
            };
            console.log(JSON.stringify(sendJson));
            $.ajax({
                type: "POST",
                contentType: "application/json; charset=utf-8",
                url: '<c:url value="/rest/getUserName/saveNewUser"/>',
                data: JSON.stringify(sendJson),
                dataType: "json",
                success: function (res) {
                    window.location = '<c:url value="/View/Login/Signin.jsp"/>';
                },else : function (res) {
                    alert("اشتباه داری میزنی دادا !!!");
                }
            });
        }

        function backToSignin() {
            window.location = '<c:url value="/View/Login/Signin.jsp"/>';
        }

    </script>

</head>
<body >
<div class="login-form">
    <form id="submitForm" enctype="application/json">
        <h2 class="text-center">وارد کردن اطلاعات</h2>
        <div class="form-group">
            <input id="numCode" type="text" class="form-control" required="required" dir="rtl" placeholder="کد ملی" required="required">
        </div>
        <div class="form-group">
            <input id="txtName" type="text" class="form-control" required="required" dir="rtl" placeholder="نام" required="required">
        </div>
        <div class="form-group">
            <input id="txtFamily" type="text" class="form-control" required="required" dir="rtl" placeholder="نام خانوادگی" required="required">
        </div>
        <div class="form-group">
            <input id="txtUsername" type="text" class="form-control" required="required" dir="rtl" placeholder="نام کاربری" required="required">
        </div>
        <div class="form-group">
            <input id="txtPassword" type="password" class="form-control" required="required" dir="rtl" placeholder="کلمه عبور" required="required">
        </div>
        <div class="form-group">
            <button id="btnSubmit"type="button" class="btn btn-primary btn-block" onclick="saveNewUserAJAX()">ساخت کاربر</button>
        </div>

    </form>
    <button id="btnChangeToSetup" type="button" class="btn btn-info btn-block mt-2" onclick="backToSignin()">
        برگشت به صفحه ورود
    </button>

</div>
</body>
</html>
