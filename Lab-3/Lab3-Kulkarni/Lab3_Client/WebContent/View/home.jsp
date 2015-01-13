<!DOCTYPE html>



<html>
  <head>
    <title>Yelp San Jose</title>
    <link rel='stylesheet' href='../stylesheets/style.css' />
       <link rel='stylesheet' href='../stylesheets/bootstrap.min.css' />
     <link rel="icon" href="../stylesheets/Yelp_favicon.ico">
  </head>
  <style>
  body {
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	font-size: 14px;
	line-height: 1.42857143;
	color: #RED;
	background-color: #fff
}
li{
color:white;
}
  
a {
color: white;
}
  h1   {color:red}

</style>
  <body>

        <div class="all-header">
  <img class="logo" src="../stylesheets/header_logo.png" >
  
     <ul class="header-nav pull-left1" id="header-nav">
                <li class="inline-block" id="home-link">
                    <a href="../View/underconstruction.jsp">
                        Home
                    </a>
                </li>
                
                <li class="inline-block" id="about-me">
                    <a href="../View/underconstruction.jsp">
                        About Me
                    </a>
                </li>
                
                <li class="inline-block" id="write-review">
                    <a href="../View/underconstruction.jsp">
                        Write a Review
                    </a>
                </li>
                <li class="inline-block" id="find-friends">
                    <a href="../View/underconstruction.jsp">
                        Find Friends
                    </a>
                </li>
                <li class="inline-block" id="messaging">
                    <a href="../View/underconstruction.jsp">
                        Messages
                    </a>
                </li>
                <li class="inline-block" id="talk">
                    <a href="../View/underconstruction.jsp">
                        Talk
                    </a>
                </li>
                <li class="inline-block" id="events">
                    <a href="../View/underconstruction.jsp">
                        Events
                    </a>
                </li>
        </ul>
  </div>
    <h1>Yelp San Jose</h1>

<div class="header-account webview-hidden">
                <ul class="logged-out-nav">
        <li>
            <a href="../View/signup.jsp" id="header-sign-up" class="ybtn ybtn-primaryLogin header-button sign-up">Sign Up</a>
             <a href="../View/signin.jsp" id="header-sign-up" class="ybtn ybtn-primaryLogin header-button sign-up">Sign In</a>
        </li>
    </ul>
</div>

  <div class="ysection" id="signup-pitch" align="left">
        <div class="content">
            <h2 class="embossed-text-white">Yelp is the best way to find great local businesses</h2>
            <p class="embossed-text-white">
                People use Yelp to search for everything from the city's tastiest burger to the most renowned cardiologist. What will you uncover in your neighborhood?
            </p>
            <a href="../View/signup.jsp" class="ybtn ybtn-primary ytype">Create Your Free Account</a>
        </div>
    </div>
    
    
<%--         <div class="message-position">	
	<ul>
	
        <c:forEach var="categoryNames" items="${categoryNames}" >
        <c:if test="${not fn:containsIgnoreCase(categoryNames, 'Ljava.lang.String')}">
        <li> <c:out value="${categoryNames}" /> </li>
        <br>
</c:if>
</c:forEach>
</ul>
	</div> --%>
	
<%-- 	<%
	try{

		// Call the method and assign the returned result to
		// the Company object. Proper error handling would be
		// appropriate, but this is only a demo

		CategoryName category = stub.homePage();

		//Display data

		String[] employeeNames = category.getCategoryName();
		
		
		for(int i=0; i< employeeNames.length; i++)
			if(employeeNames[i]!= null){%>
	 	 
	 <form id="myform1" action="restaurantReviews" method="post">
       <ul class="logged-out-nav">
        <li>
   
            <a class="ybtn ybtn-primary2 header-button sign-up" onclick="document.getElementById('myform1').submit();"><%= employeeNames[i] %></a>
        </li>
    </ul>
</form>


		<br> </br>
			
			<%}

	} catch(Exception e) {
            out.println("Error in get and display data: <br>" + e);
        }
	%> --%>
	
    
<%-- <form id="myForm" name="myForm" action="http://localhost:8080/SimpleMarketPlaceClient/View/home.jsp" method="POST">
<input type=hidden name="val1" id="val1" value="value1"/>
<input type=hidden name="val2" id="val2" value="value2"/>
<input type=hidden name="val3" id="val3" value="value3"/>
<input type=hidden name="submit" id="submit" value="Continue"/>
</form>
  
  
  <form id="myForm" name="HomePage" action="http://localhost:8080/SimpleMarketPlaceClient/View/home" method="POST">
  
  
         <c:forEach var="output" items="${pageScope.output}">
    <c:out value="${output}"/> 
</c:forEach>
</form> --%>

  

  </body>
</html>