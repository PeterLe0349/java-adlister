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
        <hr>
        <img src="" alt="ProfilePic" id="avatarPic" class="img-fluid">

        <h2>Profile Data</h2>

        <h4>Profile ID: <c:out value="${sessionScope.user.id}"/></h4>
        <h4>Username: <c:out value="${sessionScope.user.username}"/></h4>
        <h4>Email: <c:out value="${sessionScope.user.email}"/></h4>
        <hr>
        <h1>Ads posted: </h1>
        <div class="row">
            <c:forEach var="ad" items="${ads}">
                <div class="col-md-6 card m-3 shadow p-3 bg-body rounded" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">Title: <c:out value="${ad.title}"/></h5>
                        <p class="card-text"><c:out value="${ad.description}"/></p>

                        <form action="/ad" method="POST">
                            <button name="id" value="${ad.id}" class="btn btn-success shadow rounded">view details</button>
                        </form>

                    </div>
                </div>
            </c:forEach>
        </div>

    </div>

</body>
<script>
    fetch("https://randomuser.me/api/").then(res => res.json()).then(user =>{
        console.log(user);
        let url = user.results[0].picture.large;
        console.log(user.results[0].picture.large);
        document.getElementById("avatarPic").src=url;
    });
</script>
</html>
