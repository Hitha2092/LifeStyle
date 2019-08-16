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
	
	
	<link href="resources/css/food.css" rel="stylesheet" />

</head>
<body>

<%@include file = "nav.jsp" %>



<div id="login">
       
        <h1 class="text-center">Lifestyle+</h1>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                    <h3 class="text-center text-info">Enter The Food!</h3>
                        <form id="login-form" class="form" action="searchfood" method="post">
                        <label for="menu" class="text-info">Menu:</label><br>
                            <input name="menu" value="">
        <button type="submit">Search</button>
     </form>
     <form id="login-form" class="form" action="adduserfoodConsumption" method="post">
     
  		        <select name="foodId">
					  <c:forEach items="${FoodList}" var="foodlist">
					      <option  value=${foodlist.getId()}> ${foodlist.getMenu()} - ${foodlist.getCalories()} </option>
					</c:forEach>	
		  		</select>
    	       <label for="servings" class="text-info" >servings</label> <input type="number" name="servings" placeholder="" required><br>
    	       <label for="Type" class="text-info" >Type</label><br> 
    	       <select name="type">
					  <option value="BREAKFAST">BreakfastT</option>
					  <option value="LUNCH">Lunch</option>
					  <option value="DINNER">Dinner</option>
					  <option value="SNACKS">Snacks</option>
				</select><br><br><br>
  		<!-- <input>Date -->
  		        <input type="submit" value="add">
  	  </form>
                            
<%-- <h3> LifeStyle+</h3>
<div>
  	<h1>hi ${sUserEmail}</h1>
  	<h1>hi ${sUserId}</h1>	
  	<form action="searchfood" method="post">
  		<input name="menu" value="menu">
        <button type="submit">Search</button>
     </form>
     <form action="adduserfoodConsumption" method="post">
     
  		        <select name="foodId">
					  <c:forEach items="${FoodList}" var="foodlist">
					      <option  value=${foodlist.getId()}> ${foodlist.getMenu()} - ${foodlist.getCalories()} </option>
					</c:forEach>	
		  		</select>
    	       <label for="servings">servings</label> <input type="number" name="servings" placeholder="" required>
    	       
    	       <select name="type">
					  <option value="BREAKFAST">BreakfastT</option>
					  <option value="LUNCH">Lunch</option>
					  <option value="DINNER">Dinner</option>
					  <option value="SNACKS">Snacks</option>
				</select>
  		<!-- <input>Date -->
  		        <input type="submit" value="add">
  	  </form>
  	</div>
  	
       --%>
</body>
</html>