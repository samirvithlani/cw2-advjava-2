<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function callServlet() {

		console.log("called");
		var xhr = new XMLHttpRequest();
		xhr.open("GET", '${pageContext.request.contextPath}/studentcontroller',
				true);

		xhr.send();

	}
	function postServlet() {

		var data = document.getElementById("email");
		console.log(data.value);
		var xhr = new XMLHttpRequest();
		var emailc = document.getElementById("emailc");
		xhr.open("POST",
				'${pageContext.request.contextPath}/studentcontroller', true);
		xhr.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		xhr.onreadystatechange = function() {
			if (xhr.readyState === 4 || xhr.status === 200) {
				var response = xhr.responseText;
				// Process the response here
				if (response === "1") {
					emailc.innerHTML ="email taken...";
				} else {
					emailc.innerHTML = "email avaialble..";
				}

				console.log(response);
			}
		};
		xhr.send("data=" + encodeURIComponent(data.value));

	}
</script>
</head>
<body>

	<form action="">
		<div>
			<label>Enter email</label> <input type="text" id="email"
				onblur="postServlet()" name="txtEmail"> <span id="emailc">
			</span>
		</div>

	</form>







</body>
</html>