<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Devinder's Code</title>
<link rel="stylesheet" href="style.css" type="text/css" media="all">
<style type="text/css">
<%@include file="../css/style.css" %>

ul li{color:green;}



</style>

</head>

<body>
<h1>Maven + Spring MVC Web Project Example</h1>
 <ul>
  <li>
  Message : ${message}
 
  </li>
<li>Saggu : ${name}</li>
</ul>
<h1>The url ----> <%=request.getContextPath( )%></h1>
<div id="good"></div>
<button type="button" onClick="show()">Click Me!</button>


<form id="myForm" action="upload.php" method="post" enctype="multipart/form-data">
     <input type="file" size="60" name="myfile">
     <input type="submit" value="Ajax File Upload">
 </form>
 
 <div id="progress">
        <div id="bar"></div>
        <div id="percent">0%</div >
</div>
<br/>
 
<div id="message"></div>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.1/jquery.min.js"></script>
<script src="http://malsup.github.com/jquery.form.js"></script>
<script type="text/javascript">


(function(){
$("#good").html("This is Hello World by JQuery");
$('ul li').addClass('emphasis');	



    var options = { 
    beforeSend: function() 
    {
        $("#progress").show();
        //clear everything
        $("#bar").width('0%');
        $("#message").html("");
        $("#percent").html("0%");
    },
    uploadProgress: function(event, position, total, percentComplete) 
    {
        $("#bar").width(percentComplete+'%');
        $("#percent").html(percentComplete+'%');
 
    },
    success: function() 
    {
        $("#bar").width('100%');
        $("#percent").html('100%');
 
    },
    complete: function(response) 
    {
        $("#message").html("<font color='green'>"+response.responseText+"</font>");
    },
    error: function()
    {
        $("#message").html("<font color='red'> ERROR: unable to upload files</font>");
 
    }
 
}; 
 
     $("#myForm").ajaxForm(options);
 
 


})();

function show()
{ 
	var helloToSend = {
			a:"saggu",
			b:"heyboy",
			c:"dullboy"}; 
	/* var hello={
			a:"goodbye",
			b:"heyboy",
			c:"dullboy"};
	
	;
	 *///var hello={d:JSON.stringify(helloToSend)};
	
	//var arrString=JSON.stringify(arr);
	//var hello=arrString;
	
	$.ajax({
    url: "http://localhost:8080<%=request.getContextPath( )%>/ajax",
    type: "GET",
    data:{hello:JSON.stringify(helloToSend)},  
    dataType:"text",  //gives what type of data want from the server
    success: function (html) {
    	alert("html = "+html);
    },
    error: function (error) {
       alert('error == ' + eval(error)+"   " + "hello");
    }
	});
}

</script>
</body>
</html>