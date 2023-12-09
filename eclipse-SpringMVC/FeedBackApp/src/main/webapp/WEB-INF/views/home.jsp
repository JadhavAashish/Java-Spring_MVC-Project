<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href='<c:url value="resources/CSS/admin.css"></c:url>'>
    </head>
    <body>
    <div class="LoginContainer">
	    <form name="frm" action="validateAdmin" method="post">
		    	<ul class="adminLoginForm">
			        <li><input type="text" name="email" value="" class="control"></li>
			        <li><input type="password" name="password" value="" class="control"></li>
			        <li><input type="submit" name="s" value="Login" class="control"></li>
		        </ul>
		  ${msg}
		</form>
  	</div>
    </body>
</html>
