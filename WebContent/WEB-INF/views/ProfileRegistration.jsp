<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Registration</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">


<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="resources/css/profilereg.css" rel="stylesheet" />
</head>
<body>

<form action="${pageContext.request.contextPath}/registerUserProfile"
				method="post">

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<h1 class="text-center">Lifestyle+</h1>
<div class="card bg-light">
<article class="card-body mx-auto" style="max-width: 400px;">
	<h4 class="card-title mt-3 text-center">Create Profile</h4>
	<p class="text-center">Lets Get started !!!!</p>
	
<!-- 	<form> -->
	<div class="form-group input-group">
		<div>
		    <label for="Height">Height</label> <input type="number"
										class="" id="heightinch" name="height" placeholder="inch">
								
		</div>
    </div> <!-- form-group// -->
    <div class="form-group input-group">
		<div>
		    <label for="weight">Weight</label> <input type="number"
										class="" id="weight" name="weight" placeholder="lbs" required>
								
		</div>
		</div> <!-- form-group// -->
		<div class="form-group input-group">
		<div>
		    <label for="desiredweight">Desired Weight</label> <input type="number"
										class="" id="desiredweight" name="desiredweight" placeholder="lbs" required>
								
		</div>
		</div> <!-- form-group// -->
		<div class="form-group input-group">
		<div>
		    <label for="age">Age</label> <input type="number" name="age" class="" id="age"
										placeholder="" min="1" max="120" required>
								
		</div>
		
		</div> <!-- form-group// -->
		<div class="form-group input-group">
		<div>
		    <label for="Gender">gender</label><br> <input type="radio"
										name="gender" value="male" required> Male<br> <input
										type="radio" name="gender" value="female" required>
									Female<br>
								
		</div>
		</div> <!-- form-group// -->
		
		<div class="form-group input-group">
		<div>
            <label for="Activity">activity</label><br> <input
										type="radio" name="activity" value="Sedentary">
									Sedentary<br> <input type="radio" name="activity"
										value="Light_Exercise"> Light_Exercise<br> <input
										type="radio" name="activity" value="Moderate_Exercise">Moderate_Exercise<br>
									<input type="radio" name="activity" value="Heavy_Exercise">Heavy_Exercise<br>
									<input type="radio" name="activity" value="Athlete">Athlete<br>
		</div>

    </div> <!-- form-group// -->
    <div>
        <button type="submit" class="registerbtn" value="Save">Register</button>
									<br>
	</div>
    </form>
    </article>
   
    </div>
		<%-- <div>Profile!!</div>
		<div>
			<form action="${pageContext.request.contextPath}/registerUserProfile"
				method="post">

				<div class="row">
					<div class="col-md-6">
						<div class="well">
							<h2>Calories Calculator</h2>

							<div class="container">

								<div class="card">
									<div class="card-body">Basic card</div>



									<!-- <label for="id">id</label> <input type="number" name="id" placeholder="" required>
								<div class="form-group"> -->

									<label for="Height">Height</label> <input type="number"
										class="" id="heightFeet" name="height" placeholder="Feet">
								</div>
								<div class="form-group col-md-4">
									<label for="weight">Weight</label> <input type="number"
										class="form-control" name="weight" required>
								</div>
								<div class="form-group col-md-4">
									<label for="Desired weight">Desired Weight</label> <input
										type="number" class="form-control" name="desiredweight"
										required>
								</div>

								<div class="form-control">
									<label for="age">Age</label> <input type="number" name="age"
										placeholder="" min="1" max="120" required>
								</div>

								<div class="form-group col-md-6">
									<label for="Gender">gender</label><br> <input type="radio"
										name="gender" value="male" required> Male<br> <input
										type="radio" name="gender" value="female" required>
									Female<br>
								</div>
								<div class="form-group col-md-6">
									<label for="Activity">activity</label><br> <input
										type="radio" name="activity" value="Sedentary">
									Sedentary<br> <input type="radio" name="activity"
										value="Light_Exercise"> Light_Exercise<br> <input
										type="radio" name="activity" value="Moderate_Exercise">Moderate_Exercise<br>
									<input type="radio" name="activity" value="Heavy_Exercise">Heavy_Exercise<br>
									<input type="radio" name="activity" value="Athlete">Athlete<br>
								</div>


								<div class="form-group">
									<!-- 	<input type="submit" class="submit-button btn" value="Save"><br> -->
									<button type="submit" class="registerbtn" value="Save">Register</button>
									<br>
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>	
</body> --%>
</body>
</html>