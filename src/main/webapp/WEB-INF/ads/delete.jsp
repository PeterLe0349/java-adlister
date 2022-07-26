<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/25/22
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Delete Ads" />
    </jsp:include>
</head>
<body>
<h1>Delete Form</h1>
<div class="container">
    <form action="/delete" method="post">
        <label for="delete" class="form-label">Enter ID of ad to be deleted:</label>
        <input type="number" name="delete" id="delete" class="form-control">
        <button type="submit" class="mt-2 btn btn-danger">Submit</button>
    </form>
</div>

</body>
</html>
