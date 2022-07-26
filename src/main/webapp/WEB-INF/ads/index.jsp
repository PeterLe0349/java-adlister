<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <div class="row">
        <c:forEach var="ad" items="${ads}">
            <div class="col-md-6 card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title"><c:out value="${ad.title}"/></h5>
                    <h6 class="card-subtitle mb-2 text-muted">Post ID: <c:out value="${ad.id}"/></h6>
                    <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                    <p class="card-text"><c:out value="${ad.description}"/></p>
                    <a href="#" class="card-link">Ad link</a>
                    <form action="/ad" method="POST">
                        <button name="id" value="${ad.id}"><c:out value="${ad.id}"/></button>
                    </form>

<%--                    individual ad link would redirect to single ad servlet --%>
                </div>
            </div>
        </c:forEach>
    </div>

</div>

</body>
</html>
