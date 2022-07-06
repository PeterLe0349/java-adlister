<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/6/22
  Time: 12:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp"/>
    <title>View Color</title>
</head>
<body style="background-color: ${param.color};">
<h1>Hello to Color Page</h1>
<h4>The color chosen: ${param.color}</h4>

<jsp:include page="partials/bottom.jsp"/>
</body>
</html>
