<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/7/22
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<jsp:include page="../partials/head2.jsp"/>
    <title>Ads Display</title>
</head>
<body>
<h1 class="text-center">Ads Display</h1>
<div class="container">
    <div class="row">
        <div class="col-12" id="displayMain">
            <h4>Displaying ads:</h4>
            <c:forEach var="ad" items="${ads}">
<%--                class name can be different --%>
                <div class="ad">
                    <h2>${ad.title}</h2>
                    <p>Description: ${ad.description}</p>
                </div>
            </c:forEach>

        </div>
    </div>
</div>

    <jsp:include page="../partials/bottom.jsp"/>
</body>
</html>
