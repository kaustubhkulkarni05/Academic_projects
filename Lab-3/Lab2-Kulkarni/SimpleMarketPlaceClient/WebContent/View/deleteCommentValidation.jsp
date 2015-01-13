<!DOCTYPE html>
<html>
  <head>
    <title>Invalid details</title>
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
    

	<h2 class="h2-position-new">Please check following details</h2>
	
	<h3 class="h2-position-new1">Reviwers Name can not be blank</h3>
	<h3 class="h2-position-new2">Category Name can not be blank</h3>
	
	<form action="../View/deleteCommentForm.jsp" method="post">
	 <div class="signout-button">
	 
	    <button type="submit" class="btn btn-primary">Back</button>
	
	 </div>
	 </form>
    
       	

  </body>
</html>

