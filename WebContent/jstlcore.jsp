<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	out.print("ok");
%>
<c:out value="welcome..."></c:out>
<c:set var ="age" value="${17 }"></c:set>
<c:out value="${age }"></c:out>
<c:if test="${age>=14 }">
	<h1><c:out value="you are eligible..."></c:out></h1>
</c:if>

<c:choose>
<c:when test="${age>=18 }">
	eligible...
</c:when>
<c:when test="${age>=16 }">
	ok....
</c:when>
<c:otherwise>
	not eligible...
</c:otherwise>
</c:choose>

<c:forEach var ="i" begin="1" end="5">
	i = <c:out value="${i }"></c:out>

</c:forEach>



</body>
</html>