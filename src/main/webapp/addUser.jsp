<%--
  Created by IntelliJ IDEA.
  User: nth15
  Date: 8/30/2023
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
    <html:form action="/user1.do" method="post">
        <p><bean:message key="user.name"/></p>
        <html:text property="name" name="userForm"></html:text>
        <p><bean:message key="user.age"/></p>
        <html:text property="age" name="userForm"></html:text>
        <html:submit>Them</html:submit>
    </html:form>
</body>
</html>
