<%--
  Created by IntelliJ IDEA.
  User: nth15
  Date: 8/30/2023
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="l" uri="http://struts.apache.org/tags-logic" %>
<html>
<head>
    <title>ListUsers</title>
</head>
    <body>
        <h1>List of Users</h1>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
            </tr>
            <l:iterate id="u" name="userForm" property="list">
                <tr>
                    <td><bean:write name="u" property="id"/></td>
                    <td><bean:write name="u" property="name"/></td>
                    <td><bean:write name="u" property="age"/> </td>
                </tr>
            </l:iterate>
        </table>
    </body>
</html>
