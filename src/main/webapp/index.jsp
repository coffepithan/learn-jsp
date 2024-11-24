<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Learning jsp!</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	
</head>
<body class="bg-dark">

	<div class="d-flex justify-content-center align-items-center text-light" style="height: 900px">
		
		<form action="ServletLogin" method="post" class="bg-light text-dark rounded p-3">
		
		  	<div class="mb-3">
			    <label for="login" class="form-label">Login</label>
			    <input type="text" class="form-control" id="login" name="login" >
		 	 </div>
		  
		  	<div class="mb-3">
			    <label for="pwd" class="form-label">Password</label>
			    <input type="password" class="form-control" name="pwd" id="pwd">
		 	 </div>
		 
		  	<button type="submit" class="btn btn-primary">Submit</button><br>
			<p class="text-danger">${msg}</p>
		</form>

		
	</div>

</body>
</html>