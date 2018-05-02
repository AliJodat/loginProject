
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


    <script type="text/javascript" language="JavaScript">

        $(document).ready(function () {

            $.getJSON('<c:url value="/index" />', function (indexEnter) {
                //$('#trTemplate').tmpl(indexEnter).appendTo('#reportGrid');
            });
        });

    </script>
</head>
<body>
<h1>THIS IS INDEX !</h1>
</body>
</html>
