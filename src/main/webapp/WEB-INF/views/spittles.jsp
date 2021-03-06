<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 82138
  Date: 2018/12/11
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittle</title>
</head>
<body>
<c: foreach items="${spittleList}" var="spittle">
    <li id="spittle_<c:out value="spittle.id"/> ">
    <div class="spittleMessage">
        <c:out value="${spittle.message}"/>
    </div>

    <div>
        <span class="spittleTime"><c:out value="${spittle.time}"/> </span>
        <span class="location">(<c:out value="${spittle.latitude}"/>,<c:out value="${spittle.longitude}"/>) </span>
    </div>
    </li>
</c:>
</body>
</html>
