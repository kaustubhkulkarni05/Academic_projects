<!DOCTYPE html>
<html>
  <head>
    <title>Invalid Credentials</title>
    <link rel='stylesheet' href='../stylesheets/style.css' />
      <link rel='stylesheet' href='../stylesheets/bootstrap.min.css' />
         <link rel="icon" href="../stylesheets/Yelp_favicon.ico">
  </head>
  
  <body>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

  <div class="all-header">
  <img class="image-position" src="../stylesheets/header_logo.png" >
  </div>
    

	<h2 class="h2-position-new">Please check following fields</h2>
	
	<h3 class="h2-position-new1">Email ID should not contain special characters after '@'</h3>
	<h3 class="h2-position-new2">Valid Email : john.smith@gmail.com</h3>
	<h3 class="h2-position-new3">Invalid Email : john.smith@#$@gmail.com</h3>
	
	<h3 class="h2-position-new4">First Name should not be null</h3>
	<h3 class="h2-position-new5">Last Name should not be null</h3>
	<h3 class="h2-position-new6">Password should be at least of 6 characters.</h3>
	
	

	<form action="../View/home.jsp" method="post">
	 <div class="signout-button">
	 
	    <button type="submit" class="btn btn-primary">Home</button>
	
	 </div>
	 </form>
    
       	

  </body>
</html>

