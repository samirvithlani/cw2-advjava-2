<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="String" value="Welcome to Royal m">
	</c:set>
	<c:if test="${fn:contains(String,'Royal')}">
		<p>Found</p>
	</c:if>
	<c:if test="${fn:containsIgnoreCase(String,'royal')}">
		<p>found...</p>
	</c:if>
	
	<c:if test ="${fn:startsWith(String,'w') }">
		<p>yes</p>
	</c:if>
	<c:if test ="${fn:endsWith(String,' m') }">
		<p>yes</p>
	</c:if>
	<c:set var ="email" value="  samir@gmail.com   ">
	</c:set>
	<h1>
	${fn:length(email) }
	</h1>
	<c:set var ="email1" value="${fn:trim(email)}">
		
	</c:set>
	<h1>
	${fn:length(email1) }
	</h1>
	<c:set  var ="data" value="Dont put bomb anywhere">
	</c:set>
	<c:set var ="data1" value="${fn:split(data,' ')}">
	</c:set>
	
	<c:forEach items="${data1}" var="d">
	<br>	${d }
	</c:forEach>
	<c:set var ="name" value ="india">
	
	</c:set>
	${fn:toUpperCase(name) }
	<!-- do lower case own -->
	
	<c:set var ="fname" value="hello this is mr thakkar">
	</c:set>
	<br>
	${fn:substring(fname,17,24) }
	<c:set var="book" value="java 8">
	</c:set>
	${fn:replace(book,"8","11") }
</body>
</html>