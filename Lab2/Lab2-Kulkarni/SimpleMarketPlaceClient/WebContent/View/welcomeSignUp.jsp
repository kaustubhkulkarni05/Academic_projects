<!DOCTYPE html>
<html>
  <head>
    <title>Successful Login</title>
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
    


	<h2 class="h2-position-new">Welcome to Yelp !!</h2>




	<form action="../View/home.jsp" method="post">
	 <div class="signout-button">
	 
	    <button type="submit" class="btn btn-primary">Sign out</button>
	
	 </div>
	 </form>
	
		<form action="../View/addCommentForm.jsp" method="post" class="addCommentForm">
	 <div class="add-button">
	 <div class="pull-left signOut">
	    <button type="submit" class="btn btn-primary">Add Comment</button>
	 </div>
	 </div>
	  <br></br>
	 </form>
	
	 
	 <form action="../View/deleteCommentForm.jsp" method="post" class="deleteCommentForm">
	 	 <div class="delete-button">
	 <div class="pull-left signOut">
	    <button type="submit" class="btn btn-primary">Delete Comment</button>
	 </div>
	 </div>
	 <br></br>
	 </form>
	 
	 
	 <form action="../View/updateCommentForm.jsp" method="post" class="updateCommentForm">
	 	 <div class="update-button">
	 <div class="pull-left signOut">
	    <button type="submit" class="btn btn-primary">Update Comment</button>
	 </div>
	 </div>
	 <br></br>
     </form>  
     
       	

  </body>
</html>

