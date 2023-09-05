<%--
  Created by IntelliJ IDEA.
  User: nth15
  Date: 8/30/2023
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
    <bean:write name="userForm" property="name"/>
    <bean:write name="userForm" property="age" format="#####" />
</body>
</html>
