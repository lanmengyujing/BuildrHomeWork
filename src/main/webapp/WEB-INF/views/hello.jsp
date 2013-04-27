<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<body>

<h3>hello world!</h3>

<%= request.getAttribute("name").toString()%>
<h4>you are </h4>
<c:out value ="${age}" ></c:out>

<h4>After request,time is set in the Interceptor,   Now Time is</h4>
<%= request.getAttribute("time").toString()%>


</body>
</html>
