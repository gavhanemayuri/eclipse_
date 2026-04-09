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
    background: url('https://watermark.lovepik.com/photo/20211120/large/lovepik-hotel-room-picture_500530794.jpg') no-repeat center center fixed;
    background-size: cover;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    margin: 0;
  }

  .booking-form {
    background: rgba(255, 255, 255, 0.9); /* Slight transparency */
    padding: 30px;
    border-radius: 10px;
    box-shadow: 0 0 15px rgba(0,0,0,0.2);
    width: 400px;
  }

  .booking-form h2 {
    text-align: center;
    margin-bottom: 20px;
    color: #333;
  }

  .booking-form label {
    display: block;
    margin-top: 10px;
    font-weight: bold;
  }

  .booking-form input,
  .booking-form select {
    width: 100%;
    padding: 10px;
    margin-top: 5px;
    border-radius: 5px;
    border: 1px solid #ccc;
  }

  .booking-form button {
    width: 100%;
    padding: 12px;
    background-color: #28a745;
    color: white;
    border: none;
    border-radius: 5px;
    margin-top: 20px;
    font-size: 16px;
    cursor: pointer;
  }

  .booking-form button:hover {
    background-color: #218838;
  }
</style>
   
  
</head>
<body>

<form class="booking-form" action="savedataroombooking.jsp" method="post">
       
    <h2>Hotel Room Booking</h2>

    <label for="name">Full Name</label>
    <input type="text" id="name" name="name" required>

    <label for="email">Email Address</label>
    <input type="email" id="email" name="email" required>

    <label for="phone">Phone Number</label>
    <input type="tel" id="phone" name="phone" required>

    <label for="checkin">Check-in Date</label>
    <input type="date" id="checkin" name="checkin" required>

    <label for="checkout">Check-out Date</label>
    <input type="date" id="checkout" name="checkout" required>

    <label for="guests">Number of Guests</label>
    <input type="number" id="guests" name="guests" min="1" required>

    <label for="room">Room Type</label>
    <select id="room" name="rooms" required>
      <option value="">-- Select Room Type --</option>
      <option value="single">Single Room</option>
      <option value="double">Double Room</option>
      <option value="deluxe">Deluxe Room</option>
      <option value="suite">Suite</option>
    </select>

    <button type="submit">Book Now</button>
  </form>






</body>
</html>