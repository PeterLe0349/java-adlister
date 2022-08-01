<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    hi--%>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to Adlister!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />
    <div class="container">
        <h1 class="text-center">Welcome to the Adlister!</h1>
        <br>
        <div class="card" style="width: 18rem;">
            <img src="/img/teamUmbriel.png" class="card-img-top" alt="teampic">
            <div class="card-body">
                <h5 class="card-title">Team 1</h5>
                <p class="card-text">@<em>Almeidafiend Kellwelshle Corporation</em></p>
                <a href="https://github.com/Almeida-Fiend-Kell-Welsh-Le-Umbriel/java-adlister" class="btn btn-primary">Corporate link</a>
            </div>
        </div>

    </div>
</body>
</html>
