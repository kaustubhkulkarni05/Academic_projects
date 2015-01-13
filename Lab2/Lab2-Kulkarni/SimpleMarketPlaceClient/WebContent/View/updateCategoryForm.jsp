  <!DOCTYPE html>
<html>
  <head>
    <title>Update Category</title>
    <link rel='stylesheet' href='../stylesheets/style.css' />
     <link rel="icon" href="../stylesheets/Yelp_favicon.ico">
         <link rel='stylesheet' href='../stylesheets/bootstrap.min.css' />
  </head>
  <body>
    <div class="all-header">
  <img class="image-position" src="../stylesheets/header_logo.png" >
  </div>
    <h1>Update Category section</h1>
    <br></br>
  <form action="updateCategory" method="post">
    <!-- This panel is for login -->
    
    <div class="panel_new panel-primary">
      <!-- Default panel contents -->
        <div class="panel-heading" color = 'red'>Update Category</div>
        <div class="panel-body">
           <form class="form-horizontal" role="form">
           
           		      <div class="form-group  usernameDiv">
		             <div class="col-sm-10">
		           	<input type="old_category_name" class="form-control" name="old_category_name" id="old_category_name" placeholder="Old category Name">
		                  </div>
		               </div>

		               <div class="form-group  usernameDiv">
		             <div class="col-sm-10">
		           	<input type="category_name" class="form-control" name="category_name" id="category_name" placeholder="Category Name">
		                  </div>
		               </div>
		               
		          <div class="form-group  usernameDiv">
		               <div class="col-sm-10">
		           	<input type="category_desc" class="form-control" name="category_desc" id="category_desc" placeholder="Category Description">
		                  </div>
		               </div>
		               
		               	                  
	                  <div class="form-group ">
	                    <div class="pull-left signIn">
	                      <button type="submit" class="btn btn-primary">Update Category</button>
	                    </div>
	                  </div>
              </form>
        </div>
	</div>
 </form>
  </body>
</html>