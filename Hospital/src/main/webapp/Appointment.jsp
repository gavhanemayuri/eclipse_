

<%@ include file="navbar.html"%>

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<style>
    body {
      font-family: Arial, sans-serif;
      background: #f5f7fa;
      padding: 20px;
    }

    .form-container {
      max-width: 700px;
      background: #fff;
      margin: auto;
      padding: 30px;
      border-radius: 8px;
      box-shadow: 0 0 15px rgba(0,0,0,0.1);
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin-top: 15px;
      font-weight: bold;
    }

    input, select {
      width: 100%;
      padding: 10px;
      margin-top: 5px;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

  

    button {
      margin-top: 20px;
      padding: 10px;
      width: 100%;
      background-color: #28a745;
      color: white;
      font-size: 16px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    button:hover {
      background-color: #218838;
    }

    .note {
      text-align: center;
      font-size: 0.9em;
      color: #666;
      margin-top: 10px;
    }
  </style>
</head>
<body>

  <div class="form-container">
    <h2>Patient Appointment Form</h2>
    <form action="PatientSaveData.jsp" method="post">
      <label for="firstName">First Name</label>
      <input type="text" id="firstName" name="name" required>    

      <label for="email">Email</label>
      <input type="email" id="email" name="email" required>

      <label for="phone">Phone</label>
      <input type="tel" id="phone" name="phone">
      
      <label for="Doctor">Doctor Name</label>
      <select id="doctor" name="doctor">
      
      <%

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor","root","");

PreparedStatement ps=con.prepareStatement("select email from doctorlogin ");

ResultSet rs=ps.executeQuery();
while(rs.next())
{
%>

<option><%=rs.getString(1) %></option>

<%

}

%>
              </select>
      
      <label for="date">Appointment Date</label>
      <input type="date" id="date" name="date" required>

      <label for="time">Appointment Time</label>
      <input type="time" id="time" name="time" required>

      <label for="message">Dises</label>
      <textarea id="message" name="dises" rows="3" placeholder=" information"></textarea>
      
      <button type="submit">Book Appointment</button>

      <div class="note">
        A confirmation email will be sent to you.
      </div>
    </form>
  </div>

</body>
</html>



</body>
</html>