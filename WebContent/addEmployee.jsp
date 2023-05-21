<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="navbar.jsp"%>
	<form action="addemp" method="POST">

		<div class="form-group">
			<label for="exampleInputEmail1">Employee name</label> <input
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter name"
				name="txtEName">
			<%-- <%if(request.getAttribute("nameError")!=null){%>
					<h1>
						<%=request.getAttribute("nameError") %>
					</h1>
				<%} %> --%>
			${nameError }



		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Employee age</label> <input
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter age" name="txtEAge">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Employee salary</label> <input
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter salary"
				name="txtESalary">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Employee joining date</label> <input
				type="date" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="txtEJoiningDate">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Employee birthdate</label> <input
				type="date" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter name"
				name="txtEBirthDate">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Employee status</label> ACTIVE:<input
				type="radio" class="form-control" name="rdbStatus" value="true">
			InActive:<input type="radio" class="form-control" name="rdbStatus"
				value="false">
		</div>

		<div class="form-group">
			<label for="exampleInputEmail1">Email address</label> <input
				type="email" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" placeholder="Enter email"
				name="txtEEmail">

		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Password</label> <input
				type="password" class="form-control" id="exampleInputPassword1"
				placeholder="Password" name="txtEPassword">
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>