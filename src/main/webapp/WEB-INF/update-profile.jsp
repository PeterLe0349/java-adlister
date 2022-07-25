<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Update your profile" />
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Fill in the information your would like to update</h1>
    <form action="/profile/update" method="post">
        <div class="form-group">
            <label for="newUsername">New Username</label>
            <input id="newUsername" name="newUsername" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="newEmail">New Email</label>
            <input id="newEmail" name="newEmail" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="newPassword">New Password</label>
            <input id="newPassword" name="newPassword" class="form-control" type="password">
        </div>
        <div class="form-group">
            <label for="confirmPassword">Confirm New Password</label>
            <input id="confirmPassword" name="confirmPassword" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block">
    </form>
</div>
</body>
</html>
