<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 6/27/22
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ include file="partials/head.jsp" %>
</head>
<body>
<p class="text-center">Hello User: ${param.username} with Pasword: ${param.password}</p>
<%--<% String name = request.getParameter("username"); new String(name); %>--%>
<h1>Returned value:   <%= request.getParameter("username") %></h1>
<% if (request.getParameter("username")!=null  && (request.getParameter("password")!=null )) {
    if ((request.getParameter("username").equals("admin")) && (request.getParameter("password").equals("password"))){
    response.sendRedirect("/profile.jsp");
    }
} %>
<%--<%System.out.println(request.getParameter("username"));%>--%>
<%@ include file="partials/navbar.jsp" %>
<form method="POST" action="/login.jsp">
    <label for="username">Login:</label>
    <input id="username" name="username" placeholder="Enter your username" />
    <label for="password">Login:</label>
    <input id="password" name="password" placeholder="Enter your password" />
    <button type="submit">Submit</button>
</form>

</body>
</html>
