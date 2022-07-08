<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
        <h4>Hello user: <%= request.getParameter("username")%></h4>
        <h4>Your current password: <%= request.getParameter("password")%></h4>
    </div>

</body>
</html>
