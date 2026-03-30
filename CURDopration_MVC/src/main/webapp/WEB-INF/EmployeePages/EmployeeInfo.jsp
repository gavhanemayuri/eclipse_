<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1>hello</h1>
<table border="1px" class="table">
<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Pass</th>
<th>Confirm Pass</th>
<th>Action</th>
</tr>
<c:forEach  items="${temp}" var="e">

<tr>
<td>${e.eid}</td>
<td>${e.ename}</td>
<td>${e.eemail}</td>
<td>${e.epass}</td>
<td>${e.ecpass}</td>
<td>
<a href="editData/${e.eid}"class="btn btn-outline-primary">Edit</a>
<a href="deletedata/${e.eid}"class="btn btn-outline-danger">Delete</a>
<a href=""class="btn btn-outline-info">Details</a>
</td>

</tr>
</c:forEach>

</table>


<script>
        // Function to extract query parameters
        function getQueryParam(param) {
            let urlParams = new URLSearchParams(window.location.search);
            return urlParams.get(param);
        }

        // Show popup if the message parameter exists
        window.onload = function() {
            let message = getQueryParam("message");
            if (message) {
                alert(message);
            }
        };
    </script>

</body>
</html>

