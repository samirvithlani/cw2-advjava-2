<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function callServlet() {

			
			var xhr = new XMLHttpRequest();
			xhr.open("GET",'${pageContext.request.contextPath}/callbyjs',true);
			xhr.send()
			
		}
		function postServlet(){
			
			var data ={
					name:"samir",
					email:"samir@gmail.com"
			}
			var strData = JSON.stringify(data)
			console.log(strData)
			var xhr = new XMLHttpRequest();
			xhr.open("POST",'${pageContext.request.contextPath}/callbyjs',true);
			xhr.setRequestHeader("Content-type","application/x-www-form-urlencoded");
			xhr.send("data="+encodeURIComponent(strData))
			
			
		}
	</script>

	<button onclick="callServlet()">call</button>
	<button onclick="postServlet()">call</button>
	
</body>
</html>