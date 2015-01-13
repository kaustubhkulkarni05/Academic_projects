<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator Client</title>
</head>
<body>
<h1>CALCULATOR</h1>

<form id="add" action="calculator" method="post">
    <p>
        <input type="number" name="number1">
        <input type="number" name="number2">
       <br> 
     <br> <input type="submit" name="submit" id="add" value="ADD" formaction="calculator" />
     &nbsp <input type="submit" name="submit" id="Sub" value="SUBTRACT" formaction="calculator" />
     &nbsp <input type="submit" name="submit" id="multiply" value="MULTIPLY" formaction="calculator" />
     &nbsp <input type="submit" name="submit" id="divide" value="DIVIDE" formaction="calculator" /> 
        
    </p>
    <p>Result: <span id="result">${total}</span></p>
    
</form>


</body>
</html>