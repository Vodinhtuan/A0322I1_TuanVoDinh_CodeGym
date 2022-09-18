<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/09/2022
  Time: 9:45 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/product">Return List</a>
<table border="1">
    <tr>
        <td>ID</td>
        <td>${product.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${product.name}</td>
    </tr>
    <tr>
        <td>Description</td>
        <td>${product.description}</td>
    </tr>
    <tr>
        <td>Manufacture</td>
        <td>${product.manufacture}</td>
    </tr>
    <tr>
        <td>Price</td>
        <td>${product.price}</td>
    </tr>
</table>
</body>
</html>
