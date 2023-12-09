<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<c:url value="resources/JS/validation.js"></c:url>" type="text/javascript"></script>
<link rel="stylesheet" href="<c:url value="resources/CSS/admin.css"></c:url>">
</head>
<body>
<jsp:include page="admindashboard.jsp"></jsp:include>
	 
	 <form name="frm" action="savesub" method="post">
	 <div class="formControl">
	 <input type="text" name="name" id="subName" value="" 
	 style="width:80%;height:30px;margin-left:45px;" placeholder="Enter Subject Name" onkeyup="searchSubject(this.value)"/>
	 <br><br>
		 <div id="frmControl">
		 	 <table>
		 		<tr><th>Subject Name</th><th>Update Subject</th><th>Disable Subject</th></tr>
		 		<c:forEach var="sub" items="${subjectlist}">
					<tr>
						<td>${sub.getName()}</td>
						<td><a href="updateSubject?subName=${sub.getName()}&id=${sub.getId()}">Update</a></td>
						<td><a href="disableSubject?subId=${sub.getId()}">Disable</a></td>
					</tr>	 	
		 		</c:forEach>
		 	</table>
		 </div>	
	 </div>
	 </form>
	
	</div>
</div>
</body>
</html>