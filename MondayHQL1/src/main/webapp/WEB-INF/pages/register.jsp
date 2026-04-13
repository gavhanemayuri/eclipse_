<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
  body {
    font-family: Arial, sans-serif;
    background: #f5f5f5;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
  }

  #form-switch {
    display: none;
  }

  form {
    background: white;
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0,0,0,0.1);
    width: 300px;
    position: absolute;
    transition: opacity 0.5s ease, transform 0.5s ease;
  }

  form input {
    width: 100%;
    margin-bottom: 15px;
    padding: 10px;
    font-size: 14px;
    border: 1px solid #ccc;
    border-radius: 5px;
  }

  form button {
    width: 100%;
    padding: 10px;
    background: #007BFF;
    color: white;
    font-weight: bold;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }

  form label {
    display: block;
    margin-top: 15px;
    text-align: center;
    color: #007BFF;
    cursor: pointer;
    text-decoration: underline;
  }

  #login-form {
    z-index: 2;
    opacity: 1;
    transform: translateX(0);
  }
  #form-switch:checked ~ #login-form {
    opacity: 0;
    transform: translateX(-50px);
    z-index: 1;
  }

  #form-switch:checked ~ #register-form {
    opacity: 1;
    transform: translateX(0);
    z-index: 2;
  }
    #register-form {
    z-index: 1;
    opacity: 0;
    transform: translateX(50px);
  }
 
  </style>
</head>
<body>

<input type='checkbox' id='form-switch'>
<form id='login-form' action="manager.jsp" method='post'>
  <input type="text" name="email" placeholder="email" required>
  <input type="password" name="password" placeholder="Password" required>
  <button type='submit'>Login</button>
  <label for='form-switch'><span> Register</span></label>
</form>

<form id='register-form' action="SavestudentInfo" method='post'>
<input type="number" name="sid" placeholder="id" required>
  <input type="text" name="sname" placeholder="Username" required>
  <input type="email" name="semail" placeholder="Email" required>
  <input type="password"name="spass" placeholder="Password" required>
  <button type='submit'>Register</button>
  <label for='form-switch'>Already Member ? Sign In Now..</label>
</form>



</body>
</html>