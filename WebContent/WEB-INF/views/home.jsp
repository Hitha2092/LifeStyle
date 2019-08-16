<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

 <!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>LifeStyle+</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
   <!--   <link href="resources/css/profilereg.css" rel="stylesheet" /> -->
   
   
    <link href="resources/css/small-business.css" rel="stylesheet">
    
    <c:url value="/resources/img/macro_ratio_newer.png" var="myboardpng"/>
    <c:url value="/resources/img/food_7.jpg" var="foodpng"/>
    <c:url value="/resources/img/runner-exercise_new.jpg" var="exercisepng"/>
    <c:url value="/resources/img/triangle_map_new.jpg" var="aboutpng"/>

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

    <!-- Page Header -->
    <!-- Set your background image for this header on the line below. -->
    <!-- https://www.sweetdefeat.com/storage/blog/2018/10/iStock-918035290.jpg -->
    <!-- url('https://cdn.images.express.co.uk/img/dynamic/126/590x/Christmas-dinner-889084.jpg')"> -->
    <header class="intro-header" style="background-image: url('https://www.sweetdefeat.com/storage/blog/2018/10/iStock-918035290.jpg')">
        <div class="container overlay">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="site-heading">
                        <h1>LifeStyle+</h1>
                        <hr class="small">
                        <span class="subheading">Your Calorie Counter<br></span>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Main Content -->


    <div class="container-fluid container-90">
        <div class="row">

            <div class="col-md-3">
                <div class="post-preview">
                    <br>
                    <br>
                    <br>
                        <img class="img-responsive" src="${myboardpng}">
                        <h2 class="post-title">
                            <b>Myboard</b>
                        </h2>
                        <h3 class="post-subtitle">
                           <i>The Myboard is like your main dashboard. It shows you how many calories you should eat in a day based on the information you provided, so be honest! As you log your food and exercise throughout the day, it will show you how many calories you have eaten so far, how many you have left, and how many you have burned. </i> 
                        </h3>
                    </a>
                </div>
            </div>

            <div class="col-md-3">
                <div class="post-preview">
                    <br>
                    <br>
                    <br>
                        <img class="img-responsive" src="${foodpng}">
                        <h2 class="post-title">
                          <b>Food Diary</b>
                        </h2>
                        <h3 class="post-subtitle">
                           <i> Food Diary feature helps you to log in your meals ,multiple meals during the day and it tracks the calories consumed, protein,carbs,fat consumed by you in a day.</i>
                        </h3>
                    </a>
                </div>
            </div>

            <div class="col-md-3">
                <div class="post-preview">
                   <br>
                   <br>
                   <br>
                        <img class="img-responsive" src="${exercisepng}">
                        <h2 class="post-title">
                            <b>Exercise</b>
                        </h2>
                        <h3 class="post-subtitle">
                           <i>Exercise feature helps you to log in your exercise for the day ,multiple exercise during the day and it tracks the calories burned by you in a day.</i>
                        </h3>
                    </a>
                </div>
            </div>

            <div class="col-md-3">
                <div class="post-preview">
                    <br>
                    <br>
                    <br>
                        
                        <img class="img-responsive" src="${aboutpng}">
                        <h2 class="post-title">
                            <b>About</b>
                        </h2>
                        <h3 class="post-subtitle">
                            <i>Lifestyle+ is your calorie counter.It calculates your BMI,TDEE from your age,height,weight and suggest you the required calorie intake in a day according to your desired weight.</i>
                                
                        </h3>
                    </a>
                </div>
            </div>

        </div>
        <!-- Pager
        <ul class="pager">
            <li class="next">
                <a href="#">Older</a>
            </li>
        </ul> -->
    </div>


    <hr>

    <!-- Footer -->
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <ul class="list-inline text-center">
                        <li>
                            <a href="https://github.com/elkindnet">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-github fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                        
                        <li>
                            <a href="https://www.facebook.com/jenyelkind">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-facebook fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                        <li>
                            <a href="https://plus.google.com/+JenyElkind/">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-google-plus fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                        <li>
                            <a href="mailto:elkind@elkind.net">
                                <span class="fa-stack fa-lg">
                                    <i class="fa fa-circle fa-stack-2x"></i>
                                    <i class="fa fa-envelope fa-stack-1x fa-inverse"></i>
                                </span>
                            </a>
                        </li>
                        
                    </ul>
                   
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

<!--
Google Analitics
Demo Purpose Only
Change UA-XXXXXXX-X to be your site's ID
 -->
<script>
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
        (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
            m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-1057679-2', 'auto');
    ga('send', 'pageview');
</script>

</body>

</html>
