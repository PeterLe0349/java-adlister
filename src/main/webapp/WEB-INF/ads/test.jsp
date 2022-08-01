<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Test" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <c:choose>
     <c:when test="${user == null}">
        <h2>No User.</h2>
        </c:when>
    <c:otherwise>
       <h1>Hello ${user.username}</h1>
    </c:otherwise>

    </c:choose>




<%--    <h1>Create a new Ad</h1>--%>
<%--    <form action="/test" method="post">--%>
<%--        <div class="form-group">--%>
<%--            <label for="title">Title</label>--%>
<%--            <input id="title" name="title" class="form-control" type="text">--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <label for="description">Description</label>--%>
<%--            <textarea id="description" name="description" class="form-control" type="text"></textarea>--%>
<%--        </div>--%>
<%--        <input class="form-check-input" name="category" type="checkbox" value="1" id="cars">--%>
<%--        <label class="form-check-label" for="cars">Cars</label>--%>
<%--        <input class="form-check-input" name="category" type="checkbox" value="2" id="other">--%>
<%--        <label class="form-check-label" for="other">other</label>--%>
<%--        <input class="form-check-input" name="category" type="checkbox" value="3" id="electronics">--%>
<%--        <label class="form-check-label" for="electronics">electronics</label>--%>
<%--        <input class="form-check-input" name="category" type="checkbox" value="4" id="anime">--%>
<%--        <label class="form-check-label" for="anime">anime</label>--%>
<%--        <input class="form-check-input" name="category" type="checkbox" value="5" id="clothes">--%>
<%--        <label class="form-check-label" for="clothes">clothes</label>--%>
<%--        <input class="form-check-input" name="category" type="checkbox" value="6" id="shoes">--%>
<%--        <label class="form-check-label" for="shoes">shoes</label>--%>
<%--        <input class="form-check-input" name="category" type="checkbox" value="7" id="food">--%>
<%--        <label class="form-check-label" for="food">food</label>--%>
<%--        <br>--%>
<%--        <input type="submit" class="btn btn-block btn-primary">--%>
<%--    </form>--%>
</div>
</body>
</html>
