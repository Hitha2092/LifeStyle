<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LifeStyle</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<link href="resources/css/registerpg.css" rel="stylesheet" />
</head>
<body>




<div id="login">
       
        <h1 class="text-center">Lifestyle+</h1>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="addUser" method="post">
                            
                            <h3 class="text-center text-info">Register</h3>
                            <div class="form-group">
                                <label for="email" class="text-info">Email:</label><br>
                                <input type="text" name="email" id="email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="text" name="password" id="password" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="repeat password" class="text-info">Repeat Password:</label><br>
                                <input type="text" name="repeat password" id="repeat password" class="form-control">
                            </div>
                            <div class="form-group">
                                <button type="submit" class="registerbtn" value="Save">Register</button>
								<button type="reset" value="Reset">Reset</button><br>
                            </div>
                            <div class="container signin">
			<p> Already have an account? <a href="Sign in">Sign in</a>.
			</p>
		                    </div>
                        </form>
                        <div>
		<hr>
		<p>lifestyle+ your calorie counter</p>
	</div>
                    </div>
                </div>
            </div>
        </div>
    </div>







	<!-- <div>
		<h1>LifeStyle+</h1>
		<hr>
		</div>
		<div
		<a href="Register">Sign Up </a>
		<hr>
		</div>
		<div>
			<hr>

			<form action="addUser" method="post">
				<h1>Register</h1>
				<p>Please fill in this form to create an account.</p>
				<hr>
				<label for="email"><b>Email</b></label> <input type="text"
					placeholder="Enter Email" name="email" required> <label
					for="psw"><b>Password</b></label> <input type="password"
					placeholder="Enter Password" name="password" required> <label
					for="psw-repeat"><b>Repeat Password</b></label> <input
					type="password" placeholder="Repeat Password" name="psw-repeat"
					required>
				<hr>
				<button type="submit" class="registerbtn" value="Save">Register</button>
				<button type="reset" value="Reset">Reset</button>
				<br> <br>
		</div>

		<div class="container signin">
			<p>
				Already have an account? <a href="Sign in">Sign in</a>.
			</p>
		</div>
		</form>
	</div>
	<div>
		<hr>
		<p>lifestyle+ your calorie counter</p>
	</div> -->
</body>
</html>