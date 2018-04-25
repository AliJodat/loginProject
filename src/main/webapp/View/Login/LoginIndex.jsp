<%--
  Created by IntelliJ IDEA.
  User: Ali
  Date: 4/19/2018
  Time: 5:40 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <jsp:include page="/Scripts/includes.jsp"></jsp:include>
    <title>Login Form</title>

    <script type="text/javascript" language="JavaScript" >
    $(document).ready(function() {


    });
    function saveStudentAJAX() {
        var sendJson = {
            username: $("#txtUsername").val(),
            password: $("#txtPassword").val()
        };
        console.log(JSON.stringify(sendJson));
        $.ajax({
            type: "POST",
            contentType: "application/json; charset=utf-8",
            url: '<c:url value="/getUserName/findPersonalByUsername"/>',
            data: JSON.stringify(sendJson),
            dataType: "json",
            success: function (res) {
                window.location.assign("/index");
            }
        });
    }
    
    function changeToSetup() {
        window.location.assign("/login")
    }


    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="login-form col-sm-4">
            <form id="submitForm" enctype="application/json">
                <h2 class="text-center"> مشخصات</h2>
                <input id="txtUsername" type="text" class="form-control rtl mt-2" placeholder="نام کاربری" required="required">
                <input id="txtPassword" type="password" class="form-control rtl mt-2" placeholder="رمز عبور" required="required">
                <button id="enterButt" type="button" class="btn btn-primary btn-block mt-2" onclick="saveStudentAJAX()">ورود</button>

                <%--<div class="clearfix">
                    <label class="pull-left checkbox-inline"><input type="checkbox"> Remember me</label>
                    <a href="#" class="pull-right">Forgot Password?</a>
                </div>--%>
            </form>
            <button id="btnChangeToSetup" type="button" class="btn btn-info btn-block mt-2" onclick="changeToSetup()">ساخت حساب کاربری جدید</button>
        </div>

    </div>
</div>

</body>
</html>
