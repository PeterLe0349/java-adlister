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
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="position-absolute top-50 start-50 translate-middle">
    <div class="card border-success mb-3" style="max-width: 28rem;">
        <div class="card-header text-success">Success!</div>
        <div class="card-body">
            <h5 class="card-title text-success">You deleted:</h5>
            <p class="card-text"><c:out value="${sessionScope.message}"/></p>
        </div>
    </div>
    <a href="http://localhost:8080/ads" class="btn btn-primary">Back to ads</a>
</div>

</body>
</html>
