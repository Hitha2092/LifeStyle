<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</style>
</head>
<body>
<body>
	<h1>LifeStyle+</h1>
	<hr>
	<a href="${pageContext.request.contextPath}/home">Home</a>
	<hr>
	<h1>Update Profile</h1>
	<div>
		<form action="saveUserProfile"
			method="post">
			
			<label for="id">Id</label><input type="number" name="id" value="${uprofile.id}" readonly="true"><br>
			<label for="height">Height</label><input type="number" name="height" value="${uprofile.height}" ><br>
			<label for="weight">Weight</label><input type="number" name="weight" value="${uprofile.weight}" ><br>
			<label for="age">Age</label><input type="number" name="age"    value="${uprofile.age}" ><br>
			<label for="gender">Gender</label>
			<select name="gender">
				<option value="male">male</option>
				<option value="female">female</option>
			</select>
			<%-- <input type="text" name="gender" value="${uprofile.gender}" > --%><br>
			
			<label for="desiredweight">Desired Weight</label><input type="number" name="desiredweight" value="${uprofile.desiredweight}" ><br>
			<label for="activity">Activity</label>
			<select name="activity">
				<option value="Sedentary">Sedentary</option>
				<option value="Light_Exercise">Light_Exercise</option>
				<option value="Moderate_Exercise">Moderate_Exercise</option>
				<option value="Heavy_Exercise">Heavy_Exercise</option>
				<option value="Athlete">Athlete</option>
			</select>
			<button type="submit"  value="Save">Save</button>
		</form>
	</div>
</body>
</html>