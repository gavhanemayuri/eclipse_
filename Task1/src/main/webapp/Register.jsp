
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="java.sql.*" %>
    

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
<%
String a = request.getParameter("name");
String b = request.getParameter("email");
String c = request.getParameter("password");
String d = request.getParameter("phone");

try {
   
	Class.forName("org.postgresql.Driver");
	Connection con = DriverManager.getConnection( "jdbc:postgresql://localhost:5433/hotel","postgres","Mayuri123");

    PreparedStatement ps = con.prepareStatement("INSERT INTO savelogin (name, email, password, phone) VALUES (?, ?, ?, ?)");
    ps.setString(1, a);
    ps.setString(2, b);
    ps.setString(3, c);
    ps.setString(4, d);

    int rows = ps.executeUpdate();
    if (rows > 0) {
        out.println("<script>");
        out.println("alert('Register Successful');");
        out.println("window.location.href='Login.jsp';");
        out.println("</script>");
    } else {
        out.println("<script>");
        out.println("alert('Registration failed. Try again.');");
        out.println("window.history.back();");
        out.println("</script>");
    }
    con.close();
} catch (SQLException e) {
    out.println("<script>");
    out.println("alert('SQL Error: " + e.getMessage() + "');");
    out.println("window.history.back();");
    out.println("</script>");
    e.printStackTrace();
} catch (Exception e) {
    out.println("<script>");
    out.println("alert('Error: " + e.getMessage() + "');");
    out.println("window.history.back();");
    out.println("</script>");
    e.printStackTrace();
}
%>
</body>
</html>
