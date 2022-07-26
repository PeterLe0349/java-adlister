<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/26/22
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="query response" />
    </jsp:include>
</head>
<body>
<h1>${sessionScope.message}</h1>

</body>
</html>
