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
<%--<h1>Returned username value:   <%= request.getParameter("username") %></h1>--%>
<%--<% String name = request.getParameter("username"); new String(name); %>--%>
<% if (request.getParameter("username")!=null  && (request.getParameter("password")!=null )) {
    if ((request.getParameter("username").equals("admin")) && (request.getParameter("password").equals("password"))){
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }else {
        request.setAttribute("username", "nothing");
        request.setAttribute("password", "nothing");
    }
} %>
<%--<%System.out.println(request.getParameter("username"));%>--%>
<p class="text-center">Hello User: ${param.username} with Pasword: ${param.password}</p>
<%@ include file="partials/navbar.jsp" %>
<form method="POST" action="/login.jsp" id="form1">
    <label for="username">Login:</label>
    <input id="username" name="username" placeholder="Enter your username" />
    <label for="password">Login:</label>
    <input id="password" name="password" placeholder="Enter your password" />
    <button type="submit">Submit</button>
</form>

</body>
</html>
