<%@page import="McShop.Shop"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>McShop</title>
 <link rel="stylesheet" href="css/css.css">
</head>
<body>
<jsp:include page="header.jsp"/>
  <jsp:useBean id="test" class="McShop.Shop" />
  <%
   Shop tc = new Shop();
   tc.list();
  %>

<jsp:include page="footer.jsp"/>
</body>
</html>