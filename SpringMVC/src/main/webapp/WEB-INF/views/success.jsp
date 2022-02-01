<%@page import="springmvc.Model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body>

 <% 
 		User user = (User)request.getAttribute("user");
 		
 
 %>
 
 Welcome,<%=user.getName() %><br>
 Your Phone Number is:<%=user.getPhoneNumber() %><br>
 &&<br>
 Your Email id is:<%=user.getEmail() %>
 <div>
 	My Image is:<img src="<%=user.getAvatar() %>" width="240" height="300">
 
 </div>

</body>
</html>