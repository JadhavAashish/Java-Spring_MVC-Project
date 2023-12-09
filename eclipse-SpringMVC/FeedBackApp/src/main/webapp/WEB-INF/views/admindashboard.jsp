<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="resources/CSS/admin.css"></c:url>">
</head>
<body>
	<div class="dashContainer">
		<div class="adminNavBar">
		<ul class="subDropDown">
			<li><a href='#'>Subject Master</a>
				<ul class="subDropDownContent">
					<li><a href='newsub'>New Subject</a></li>
					<li><a href='viewallsub'>View All</a></li>
				</ul>
			</li>
		</ul>
		
		<ul class="trainerDropDown">
			<li><a href='#'>Trainer Master</a>
				<ul class="trainerDropDownContent">
					<li><a href='newtrainer'>New Trainer</a></li>
					<li><a href='viewallsub'>View All</a></li>
				</ul>
			</li>
		</ul>
		</div>
		<div class="formContainer">
			<h1>Online FeedBack System for Private Training Institute's</h1>
			<hr>
		
</body>
</html>