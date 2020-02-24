<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Connexion au Tableau de Vehicules</title>
		
 		<link href="/TestJEE/css/bootstrap.min.css" rel="stylesheet">

	</head>
	<body>
					
		<h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div class="row justify-content-center align-items-center">
	            <form class="form col-md-4 jumbotron" action="/TestJEE/jsp/index" method="post">
	                <h3 class="text-center text-info">Login</h3>
	                <div class="form-group">
	                    <label for="username" class="text-info">Username:</label><br>
	                    <input type="text" name="username" id="username" class="form-control">
	                </div>
	                <div class="form-group">
	                    <label for="password" class="text-info">Password:</label><br>
	                    <input type="password" name="password" id="password" class="form-control">
	                </div>
	                <div class="form-group">
	                    <label for="remember-me" class="text-info">
		                    <span>Remember me</span> 
		                    <span><input name="remember-me" type="checkbox"></span>
	                    </label><br>
	                     <div class="row justify-content-center align-items-center">
	                     	<input type="submit" name="submit" class="btn btn-info btn-lg" value="submit">
	                     </div>
	                    
	                </div>
	            </form>
            </div>
        </div>
    
     
		
		<script src="/TestJEE/js/jquery.min.js"></script>
		<script src="/TestJEE/js/bootstrap.min.js"></script>
		<script src="/TestJEE/js/popper.min.js"></script>
		<script src="/TestJEE/js/monJquery.js"></script>
		
	</body>
</html>