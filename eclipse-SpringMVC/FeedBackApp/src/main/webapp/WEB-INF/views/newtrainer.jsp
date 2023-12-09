<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<c:url value="resources/JS/validation.js"></c:url>" type="text/javascript"></script>
</head>
<body>
<jsp:include page="admindashboard.jsp"></jsp:include>
	 
	 <form name="frm" action='' method="get">
		 <div class="trainerForm">
		 	<table width='100%' style='position:absolute;' border='0' height='60%'>
		 		<tr>
			 		<td style='border:0px solid white'><input type='text' name='name' value='' class='control' placeholder='Enter Name' style='width:300px'></td>
			 		<td style='border:0px solid white'><input type='text' name='name' value='' class='control' placeholder='Enter Email' style='width:300px'></td>
			 		<td style='border:0px solid white'><input type='text' name='name' value='' class='control' placeholder='Enter Contact' style='width:259px'></td>
		 		</tr>
		 		
		 		<tr>
			 		<td style='border:0px solid white'><input type='date' name='name' value='' class='control'  style='width:300px'></td>
			 		<td style='border:0px solid white'><input type='text' name='name' value='' class='control' placeholder='Enter Experience' style='width:300px'></td>
			 		<td style='border:0px solid white'>
				 		<select name='degree' class='control' style='width:259px'>
				 			<option>Select Degree</option>
				 			<option>BE</option>
				 			<option>B.Tech</option>
				 		</select>
				 		&nbsp;<input type='button' name='qualBtn' value='+' class='roundBtn' onclick='createQualForm()'/>
			 		</td>
		 		</tr>
		 		
		 		<tr>
			 		<td style='border:0px solid white'>
				 		<select name='skill' class='control' style='width:259px'>
				 			<option>Select SkillSet</option>
				 			<option>C</option>
				 			<option>Java</option>
				 		</select>&nbsp;<input type='button' name='qualBtn' value='+' class='roundBtn'/>
			 		</td>
			 		
			 		<td style='border:0px solid white'>
				 		<select name='university' class='control' style='width:259px'>
				 			<option>Select University</option>
				 			<option>Shivaji Unversity</option>
				 			<option>SPPU</option>
				 			<option>SGU</option>
				 		</select>&nbsp;<input type='button' name='qualBtn' value='+' class='roundBtn'/>
			 		</td>
			 		
			 		<td style='border:0px solid white'>
				 		<select name='clg' class='control' style='width:259px'>
				 			<option>Select Collage</option>
				 			<option>TKIET</option>
				 			<option>KIT</option>
				 		</select>&nbsp;<input type='button' name='qualBtn' value='+' class='roundBtn'/>
			 		</td>
		 		</tr>
		 		<tr><td align='center' colspan='4'><input type='submit' name='s' value='Add New Trainer' class='control'></td></tr>
		 	</table>
		 </div>
	 </form>
	 <div id='runtimeForm'>
	 	<form name='frm' id='f' action='saveQual' method="post">
	 	
	 	</form>
	 	${msg}
	 </div>
	</div>
</div>
</body>
</html>