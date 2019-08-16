<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!--  <link href="resources/css/loginpg.css" rel="stylesheet" />-->
<link href="html/css/bootstrap.min.css" rel="stylesheet" />

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
                        <form id="login-form" class="form" action="validateUser" method="post">
                            
                            <h3 class="text-center text-info">LOGIN</h3>
                            <div class="form-group">
                                <label for="email" class="text-info">Email:</label><br>
                                <input type="text" name="email" id="email" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="text" name="password" id="password" class="form-control">
                            </div>
                            <div class="custom-control custom-checkbox mb-3">
												<input type="checkbox" class="custom-control-input"
													id="customCheck1"> <label
													class="custom-control-label" for="customCheck1">Remember
													password</label>
							</div>
                            
                            <div class="form-group">
                                <button type="submit" class="registerbtn" value="Save">Login</button>
								
                            <div class="container signin">
												<p>Don't have an account? <a href="Signup">Sign up</a></p>
												
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
		<a href="loginUser">Sign in </a>
		<hr>
		<div>
			<hr>
			<form action="validateUser" method="post">
				<hr>
				<body>
					<div class="container">
						<div class="row">
							<div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
								<div class="card card-signin my-5">
									<div class="card-body">
										<h5 class="card-title text-center">Sign In</h5>
										<form class="form-signin">
											<div class="form-label-group">

												<label for="email"><b>Email</b></label> <input type="text"
													class="form-control" placeholder="Enter Email" name="email"
													required>
											</div>

											<div class="form-label-group">

												<label for="psw"><b>Password</b></label> <input
													type="password" class="form-control"
													placeholder="Enter Password" name="password" required>
											</div>


											<div class="custom-control custom-checkbox mb-3">
												<input type="checkbox" class="custom-control-input"
													id="customCheck1"> <label
													class="custom-control-label" for="customCheck1">Remember
													password</label>
											</div>
											<button
												class="btn btn-lg btn-primary btn-block text-uppercase"
												type="submit">Sign in</button>

											<div class="container signin">
												<p>
													Don't have an account? <a href="Signup">Sign up</a>.
												</p>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
					<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
						integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
						crossorigin="anonymous"></script>
					<script
						src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
						integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
						crossorigin="anonymous"></script>
					<script
						src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
						integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
						crossorigin="anonymous"></script>
 -->
				</body>
</html>