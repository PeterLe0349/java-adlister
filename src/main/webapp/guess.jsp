<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/6/22
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp"/>
    <title>Guess</title>
</head>
<body>
<h1 class="text-center">Guess a number between 1 and 3!</h1>
<div class="container">
    <div class="row">
        <div class="col-12">
            <form action="/guess" method="post">
                <label for="number">Number:</label>
                <input type="number" id="number" name="number">
                <input type="submit" value="Send my pick">

            </form>
        </div>
    </div>
</div>

<jsp:include page="partials/bottom.jsp"/>
</body>
</html>
