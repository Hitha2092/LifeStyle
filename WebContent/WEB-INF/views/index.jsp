<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LifeStyle</title>
<c:url value="/resources/img/life.png" var="lifePNG"/>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	

<style>
body{
	/*  background-color:red */
	background: linear-gradient(to right, rgb(204, 255, 102), yellowgreen)
}
</style>
</head>
<body>
<!-- <img alt="something" src="${lifePNG}"> -->
	<div class = "row justify-content-center">
	
	<!-- <div>
     	<h1 class="text-center">Lifestyle+</h1>  
		</div> -->
		<!-- <div>
		<h3  class="text-center"><i>Your calorie counter!!</i></h3>
		</div> -->
		<a href="login">Login </a> 
		<a href="Register">Sign Up </a>
		<hr>
	</div>
	<div>
		<p><h1 class="text-center">Lifestyle+</h1></p>
	</div>
	<div>
		<h3  class="text-center"><i>Your calorie counter!!</i></h3>
		</div>
	
</body>
</html>