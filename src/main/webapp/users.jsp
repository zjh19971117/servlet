<%--
  Created by IntelliJ IDEA.
  User: jia'hao
  Date: 2020/11/9
  Time: 14:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" width="600" height="400" align="center">
    <tr>
        <th>用户id</th>
        <th>用户名</th>
        <th>密码</th>
        <th>邮箱</th>
        <th>性别</th>
        <th>操作</th>
    </tr>
    <c:forEach var="u" items="${users}">
    <tr>
        <td>${u.uid}</td>
        <td>${u.uname}</td>
        <td>${u.upass}</td>
        <td>${u.uemail}</td>
        <td>${u.ugender}</td>
        <td><a href="UserServlet?action=updateById&id=${u.uid}">修改</a>&nbsp;<a href="UserServlet?action=deleteById&id=${u.uid}">删除</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
