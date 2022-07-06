<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/6/22
  Time: 12:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp"/>
    <title>Pick Color</title>
</head>
<body>
<h1 class="text-center">Pick a Color!</h1>
<div class="container">
    <div class="row">
        <div class="col-12">
            <form action="viewcolor" method="post">
                <label for="color">Color:</label>
                <input type="text" id="color" name="color">
                <input type="submit" value="Send my pick">

            </form>
        </div>
    </div>
</div>

<jsp:include page="partials/bottom.jsp"/>
</body>
</html>
