<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/6/22
  Time: 1:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp"/>
    <title>Outcome</title>
</head>
<body>
<h1 class="text-center">The outcome is...</h1>
<div class="container">
    <div class="row">
        <div class="col-12">
            <h1>----<%= request.getAttribute("number") %>---</h1>
            <h1>----<%= request.getAttribute("message") %>----</h1>
            ${param.number}
        </div>
    </div>
</div>

<jsp:include page="partials/bottom.jsp"/>
</body>
</html>
