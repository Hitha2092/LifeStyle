<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="resources/css/profilereg.css" rel="stylesheet" />
</head>
<body>

<link rel="stylesheet"
				href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">


	<div>
		<form action="${pageContext.request.contextPath}/registerUserPersonal"
			method="post">


			

			<div class="card bg-light">
				<article class="card-body mx-auto" style="max-width: 400px;">
					<h1 class="text-center">Lifestyle+</h1>
					<p class="text-center">Few more!!!!</p>

					<!-- 	<form> -->
					<div class="form-group input-group">
						<div>
							<label for="name">Name</label> <input type="text" class=""
								id="name" name="name" placeholder="name">

						</div>
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div>
							<label for="city">City</label> <input type="text" class=""
								id="city" name="city" placeholder="boston">

						</div>
					</div>
					<!-- form-group// -->
					<div class="form-group input-group">
						<div>
							<label for="phone">Phone Number</label> <input type="tel"
								class="" id="phone" name="phone" placeholder="0123456"
								pattern="[0-9]{10}" required>

						</div>
					</div>
					<!-- form-group// -->

					<div>
						<button type="submit" class="registerbtn" value="Save">Save</button>
						<br>
					</div>
				</article>
				
				
				<!-- <div class="form-row">
				<div class="form-group col-md-6">
					<label for="name">Name</label> <input type="text"
						class="form-control" name="name" placeholder="Name">
				</div>
				<div class="form-group col-md-6">
					<label for="city">City</label> <input type="text"
						class="form-control" name="city" placeholder="Boston">
				</div>
			</div>
			<div class="form-group">
				<label for="phone">Phone Number</label> <input type="tel"
					class="form-control" name="phone" placeholder="0123456"
					pattern="[0-9]{10}" required>
			</div>
			<div class="form-group">
					<input type="submit" class="submit-button btn" value="Save"><br>
				<button type="submit" class="registerbtn" value="Save">Register</button>
				<br>
			</div> -->
		</form>
	</div>




</body>
</html>