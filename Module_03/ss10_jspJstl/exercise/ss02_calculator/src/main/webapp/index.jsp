<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 15/09/2022
  Time: 12:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculate</title>
  </head>
  <body>
  <form action="/CalServlet" method="get">
    Enter the first number: <input type="number" name="first"> <br/>
    Enter the second number: <input type="number" name="second"> <br/>
    Math: <select name="operator">
    <option value="+">Summation</option>
    <option value="-">Subtraction</option>
    <option value="*">Multiplication</option>
    <option value="/">Division</option>
  </select><br/>
    <input type="submit" value="submit">
  </form>
  </body>
</html>
