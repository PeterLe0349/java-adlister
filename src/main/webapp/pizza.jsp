<%--
  Created by IntelliJ IDEA.
  User: fiermac
  Date: 7/6/22
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- JQuery CDN 3.6 -->
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    <title>Pizza Form</title>
</head>
<body>
<h1 class="text-center">Welcome to the Pizza Form</h1>
<div class="container">
    <div class="row">
        <div class="col-12" id="displayMain">
                <h3>Design your Pizza</h3>
            <form id="pizzaForm" action="pizza-order" method="post">
<%--                crust--%>
                <label for="crust">Choose a crust:</label>
                <select id="crust" name="crust">
                    <option value="thin">Thin</option>
                    <option value="pan">Pan</option>
                </select>
<%--                sauce--%>
                <label for="sauce">Choose a sauce:</label>
                <select id="sauce" name="sauce">
                    <option value="tomato">Tomato</option>
                    <option value="marinara">Marinara</option>
                </select>
<%--                size--%>
                <label for="size">Choose a size:</label>
                <select id="size" name="size">
                    <option value="small">Small</option>
                    <option value="large">Large</option>
                </select>
<%--                address --%>
                <br>
                <label for="address">Address</label><br>
                <input type="text" id="address" name="address" class=""><br>
<%--                toppings --%>
                <input type="checkbox" id="topping1" name="topping" value="pepperoni">
                <label for="topping1">Pepperoni</label><br>
                <input type="checkbox" id="topping2" name="topping" value="olive">
                <label for="topping2">Olive</label><br>
                <input type="checkbox" id="topping3" name="topping" value="mushroom">
                <label for="topping3">Mushroom</label>
                <input type="submit" value="Submit">
            </form >
        </div>
    </div>
</div>
<!-- Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
