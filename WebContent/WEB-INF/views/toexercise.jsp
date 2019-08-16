<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<link href="resources/css/registerpg.css" rel="stylesheet" />
	<link href="resources/css/nav.css" rel="stylesheet" />
<style>
body{
	/*  background-color:red */
	background: linear-gradient(to right, rgb(255, 127, 66), yellowgreen)
}
</style>
</head>
<body>

<%@include file = "nav.jsp" %>
<div id="login">
       
        <h1 class="text-center">Lifestyle+</h1>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                    <h3 class="text-center text-info">Enter The Exercise!</h3>
                    <h1>hi ${sUserEmail}</h1>
  	<h1>hi ${sUserId}</h1>	
  	<form action="searchExercise" method="post">
  	<label for="exercise" class="text-info">Exercise:</label><br>
                           
  		<input name="exercise" value="">
        <button type="submit">Search</button>
     </form>
      <form action="adduserExercise" method="post">
      <select name="exerciseId">
					  <c:forEach items="${exerciseList}" var="exerciselist">
					      <option  value=${exerciselist.getId()}>${exerciselist.getExercise()} - ${exerciselist.getMetValue()} </option>
					</c:forEach>	
		  		</select>
    	       <label for="duration">Rounds</label> <input type="number" name="duration" placeholder="" required><br><br>
  		<!-- <input>Date -->
  		        <input type="submit" value="add">
  	  </form>
                    
                    
<!-- <div class="search-container">
early method
    <form action="searchExercise" method="post">
      <input type="text" placeholder="Search.." name="exercise">
      <button type="submit">Submit</button>
    </form>
  </div> -->
  
  
  	<%-- <div>
  	<h1>hi ${sUserEmail}</h1>
  	<h1>hi ${sUserId}</h1>	
  	<form action="searchExercise" method="post">
  		<input name="exercise" value="">
        <button type="submit">Search</button>
     </form>
      <form action="adduserExercise" method="post">
     
  		        <select name="exerciseId">
					  <c:forEach items="${exerciseList}" var="exerciselist">
					      <option  value=${exerciselist.getId()}>${exerciselist.getExercise()} - ${exerciselist.getMetValue()} </option>
					</c:forEach>	
		  		</select>
    	       <label for="duration">duration</label> <input type="number" name="duration" placeholder="" required>
  		<!-- <input>Date -->
  		        <input type="submit" value="add">
  	  </form>
  	</div> --%>
  	
  	
  	
  	
  	
  	<%-- <div>
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
		
		
		
	   </div> --%>
  
</body>
</html>