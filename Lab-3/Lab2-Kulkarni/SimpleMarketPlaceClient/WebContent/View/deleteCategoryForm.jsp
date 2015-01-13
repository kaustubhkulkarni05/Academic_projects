  <!DOCTYPE html>
<html>
  <head>
    <title>Delete Category</title>
    <link rel='stylesheet' href='../stylesheets/style.css' />
     <link rel="icon" href="../stylesheets/Yelp_favicon.ico">
         <link rel='stylesheet' href='../stylesheets/bootstrap.min.css' />
  </head>
  <body>
    <div class="all-header">
  <img class="image-position" src="../stylesheets/header_logo.png" >
  </div>
    <h1>Delete Category section</h1>
    <br></br>
  <form action="deleteCategory" method="post">
    <!-- This panel is for login -->
    
    <div class="panel_new panel-primary">
      <!-- Default panel contents -->
        <div class="panel-heading" color = 'red'>Delete Category</div>
        <div class="panel-body">
           <form class="form-horizontal" role="form">

		               <div class="form-group  usernameDiv">
		             <div class="col-sm-10">
		           	<input type="category_name" class="form-control" name="category_name" id="category_name" placeholder="Category Name">
		                  </div>
		               </div>
		               
		               	                  
	                  <div class="form-group ">
	                    <div class="pull-left signIn">
	                      <button type="submit" class="btn btn-primary">Delete Category</button>
	                    </div>
	                  </div>
              </form>
        </div>
	</div>
 </form>
  </body>
</html>