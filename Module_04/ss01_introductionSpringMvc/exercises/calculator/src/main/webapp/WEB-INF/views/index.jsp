<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>CALCULTOR</title>
</head>
<body>
<form action="/calculator" method="get">
    <input type="number" name = "number01">
    <input type="number" name = "number02">
    <select name="operator" >
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <input type="submit" value="output">
</form>
<c:if test="${result != 0}">
    <p >Result: ${result}</p>
</c:if>
</body>
</html>