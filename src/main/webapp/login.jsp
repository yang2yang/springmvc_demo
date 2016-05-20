<%--
  Created by IntelliJ IDEA.
  User: jack
  Date: 16-5-20
  Time: 下午4:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/springmvc_demo/showLogin" method="post" commandName="user">
    <p>First name: <input type="text" name="username" /></p>
    <p>Last name: <input type="text" name="password" /></p>
    <input type="submit" value="Submit" />
</form>
<%--<sf:form method="post" modelAttribute="User">--%>
    <%--<sf:input path="username"/>--%>
    <%--<sf:input path="password"/>--%>
<%--</sf:form>--%>

</body>
</html>
