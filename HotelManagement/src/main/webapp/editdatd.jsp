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
<%

String name=request.getParameter("x");

Class.forName("org.postgresql.Driver");
Connection con = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/hotel","postgres","Mayuri123");

PreparedStatement ps=con.prepareStatement("select * from  proom where name='"+name+"'");
ResultSet rs=ps.executeQuery();

while(rs.next())
{
%>
<center><div class="t1">
<h3>Edit Form</h3>
 <form action="UpdateCustomerData.jsp" method="post">
 <input type="text" class="form-control" name="name" value=<%=rs.getString(1) %>   >
 <input type="text" class="form-control" name="email" value=<%=rs.getString(2) %>   >
 <input type="text" class="form-control" name="phone" value=<%=rs.getString(3) %>   >
 <input type="text" class="form-control" name="checkin" value=<%=rs.getString(4) %>   >
 <input type="text" class="form-control" name="checkout" value=<%=rs.getString(5) %>   >
 <input type="text" class="form-control" name="guests" value=<%=rs.getString(6) %>   >
 <input type="text" class="form-control" name="rooms" value=<%=rs.getString(7) %>   >
 <button type="submit" class="btn btn-outline-primary">Update</button>
 
 </form>

</div>
</center>
<%
}
%>


</body>
</html>

<style>
.t1
{
width:400px;
height:700px;
border-style:groove;

}
</style>