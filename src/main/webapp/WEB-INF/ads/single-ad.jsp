<%--
  Created by IntelliJ IDEA.
  User: justinwelsh
  Date: 7/25/22
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Ad" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<h1>${ad.title}</h1>
<p>${ad.description}</p>

</body>
</html>
