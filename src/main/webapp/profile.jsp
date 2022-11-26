<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>McShop</title>
 <link rel="stylesheet" href="css/css.css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div>
   <%
   		
        String username = (String)session.getAttribute("name");
  		System.out.print(""+username);
        if(username==null)  {
    %>            
        <p> username is null</p> 
    <%
        } else {
    %>
        <p> username is not null</p> 
    <%
        }
    %>
</div>

<jsp:include page="footer.jsp"/>
</body>
</html>
