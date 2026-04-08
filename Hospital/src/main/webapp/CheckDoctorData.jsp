<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
  <%@ include file="navbar.html"  %>
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

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");
PreparedStatement ps=con.prepareStatement("select * from doctorlogin where email='"+x+"' and password= '"+y+"' ");

ResultSet rs=ps.executeQuery();
if(rs.next())
{
	HttpSession s1 = request.getSession();
	
	s1.setAttribute("temp",x);
	
	out.println("<script>");
	out.println("alert('Apponiment Booked Successfull')");
	out.println("window.location.href='Doctordash.jsp'");

	out.println("</script>");
}
else{
	out.println("<script>");
	out.println("alert('Apponiment Booked fail')");
	out.println("window.location.href='doctorLogin.jsp'");


	out.println("</script>");
}

%>


</body>
</html>