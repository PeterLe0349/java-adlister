<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Delete ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<h1>Delete Form</h1>
<div class="container">
    <form action="/delete" method="post">
        <label for="delete" class="form-label">Enter ID of ad to be deleted:</label>
        <input type="number" name="delete" id="delete" class="form-control">
        <button type="submit" class="mt-2 btn btn-danger">Submit</button>
    </form>
</div>
${sessionScope.message}
</body>
</html>
