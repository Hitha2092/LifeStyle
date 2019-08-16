<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
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

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <!-- <nav class="navbar navbar-default navbar-custom navbar-fixed-top">
        <div class="container-fluid">
            Brand and toggle get grouped for better mobile display
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               
            </div>

            Collect the nav links, forms, and other content for toggling
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li>
                        <a href="index.html">Profile</a>
                    </li>
                    <li>
                        <a href="about.html">Food Diary</a>
                    </li>
                    <li>
                        <a href="page.html">Exercise</a>
                    </li>
                    <li>
                        <a href="page.html">Features</a>
                    </li>
                    <li>
                        <a href="contact.html">Contact</a>
                    </li>
                </ul>
            </div>
            /.navbar-collapse
        </div>
        /.container
    </nav>
 -->
    <!-- Page Header -->
    <!-- Set your background image for this header on the line below. -->
    <header class="profile-header" style="background-image: url('https://images.agoramedia.com/everydayhealth/gcms/Montel-Williams-MS-Routine-A-Juice-Diet-and-Regular-Exercise-1440x810.jpg')">
        <div class="container overlay">
            <div class="row">
                <div class="col-lg-6 col-lg-offset-3 col-md-8 col-md-offset-2">
                    <div class="page-heading">
                        <h1>Profile</h1>
                        <hr class="small">
                        <span class="subheading">Let's get started!</span>
                        
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
            
                <form name="sentMessage"  action="${pageContext.request.contextPath}/registerUserProfile"
				method="post"id="contactForm" novalidate>
				
                    <p>Enter the Details!</p>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Height</label>
                            <input type="number" class="form-control" placeholder="Height in inch" name="height"  id="height" min ="1" and max= "120" required data-validation-required-message="Please enter your Height.">
                           
                        </div>
                    </div>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Weight</label>
                            <input type="number" class="form-control" placeholder="Weight in lbs" name="weight"  id="weight" min ="1" and max= "120" required data-validation-required-message="Please enter your Weight.">
                           
                        </div>
                    </div>
                    

                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Desired Weight</label>
                            <input type="number" class="form-control" placeholder="Desired Weight in lbs" name="desiredweight"  id="desiredweight" min ="1" and max= "120" required data-validation-required-message="Please enter your Desired Weight.">
                           
                        </div>
                    </div>
                    

                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>Age</label>
                            <input type="number" class="form-control" placeholder="Age" name="age"  id="age" min ="1" and max= "120" required data-validation-required-message="Please enter your age.">
                           
                        </div>
                    </div>
                    
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label for="Gender"></label>Gender<br> 
                            <input type="radio" name="gender" value="male" required> Male <br>
                            <input type="radio" name="gender" value="female" required> Female <br>
                          
                        </div>
                    </div>

                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                           <label for="Activity"></label>Activity<br>
                            
                            <input type="radio" name="activity" value="Sedentary" required> Sedentary<br> 
                             <input type="radio" name="activity" value="Light_Exercise" required> Light_Exercise<br>
                            <input  type="radio" name="activity" value="Moderate_Exercise" required >Moderate_Exercise<br>
                             <input type="radio" name="activity" value="Heavy_Exercise" required >Heavy_Exercise<br>
                            <input type="radio" name="activity" value="Athlete" required >Athlete<br>
                        </div>

                    
                    </div>
                    <br>
                    <div id="success"></div>
                    <div class="row">
                        <div class="form-group col-xs-12">
                            <button type="submit" class="btn btn-default" value="save">Register</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <hr>
    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                        <div class="row control-group">
                    <hr>
                    <p class="copyright text-muted">Lifestyle+    ... your calorie counter</p>
                       </div>
                </div>
            </div>
        </div>
    </footer>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/small-business.min.js"></script>

    <!-- Smooth Scroll -->
    <script src="js/SmoothScroll.js"></script>

</body>

</html>