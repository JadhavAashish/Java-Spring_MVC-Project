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
	 
	 <form name="frm" action="finalSubjectUpdate" method="post">
	 <div class="formControl">
	 	 <ul class="adminLoginForm">
			 <li><input type="hidden" name="id" value="${sid}" class="control"></li>
			 <li>
			 	<input type="text" name="name" value="${sname}" class="control" onkeyup="validateName(this.value)">&nbsp;&nbsp;
			 	<span id='sp'></span>
			 </li>
			 			 
			 <li><input type="submit" name="s" value="Update Subject" class="control"></li>
		 </ul>
		 ${msg}
	 </div>
	 </form>
	
	</div>
</div>
</body>
</html>