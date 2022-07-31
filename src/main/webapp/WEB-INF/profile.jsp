<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
        <h1>Welcome, <c:out value="${sessionScope.user.username}"/>!</h1>

        <h2>Profile Data</h2>
        <h4>Profile ID: <c:out value="${sessionScope.user.id}"/></h4>
        <h4>Username: <c:out value="${sessionScope.user.username}"/></h4>
        <h4>Email: <c:out value="${sessionScope.user.email}"/></h4>
    </div>

</body>
</html>
