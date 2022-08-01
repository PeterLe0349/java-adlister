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
<%--        cat 1--%>
            <h1>Cars</h1>
        <c:forEach var="ad" items="${ads1}">
            <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                    <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                    <p class="card-text"><c:out value="${ad.description}"/></p>

                    <form action="/ad" method="POST">
                        <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                    </form>
                        <%--                    individual ad link would redirect to single ad servlet --%>
                </div>
            </div>
        </c:forEach>
    <%--        cat 2--%>
        <h1>Other</h1>
    <c:forEach var="ad" items="${ads2}">
        <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                <p class="card-text"><c:out value="${ad.description}"/></p>

                <form action="/ad" method="POST">
                    <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                </form>
                    <%--                    individual ad link would redirect to single ad servlet --%>
            </div>
        </div>
    </c:forEach>
    <%--        cat 3--%>
        <h1>Electronics</h1>
    <c:forEach var="ad" items="${ads3}">
        <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                <p class="card-text"><c:out value="${ad.description}"/></p>

                <form action="/ad" method="POST">
                    <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                </form>
                    <%--                    individual ad link would redirect to single ad servlet --%>
            </div>
        </div>
    </c:forEach>
    <%--        cat 4--%>
        <h1>Anime</h1>
    <c:forEach var="ad" items="${ads4}">
        <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                <p class="card-text"><c:out value="${ad.description}"/></p>

                <form action="/ad" method="POST">
                    <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                </form>
                    <%--                    individual ad link would redirect to single ad servlet --%>
            </div>
        </div>
    </c:forEach>
    <%--        cat 5--%>
        <h1>Clothes</h1>
    <c:forEach var="ad" items="${ads5}">
        <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                <p class="card-text"><c:out value="${ad.description}"/></p>

                <form action="/ad" method="POST">
                    <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                </form>
                    <%--                    individual ad link would redirect to single ad servlet --%>
            </div>
        </div>
    </c:forEach>
    <%--        cat 6--%>
    <h1>Shoes</h1>
    <c:forEach var="ad" items="${ads6}">

        <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                <p class="card-text"><c:out value="${ad.description}"/></p>

                <form action="/ad" method="POST">
                    <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                </form>
                    <%--                    individual ad link would redirect to single ad servlet --%>
            </div>
        </div>
    </c:forEach>
    <%--        cat 7--%>
    <h1>Food</h1>
    <c:forEach var="ad" items="${ads7}">
        <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
            <div class="card-body">
                <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                <h6 class="card-subtitle mb-2 text-muted">Posted by User#<c:out value="${ad.userId}"/></h6>
                <p class="card-text"><c:out value="${ad.description}"/></p>

                <form action="/ad" method="POST">
                    <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                </form>
                    <%--                    individual ad link would redirect to single ad servlet --%>
            </div>
        </div>
    </c:forEach>
    </div>

</div>

</body>
</html>
