  <!DOCTYPE html>
<html>
  <head>
    <title>Restaurants</title>
    <link rel='stylesheet' href='../stylesheets/style.css' />
     <link rel="icon" href="../stylesheets/Yelp_favicon.ico">
         <link rel='stylesheet' href='../stylesheets/bootstrap.min.css' />
  </head>
  <body>
    <div class="all-header">
  <img class="image-position" src="../stylesheets/header_logo.png" >
  </div>
    <h1>Delete comments section</h1>
    <br></br>
    <h3>Enter the Restaurant's Name</h3>
    <h3>For delete comments</h3>
  <form action="deleteComment" method="post">
    <!-- This panel is for login -->
    
    <div class="panel_new panel-primary">
      <!-- Default panel contents -->
        <div class="panel-heading" color = 'red'>Delete Comment</div>
        <div class="panel-body">
           <form class="form-horizontal" role="form">

		               <div class="form-group  usernameDiv">
		             <div class="col-sm-10">
		           	<input type="review_name" class="form-control" name="review_name" id="review_name" placeholder="Reviewer's Name">
		                  </div>
		               </div>
		               
		               <div class="form-group  usernameDiv">
		               <div class="col-sm-10">
		           	<input type="rest_name" class="form-control" name="rest_name" id="rest_name" placeholder="Restaurant Name">
		                  </div>
		               </div>
		               
		               	                  
	                  <div class="form-group ">
	                    <div class="pull-left signIn">
	                      <button type="submit" class="btn btn-primary">Submit Review</button>
	                    </div>
	                  </div>
              </form>
        </div>
	</div>
 </form>
  </body>
</html>