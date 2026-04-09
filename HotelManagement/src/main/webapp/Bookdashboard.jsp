<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   
     <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>Hello.........</h1>
<table border="1px" calss="table">
<tr>

<th>Name</th>
<th>Email</th>
<th>phone</th>
<th>checkin</th>
<th>checkout</th>
<th>guests</th>
<th>rooms</th>
<th>action</th>

</tr>
<%

HttpSession s1 = request.getSession();

Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/hotel","postgres","Mayuri123");

PreparedStatement ps = con.prepareStatement("SELECT * FROM proom");

ResultSet rs = ps.executeQuery();


while(rs.next())
{
%>
	<tr>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	<td><%=rs.getString(6) %></td>
	<td><%=rs.getString(7) %></td>
	<td>
	<a href="editdatd.jsp?x=<%=rs.getString(1) %>" class="btn btn-outline-primary">Edit</a>
	<a href="Deletedata.jsp?x=<%=rs.getString(1) %>"  class="btn btn-outline-danger">Delete</a>
	</td>
	</tr>
	
<% 
}

%>
</table>
</body>
</html>