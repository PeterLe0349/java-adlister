<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<%--<h1>${ad.title}</h1>--%>
<%--<p>${ad.description}</p>--%>

<div class="card position-absolute top-50 start-50 translate-middle shadow p-3 mb-5 bg-body rounded" style="width: 30rem;">
    <img src="../../img/comingsoon.png" class="card-img-top" alt="...">
    <div class="card-body">
        <h4 class="card-title">${ad.title}</h4>
        <p class="card-text">${ad.description}</p>
        <p class="card-text text-muted"> Ad ID: ${ad.id}</p>
        <p class="card-text text-muted"> User ID: ${ad.userId}</p>
        <p class="card-text text-muted">Categories:
            <c:forEach var="cat" items="${ad.categories}">
                <c:out value="[${cat}] "/>
            </c:forEach>
        </p>
        <div>
            <a href="http://localhost:8080/ads" class="btn btn-primary">Ads</a>
            <form action="/delete" method="POST" class="d-inline-block">
                <button name="delete" value="${ad.id}" class="btn btn-danger">Delete</button>
            </form>
        </div>
    </div>
</div>

</body>
</html>
