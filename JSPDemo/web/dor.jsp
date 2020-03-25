<%--
  Created by IntelliJ IDEA.
  User: ZTikaradze
  Date: 19.09.2018
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Your Age Is ${user.age} </p>
<if test="${user.age > 18 }">
    <p><i>Welcome ${user.name}</i></p>
</if>
</body>
</html>
