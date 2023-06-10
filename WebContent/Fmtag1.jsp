<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="price" value="1230.456789"></c:set>
<fmt:parseNumber var="p" type="number" integerOnly="true" value="${price }">
</fmt:parseNumber>
<c:out value="${p}"></c:out>

<br>
<fmt:formatNumber value="${price }" type="currency"></fmt:formatNumber>
<br>
<fmt:formatNumber value="${price }" type="number" groupingUsed="true"></fmt:formatNumber>

<br>
<fmt:formatNumber value="${price }" type="number" maxIntegerDigits="3"></fmt:formatNumber>
<br>
<fmt:formatNumber value="${price }" type="number" maxFractionDigits="2"></fmt:formatNumber>
<br>
<fmt:formatNumber value="${price }" type="percent" maxIntegerDigits="1"></fmt:formatNumber>
<br>
<fmt:formatNumber value="${price }" type="number" pattern="###.###$"></fmt:formatNumber>


<br>
<c:set var="date" value="14/02/2022"></c:set>
<fmt:parseDate value="${date }" var="pd" pattern="dd/MM/yyyy"></fmt:parseDate>

<c:out value="${pd }"></c:out>

<br>
<c:set var="dt" value="<%= new java.util.Date()%>">
</c:set>
${dt }
<br>
<fmt:formatDate value="${dt }" type="time"/>
<br>
<fmt:formatDate value="${dt }" type="date"/>
<br>
<fmt:formatDate value="${dt }" type="both"/>
<br>
<fmt:formatDate value="${dt }" type="both" dateStyle="short" timeStyle="short"/>
<br>
<fmt:formatDate value="${dt }" type="both" dateStyle="medium" timeStyle="medium"/>
<br>
<fmt:formatDate value="${dt }" type="both" dateStyle="long" timeStyle="long"/>













</body>
</html>