
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


    <%--<jsp:include page="../../Scripts/includes.jsp"></jsp:include>--%>

    <script type="text/javascript" language="JavaScript" >

    </script>

</head>
<body>
<div class="login-form col-sm-8">
    <form action="" method="post">
        <h2 class="text-center">گروه کاربری</h2>
        <div class="form-group">
            <input type="text" class="form-control rtl" placeholder="کد" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control rtl" placeholder="نام گروه کاربری" required="required">
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