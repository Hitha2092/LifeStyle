<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>LifeStyle+ - Profile</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/profile.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Great+Vibes' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100,500,700,900' rel='stylesheet' type='text/css'>

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
    
    
 <header class="profile-header" style="background-image: url('https://images.agoramedia.com/everydayhealth/gcms/Montel-Williams-MS-Routine-A-Juice-Diet-and-Regular-Exercise-1440x810.jpg')">
        <div class="container overlay">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2">
                    <div class="page-heading">
                        <h1> Your Profile</h1>
                        
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            <h3>View Details</h3>
            
                <form name="sentMessage"  action="saveUserProfile"
				method="post"id="contactForm" >
				
				<div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls"> 
               <p>Id</p><input type="number" name="id" value="${uprofile.id}" readonly="true"><br><br>
               </div>
               </div> 
			
			<div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
			<p>Height</p><input type="number" name="height" value="${uprofile.height}" ><br>
			</div>
               </div>
			
			<div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
			<p>Weight</p><input type="number" name="weight" value="${uprofile.weight}" ><br>
			</div>
               </div>
			
			<div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">
            <p>Age</p><input type="number" name="age"    value="${uprofile.age}" ><br>
            </div>
               </div>
               
            <div class="row control-group">
            <div class="form-group col-xs-12 floating-label-form-group controls">   
			<p>Gender</p>
			<select name="gender">
				<option value="male">male</option>
				<option value="female">female</option>
			</select>
			</div>
            </div>
			
			<div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
               <p>Desired Weight</p><input type="number" name="desiredweight" value="${uprofile.desiredweight}"><br>
               </div>
               </div>
			
			
			
			<div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
               <p>Activity</p><select name="activity">
				<option value="Sedentary">Sedentary</option>
				<option value="Light_Exercise">Light_Exercise</option>
				<option value="Moderate_Exercise">Moderate_Exercise</option>
				<option value="Heavy_Exercise">Heavy_Exercise</option>
				<option value="Athlete">Athlete</option>
				</select>
               </div>
               </div>
               
               <br>
               
               
               
			<button type="submit"  value="Save">Save</button>
			<br>
			<hr>
	
			
		</form>
	</div>
	
	<div>
		<p>${messageResult}</p>
		</div>
</body>
</html>