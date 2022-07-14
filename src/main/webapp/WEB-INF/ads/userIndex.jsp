<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Users" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Displaying Users from PetersPostings</h1>
    <hr>

    <c:forEach var="user" items="${users}">
        <div class="col-md-6">
            <h2><c:out value="${user.username}" /></h2>
            <p><c:out value="${user.email}" /></p>
            <p><c:out value="${user.password}" /></p>
        </div>
    </c:forEach>
</div>

</body>
</html>
