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
    

	<h2 class="h2-position-new">Categories You Added</h2>
<div class="message-comments">
    
        <ul>
        <c:forEach var="resultCategory" items="${resultCategory}"  varStatus="status">
        <c:if test="${not fn:containsIgnoreCase(resultCategory, 'Ljava.lang.String')}">
        <li> Category Name : <c:out value="${resultCategory}" /> </li>
        <li> Description     : <c:out value="${resultDescription[status.index]}" /> </li>
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
	
		<form action="../View/addCategoryForm.jsp" method="post">
	 <div class="add-button">
	 <div class="pull-left signOut">
	    <button type="submit" class="btn btn-primary">Add Category</button>
	 </div>
	 </div>
	  <br></br>
	 </form>
	
	 
	 <form action="../View/deleteCategoryForm.jsp" method="post">
	 	 <div class="delete-button">
	 <div class="pull-left signOut">
	    <button type="submit" class="btn btn-primary">Delete Category</button>
	 </div>
	 </div>
	 <br></br>
	 </form>
	 
	 
	 <form action="../View/updateCategoryForm.jsp" method="post">
	 	 <div class="update-button">
	 <div class="pull-left signOut">
	    <button type="submit" class="btn btn-primary">Update Category</button>
	 </div>
	 </div>
	 <br></br>
     </form>  
     
       	

  </body>
</html>

