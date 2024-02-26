<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Register Form</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>

<body >

<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="about-us">About US</a>
        </li>
        
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

	<div class="container">
		<h1>Register here</h1>
		
		<div class="row">
		<div class="col">
		
		 <img src="img/re.jpg" width="500" height="400"> 
		
		</div>
			
		</div>

		<div class ="col" >
		
		<div class="row">
			<div class="col-4">

				<form method="post" action="reg">

					<div class="mb-3">
						<label for="name" class="form-label">Enter Your Name</label> 
						<input type="text" class="form-control" name="user_name" placeholder="Enter Your Name" required>
					</div>
					
					<div class="mb-3">
						<label for="email" class="form-label">Enter Your Email</label> <input
							type="text" class="form-control" name="user_email" placeholder="xxxx@gmail.com" required>
					</div>
					
					
					<div class="mb-3">
						<label for="password" class="form-label">Enter Your Password</label>
						 <input type="password" class="form-control" name="user_password" placeholder="*******" required>
					</div>
					
					
					
					<div class="mb-3">
						
						 <input type="submit" class="btn btn-success" value="Register">
					</div>
		</div>
		
		
		</div>

			
					<h2>
			Current Date is
			<%
		Date today = new Date();
		%>
			<%=today%>
		</h2>
					
				
				</form>

			</div>

		</div>



	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>












