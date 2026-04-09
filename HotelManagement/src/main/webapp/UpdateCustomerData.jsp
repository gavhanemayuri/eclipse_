<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
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
d=request.getParameter("checkin");
e=request.getParameter("checkout");
f=request.getParameter("guests");
g=request.getParameter("rooms");

Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/hotel","postgres","Mayuri123");

con.prepareStatement("update proom set email='"+b+"',phone='"+c+"',checkin='"+d+"',checkout='"+e+"',guests='"+f+"',rooms='"+g+"'where name='"+a+"'").executeUpdate();

out.println("<script>");
out.println("alert('customer update record')");
out.println("window.location.href='Bookdashboard.jsp'");

out.println("</script>");

%>
</body>
</html>