<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	
	<!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

   
    <link href="resources/css/small-business.css" rel="stylesheet">
    
     <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Great+Vibes' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900' rel='stylesheet' type='text/css'>
    
	
	<!-- <link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	 -->
<link href="resources/css/exercise.css" rel="stylesheet">


</head>
<body>

<!-- Navigation -->
    <nav class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
        
                    <li>
                        <a href="MyBoard">MyBoard</a>
                    </li>
                    <li>
                        <a href="Profile">Profile</a>
                    </li>
                    <li>
                        <a href="FoodDiary">Food Diary</a>
                    </li>
                    <li>
                        <a href="Exercise">Exercise</a>
                    </li>
                    <li>
                        <a href="contact">Contact</a>
                    </li>
                    
                   
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>


	<div class="contact-form">
       <h2>Enter The Exercise!</h2>
       <form id="login-form" class="form" action="searchExercise" method="post">
           <p>ExerciseList:</p>
           <input type="text" name="exercise" placeholder="select a item" value="">
           <input type="submit" name="" value="Search">
       </form>
       <form id="login-form" class="form" action="adduserExercise" method="post">
           <select name="exerciseId">
               <c:forEach items="${exerciseList}" var="exerciselist">
                   <option value=${exerciselist.getId()}> ${exerciselist.getExercise()} - ${exerciselist.getMetValue()} </option>
               </c:forEach>
           </select>
           <br>
           <br>
           <label for="duration">Rounds</label> <input type="number" name="duration" placeholder="how many rounds" required><br>
           <input type="submit" value="add">
       </form>
   </div>
</body>
</html>