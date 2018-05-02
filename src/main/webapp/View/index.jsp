
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
<table border="1" style="width: 100%">
    <tr>
        <td>ID</td>
        <td>NAME</td>
        <td>FAMILY</td>
        <td>Username</td>
        <td>Role</td>
        <td>Pass</td>
    </tr>
    <input type="button" value="list" onclick="getPersonAll()">
    <c:forEach items="${requestScope.list}" var="p">
        <tr>
            <form action="/person/change.do">
                <td><input type="text" name="id" value="${p.id}" readonly></td>
                <td><input type="text" name="name" value="${p.name}"></td>
                <td><input type="text" name="family" value="${p.family}"></td>
                <td><input type="text" name="model" value="${p.car.model}"></td>
                <td><input type="submit" value="change"></td>
                <td><input type="button" value="remove" onclick="removePerson(${p.id})"></td>
            </form>
        </tr>
    </c:forEach>
    <script>
        function removePerson(id) {
            window.location="/person/delete.do?id="+id;
        }
    </script>
    <script>
        function getPersonAll() {
            window.location="/getUserName/getPersonAll";
        }
    </script>
</table>
</body>
</html>
