
<%--
  Created by IntelliJ IDEA.
  User: 82138
  Date: 2018/12/12
  Time: 23:10
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
</head>
<body>
<%--    <p1>Register</p1>
    <br method="post">
        姓名: <input type="text" value="name"/><br/>
        年龄: <input type="text" value="gender"/><br/>
        账号: <input type="text" value="username"/><br/>
        密码: <input type="password" value="password"/><br/>
              <input type="submit" value="Register"/>
    </form>--%>
    <sf:form method="post" commandName="spitter">
        username:<sf:input path="username"/>
        name:<sf:input path="name"/>
        gender:<sf:input path="gender"/>
        <input type="submit" name="register"/>
    </sf:form>
</body>
</html>
