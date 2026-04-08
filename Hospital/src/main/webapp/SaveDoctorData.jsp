<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
     <%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String a,b,c,d;
a=request.getParameter("username");
b=request.getParameter("email");
c=request.getParameter("password");
d=request.getParameter("phone");


Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");

con.prepareStatement("insert into doctorlogin values('"+UUID.randomUUID().toString()+"','"+a+"','"+b+"','"+c+"','"+d+"')").executeUpdate();

out.println("<script>");
out.println("alert('Register Successfull')");
out.println("window.location.href='doctorLogin.jsp'");


out.println("</script>");

%>
</body>
</html>