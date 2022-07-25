<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/25/22
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Delete Form</h1>
<form action="/delete" method="post">
    <label for="delete">Enter id of ad to be deleted:</label>
    <input type="number" name="delete" id="delete">
    <input type="submit">
</form>

</body>
</html>
