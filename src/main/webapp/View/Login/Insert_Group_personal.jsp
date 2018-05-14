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
    <title>Insert_Group_Persnal</title>
</head>
<script type="text/javascript" language="JavaScript">
    $(document).ready(function () {
        $.getJSON('<c:url value="/Login/Insert_Group_personal" />', function (indexEnter) {
            //$('#trTemplate').tmpl(indexEnter).appendTo('#reportGrid');
        });
    });

    function saveNewGroupUserAJAX() {
        var sendJson = {
            id: -1,
            userRoleString: $("#txtName").val()
        };
        console.log(JSON.stringify(sendJson));
        $.ajax({
            type: "POST",
            contentType: "application/json; charset=utf-8",
            url: '<c:url value="/getInsert_Group_personal/saveNewGroup"/>',
            data: JSON.stringify(sendJson),
            dataType: "json",
            success: function (res) {
                window.location.assign("/");
            }
        });
    }
</script>
<body>
<div class="container">
    <div class="row text-center">
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
    </div>
</div>

</body>
</html>
