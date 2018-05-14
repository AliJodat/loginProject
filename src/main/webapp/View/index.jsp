<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="true" %>
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

    <script type="text/javascript" language="JavaScript">

        var indexList = {};

        $(document).ready(function () {
            $.getJSON('<c:url value="/getUserName/getAll" />', function (indexList) {
                $('#trTemplateList').tmpl(indexList).appendTo('#listGrid');
            });
        });

    </script>
</head>
<body>
<div class="container">
    <div class="row">

        <div class="col-sm-4">
            <h1>THIS IS INDEX !</h1>
        </div>

    </div>
    <div class="row">
        <div class="col-sm-8">
            <div class="table-responsive">

                <script id="trTemplateList" type="text/x-jQuery-tmpl">
               <tr>
                    <td>${id}</td>
                    <td>${name}</td>
                    <td>${family}</td>
                    <td>${username}</td>
                    <td>${password}</td>
                    <td>${userRole}</td>
			   </tr>
                </script>

                <table id="listGrid" class="table table-striped text-center">
                    <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Name</th>
                        <th class="text-center">Family</th>
                        <th class="text-center">Username</th>
                        <th class="text-center">Password</th>
                        <th class="text-center">Role</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="col-sm-4">
            <label class="" style="font-size: 3em; font-family: 'Century Gothic';color: #428ea0;">Personnel Lists</label>
        </div>
    </div>

</div>
</body>
</html>
