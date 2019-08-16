<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="resources/css/loginpg1.css" rel="stylesheet">
</head>
<body>
<h1 class="text-center">Lifestyle+</h1>
<div class="contact-form">
        <!-- <img src="2.jpg" class="avatar"> -->
        <h2>Register</h2>
        <form id="login-form" class="form" action="addUser" method="post">
            <p>Email</p>
            <input type="text" name="email" placeholder="Enter Email">
            <p>Password</p>
            <input type="password" name="password" placeholder="Enter Password">
            <p>Repeat Password</p>
            <input type="password" name="repeat password" placeholder="Repeat Password"> 
            <input  type="submit"  value="Register"> 
            
           <p> Already have an account? <a href="Sign in">Sign in</a>.
			</p>
        </form>
    </div>
</body>
</html>
