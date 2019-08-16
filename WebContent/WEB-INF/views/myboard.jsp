<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.LifeStyle.Services.UserFoodIntakeServices"%>   
 <%@ page import="java.util.*" %>


<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>transparent login form</title>
    
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
<link href="resources/css/food.css" rel="stylesheet">
    
    
    
    <style>
        body{
            margin: 0;
            padding: 0;
        }
        body:before{
            content: '';
            position: fixed;
            width: 100vw;
            height: 100vh;
            background-image: url("http://www.seekgif.com/uploads/food-background-1.jpg");
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
             -webkit-filter: blur(5px);
            -moz-filter: blur(5px);
            -o-filter: blur(5px);
            -ms-filter: blur(5px);
            filter: blur(5px);  
        }
        .contact-form
        {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%,-50%);
            width: 600px;
            height: 700px;
            padding: 50px 50px;
            box-sizing: border-box;
            background: rgba(173, 160, 160, 0.5);
        }
        .avatar {
            position: absolute;
            width: 80px;
            height: 80px;
            border-radius: 50%;
            overflow: hidden;
            top: calc(-80px/2);
            left: calc(50% - 40px);
        }
        .contact-form h2 {
            margin: 0;
            padding: 0 0 20px;
            color: #fff;
            text-align: center;
            text-transform: uppercase;
        }
        .contact-form p
        {
            margin: 0;
            padding: 0;
            font-weight: bold;
            color: #fff;
        }
        .contact-form input
        {
            width: 100%;
            margin-bottom: 20px;
        }
        .contact-form input[type="text"],
        .contact-form input[type="password"]

        {
            border: none;
            border-bottom: 1px solid #fff;
            background: transparent;
            outline: none;
            height: 40px;
            color: #fff;
            font-size: 16px;
        }
        .contact-form input[type="submit"] {
            height: 30px;
            color: #fff;
            font-size: 15px;
            background: red;
            cursor: pointer;
            border-radius: 25px;
            border: none;
            outline: none;
            margin-top: 15%;
        }
        .contact-form a
        {
            color: #fff;
            font-size: 14px;
            font-weight: bold;
            text-decoration: none;
        }
        input[type="checkbox"] {
            width: 20%;
        }
        table {
font-family: arial, sans-serif;
border-collapse: collapse;
font-size: 16px;
width: 100%;
}
td, th {
border: 4px solid #dddddd;
text-align: centre;
padding: 10px;
position: centre;
}
    </style>
</head>
<body>

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
        <h2>My Metrics</h2>
        <form id="login-form" class="form" action="searchfood" method="post">
                <table style="width:80%;" >
                                <thead>
                                <tr style="border: 1px solid white;">
                                   <th>Name</th>
                                   <th>Value</th>
                                 </tr>
                                 </thead>
                                 <tr>
                                   <td>Estimated weeks</td>
                                   <td>${estimatedweeks}</td>
                                 </tr>
                                 <tr>
                                   <td>Suggested calories per day</td>
                                   <td>${suggestedcals}</td>
                                 </tr>
                                 <tr>
                                   <td>bmr</td>
                                   <td>${bmrResult}</td>
                                 </tr>
                                 <tr>
                                   <td>tdee</td>
                                   <td>${tdeeResult}</td>
                                 </tr>
                                 <tr>
                                   <td>total user cal</td>
                                   <td>${usercalResult}</td>
                                 </tr>
                                 <tr>
                                   <td>food cals</td>
                                   <td>${totalfoodcalsResult}</td>
                                 </tr>
                                 <tr>
                                   <td>cals burned</td>
                                   <td>${totalcalsburnedResult}</td>
                                 </tr>
                                 <tr>
                                   <td>protein</td>
                                   <td>${totalproteinResult}</td>
                                 </tr>
                                 <tr>
                                   <td>carbs</td>
                                   <td>${totalcarbsResult}</td>
                                 </tr>
                                 <tr>
                                   <td>fat</td>
                                   <td>${totalfatResult}</td>
                                 </tr>
                                </table>


        </form>
    </div>

    <!-- <div class="contact-form">
            <h2>Enter The Food!</h2>
            <form id="login-form" class="form" action="searchfood" method="post">
                <p>Menu:</p>
                <input type="text" name="menu" placeholder="select a item" value="">
                <input type="submit" name="" value="Search">
            </form>
            <br>
            <form action="adduserfoodConsumption" method="post">
                <select name="foodId">
                    <c:forEach items="${FoodList}" var="foodlist">
                        <option value=${foodlist.getId()}> ${foodlist.getMenu()} - ${foodlist.getCalories()} </option>
                    </c:forEach>
                </select>
                <br>
                <br>
                <label for="servings">Servings</label> <input type="number" name="servings" placeholder="" required><br>
                <label for="Type">Type</label><br>
                <select name="type">
                    <option value="BREAKFAST">BreakfastT</option>
                    <option value="LUNCH">Lunch</option>
                    <option value="DINNER">Dinner</option>
                    <option value="SNACKS">Snacks</option>
                </select><br>
    
                <input type="submit" value="add">
            </form>
        </div> -->


</body>

</html>

<%-- <%
Gson gsonObj = new Gson();
Map<Object,Object> map = null;
UserFoodIntakeServices ufoodintakeservices = new UserFoodIntakeServices();

static Date dateobj = new Date();

public static String GenerateCurrentDate() {
	DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
	String stringDate = dateFormat.format(dateobj);

	return stringDate;
}
String email;
String GenerateCurrentDate();
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
map = new HashMap<Object,Object>(); map.put("label", "Calories"); map.put("y", tfr ); map.put("exploded", true); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "protein"); map.put("y",ufoodintakeservices.getTotalProtein(email, GenerateCurrentDate())); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Carbs"); map.put("y", ufoodintakeservices.getTotalCarbs(email, GenerateCurrentDate())); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Education"); map.put("y", 15); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Family"); map.put("y", 5); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Real Estate"); map.put("y", 7); list.add(map);
String dataPoints = gsonObj.toJson(list);
%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
window.onload = function() {
var chart = new CanvasJS.Chart("chartContainer", {
    theme: "light2",
    animationEnabled: true,
    exportFileName: "New Year Resolutions",
    exportEnabled: true,
    title:{
        text: "Top Categories of New Year's Resolution"
    },
    data: [{
        type: "pie",
        showInLegend: true,
        legendText: "{label}",
        toolTipContent: "{label}: <strong>{y}%</strong>",
        indexLabel: "{label} {y}%",
        dataPoints : <%out.print(dataPoints);%>
    }]
});
chart.render();
}
</script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script> --%>






<%-- <p>bmr :${bmrResult}</p>
<p>tdee :${tdeeResult}</p>
<p>total user cal :${usercalResult}</p>
<p>food cals: ${totalfoodcalsResult}</p>
<p>cals burned :${totalcalsburnedResult}</p>
<p>protein :${totalproteinResult}</p>
<p>carbs :${totalcarbsResult}</p>
<p>fat :${totalfatResult}</p>





<a href="bmr"> BMR  </a>
<p>${bmrmessageResult}</p>
<p>${bmrResult}</p>


<a href="tdee"> TDEE  </a>
<p>${tdeemessageResult}</p>

<a href="totalcals"> Total Calories Today  </a>
<p>${tcmessageResult}</p>
<p>${bmrResult}</p>

<a href="calsburned"> Cals Burned </a>
<p>${bmessageResult}</p>
<p>${result}</p>

<a href="totalcalsfood"> Calorie consumption </a>
<p>${cmessageResult}</p>
<p>${result}</p>

<a href="totalcarbs"> Carbs consumed </a>
<p>${carbmessageResult}</p>
<p>${result}</p>

<a href="totalprotein"> protein consumed </a>
<p>${pmessageResult}</p>
<p>${result}</p>

<a href="totalfat"> fat consumed </a>
<p>${fmessageResult}</p>
<p>${result}</p>
 --%>

</div>
</body>
</html>