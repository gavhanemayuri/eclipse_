<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
  <%@ include file="index.html"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String x,y;
x=request.getParameter("email");
y=request.getParameter("password");

Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/hotel","postgres","Mayuri123");

PreparedStatement ps=con.prepareStatement("select * from savelogin where email='"+x+"' and password= '"+y+"' ");

ResultSet rs=ps.executeQuery();
if(rs.next())
{
	HttpSession s1 = request.getSession();
	
	s1.setAttribute("temp",x);
	
	out.println("<script>");
	out.println("alert('login Successfull')");
	out.println("window.location.href='Bookdashboard.jsp'");

	out.println("</script>");
}
else{
	out.println("<script>");
	out.println("alert('login fail')");
	out.println("window.location.href='Login.jsp'");


	out.println("</script>");
}

%>


</body>
</html>