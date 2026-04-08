<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ page import="java.sql.*" %>
  <%@ page import="java.util.*" %>
  <%@ include file="navbar.html"  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String a,b,c,d,e,f,g;
a=request.getParameter("name");
b=request.getParameter("email");
c=request.getParameter("phone");
d=request.getParameter("doctor");
e=request.getParameter("date");
f=request.getParameter("time");
g=request.getParameter("dises");

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");

String id=UUID.randomUUID().toString();
con.prepareStatement("insert into patients values('"+id+"','"+a+"','"+b+"','"+c+"','"+d+"','"+e+"','"+f+"','"+g+"')").executeUpdate();

out.println("<script>");
out.println("alter('Apponiment Booked Successfull')");
out.println("window.location.href='navbar.html'");


out.println("</script>");
%>
</body>
</html>