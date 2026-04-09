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

String name=request.getParameter("x");

Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/hotel","postgres","Mayuri123");

con.prepareStatement("delete from proom where name='"+name+"' ").executeUpdate();


out.println("<script>");
out.println("alert('room Deleted')");
out.println("window.location.href='Bookdashboard.jsp'");
out.println("</script>");

%>
</body>
</html>