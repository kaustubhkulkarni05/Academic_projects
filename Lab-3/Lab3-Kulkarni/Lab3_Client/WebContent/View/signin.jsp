<html>
  <head>
    <title>Login</title>
   <link rel='stylesheet' href='../stylesheets/style.css' />
    <link rel='stylesheet' href='../stylesheets/bootstrap.min.css' />
    <link rel="icon" href="../stylesheets/Yelp_favicon.ico">
    <script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
	
  </head>
  <body>
  <div class="all-header">
  <img class="image-position" src="../stylesheets/header_logo.png" >
  </div>
  <form action="signIn" method="post">
    <!-- This panel is for login -->
    
    <div class="panel panel-primary">
      <!-- Default panel contents -->
        <div class="panel-heading" color = 'red'>Login</div>
        <div class="panel-body">
           <form class="form-horizontal" role="form">
		               <div class="form-group  usernameDiv">
		                  <label class="inputUsername" class="col-sm-2 control-label pull-left">Enter your Email id</label>
		                  <div class="col-sm-10">
		                      <input type="email" class="form-control" name="inputUsername" id="inputUsername" placeholder="Email Id">
		                  </div>
		               </div>
	                  <div class="form-group  usernameDiv">
	                    <label for="inputPassword">Password</label>
	                    <div class="col-sm-10">
	                      <input type="password" class="form-control" name="inputPassword" id="inputPassword" placeholder="Password">
	                    </div>
	                  </div>
	                  
	                  <div class="form-group ">
	                    <div class="pull-left signIn">
	                      <button type="submit" class="btn btn-primary">Sign in</button>
	                    </div>
	                  </div>
              </form>
        </div>
	</div>
	

 </form>	

 </body>
 
</html>