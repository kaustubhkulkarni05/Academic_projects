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
    
    <h2 class="h2-position">Last Login Time </h2>
    <div class="message-position">	
	<ul>
	
<c:forEach var="resultSet" items="${resultSet}">
<c:if test="${not fn:containsIgnoreCase(resultSet, 'Ljava.lang.String')}">
<td> <c:out value="${resultSet}" />  </td>
</c:if>
</c:forEach>
	
</ul>
	</div>


	<h2 class="h2-position-new">Your Comments</h2>
<div class="message-comments">
    
        <ul>
        <c:forEach var="resultDescription" items="${resultDescription}"  varStatus="status">
        <c:if test="${not fn:containsIgnoreCase(resultDescription, 'Ljava.lang.String')}">
        <li> Restaurant Name : <c:out value="${resultElement[status.index]}" /> </li>
        <li> Description     : <c:out value="${resultDescription}" /> </li>
        <li> Rating 	     : <c:out value="${resultRating[status.index]}" /> </li>
        <li> Reviwes         : <c:out value="${resultReview[status.index]}" /> </li>
        <li> Reviwer Name    : <c:out value="${resultReviwer}" />
        <br></br>
</c:if>
</c:forEach>

        </ul>
        
        
</div>



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

