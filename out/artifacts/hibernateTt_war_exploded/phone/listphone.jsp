<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 8/10/2019
  Time: 7:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>

</head>
<body>
<table style="width:100%">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Brand</th>
        <th>Description</th>
    </tr>
    <c:forEach var="phone" items="${phones}">
        <tr>
            <td>${phone.name}</td>
            <td>${phone.price}</td>
            <td>${phone.brand}</td>
            <td>${phone.description}</td>
        </tr>
    </c:forEach>

</table>




</body>
</html>
