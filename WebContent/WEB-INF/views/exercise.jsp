<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body{
	/*  background-color:red */
	background: linear-gradient(to right, rgb(255, 127, 66), yellowgreen)
}
</style>
</head>
<body>
<style>
		table, th, td {
  			border: 1px solid black;
		}
	</style>
	<h1>Spring MVC & JPA 1.0</h1>
	<hr>
	<a href="${pageContext.request.contextPath}/index">Home</a>
	<hr>
	<div>	
		<h1> Exercise</h1>
		<table style="width:70%;" >
		<tr style="border: 1px solid black;">
			<th>ID</th>
			<th>Name</th>
			<th>Met Value</th>
			
			
		</tr>
		<c:forEach items="${exerciseList}" var="exerciselist">
			<tr style="border: 1px solid black;">
				<td>${exerciselist.getId()}</td>
		       <td>${exerciselist.getExercise()}</td>
	           <td>${exerciselist.getMetValue()}</td>
		 	   <td><a href="${pageContext.request.contextPath}/addExercise/${exerciselist.id}">add</a></td>
		 	
	 	   </tr>
		</c:forEach>
		</table>
	</div>
	
	<div class="add-container">
    <form action="addExercise" method="post">
      <button type="submit"value="Save">Submit</button>
    </form>
  </div>
	
	
	<div>
		<p>${messageResult}</p>
	</div>
</body>
</html>