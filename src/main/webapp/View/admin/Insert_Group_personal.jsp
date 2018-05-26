<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <jsp:include page="/assets/includes.jsp"></jsp:include>
    <title>Insert_Group_Persnal</title>
</head>
<script type="text/javascript" language="JavaScript">

    $(document).ready(function () {
        $.getJSON('<c:url value="/getInsertGroupPersonal/getAll" />', function (groupList) {
            $('#trGroupList').tmpl(groupList).appendTo('#groupListGrid');
        });
    });

    function saveNewGroupUserAJAX() {
        var sendJson = {
            id: -1,
            role: $("#txtName").val()
        };
        $.ajax({
            type: "POST",
            contentType: "application/json; charset=utf-8",
            url: '<c:url value="/getInsertGroupPersonal/saveNewGroup"/>',
            data: JSON.stringify(sendJson),
            dataType: "json",
            success: function (res) {
                window.location = '<c:url value="/View/admin/index.jsp"/>';
            }
        });
    }
</script>
<body>
<div class="container">
    <div class="row">
        <div class="col-sm-4">
            <div class="Insert_Group_persnal">
                <form id="submitForm" enctype="application/json">
                    <h2 class="text-center">وارد کردن اطلاعات</h2>
                    <div class="form-group">
                        <input id="txtName" type="text" class="form-control" required="required" dir="rtl"
                               placeholder="نام گروه" required="required"/>
                    </div>
                    <div class="form-group">
                        <button id="btnSubmit" type="button" class="btn btn-primary btn-block"
                                onclick="saveNewGroupUserAJAX()">ساخت گروه
                        </button>
                    </div>
                </form>
            </div>
        </div>
        <div class="col-sm-5">
            <div class="col-sm-12">
                <label class="" style="font-size: 3em; font-family: 'Century Gothic';color: #428ea0;">لیست گروهها</label>
            </div>

            <div class="col-sm-12">
                <div class="table-responsive table-hover">

                    <script id="trGroupList" type="text/x-jQuery-tmpl">
                         <tr>
                              <td>${id}</td>
                              <td>${role}</td>
			             </tr>
                    </script>

                    <table id="groupListGrid" class="table table-striped text-center ">
                        <thead>
                        <tr>
                            <th class="text-center">ID</th>
                            <th class="text-center">Roles</th>
                        </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
