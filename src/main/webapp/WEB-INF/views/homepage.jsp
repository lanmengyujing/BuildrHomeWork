<%--
  Created by IntelliJ IDEA.
  User: twer
  Date: 4/13/13
  Time: 10:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<%= request.getAttribute("homeID").toString()%>
<h4>you are living in </h4>
<%= request.getAttribute("homeLocation").toString()%>
</body>
</html>