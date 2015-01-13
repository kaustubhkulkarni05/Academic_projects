<!DOCTYPE html>
<html>
  <head>
    <title>Successful Login</title>
    <link rel='stylesheet' href='../stylesheets/style.css' />
      <link rel='stylesheet' href='../stylesheets/bootstrap.min.css' />
         <link rel="icon" href="../stylesheets/Yelp_favicon.ico">
  </head>
  
  <body>


  <div class="all-header">
  <img class="image-position" src="../stylesheets/header_logo.png" >
  </div>
    

	<h2 class="h2-position-new">All Reviews</h2>
<div class="message-comments">
    
        <ul>
        <c:forEach var="resultDescription" items="${resultDescription}"  varStatus="status">

        <li> Restaurant Name : <c:out value="${resultElement[status.index]}" /> </li>
        <li> Description     : <c:out value="${resultDescription}" /> </li>
        <li> Rating 	     : <c:out value="${resultRating[status.index]}" /> </li>
        <li> Reviwes         : <c:out value="${resultReview[status.index]}" /> </li>
        <li> Reviwer Name    : <c:out value="${resultReviwer[status.index]}" />
        <br></br>

</c:forEach>
</ul>
</div>

	<form action="../View/home.jsp" method="post">
	 <div class="signout-button">
	    <button type="submit" class="btn btn-primary">Sign out</button>
	 </div>
	 </form>
  </body>
</html>

