<%--
  Created by IntelliJ IDEA.
  User: devchino
  Date: 7/25/22
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Update Ad" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>Update Ad</h1>
    <form action="/update-ads" method="post">
        <div class="form-group">
            <label for="adId" class="form-label">Enter ID of ad to be updated:</label>
            <input type="number" name="adId" id="adId" class="form-control">
        </div>
        <div class="form-group">
            <label for="title">New Title</label>
            <input id="title" name="title" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="description">New Description</label>
            <textarea id="description" name="description" class="form-control" type="text"></textarea>
        </div>
        <input type="submit" class="btn btn-block btn-primary">
    </form>
    ${sessionScope.message}
</div>
</body>
</html>
