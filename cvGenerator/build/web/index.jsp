<%--
  Created by IntelliJ IDEA.
  User: Diwas
  Date: 5/13/2018
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Phantom Spider CV </title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="icon" href="icon.ico" >
    <link href="https://fonts.googleapis.com/css?family=Abel|Comfortaa|Merienda" rel="stylesheet">

      <!-- Latest compiled and minified CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

      <!-- jQuery library -->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

      <!-- Latest compiled JavaScript -->
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


  </head>
  <body>
  <div class="container">
      <a href="index.jsp"> <center>  <img id="logo" src="icon.ico"><h2 id="header"> Phantom Spider CV Generator </h2>  </center>
</a>
      <ul class="nav nav-tabs">
          <li id="home1" class="active"><a href="index.jsp" data-toggle="tab">Home</a> </li>
          <li id="pinfo"><a href="#Pinfo" data-toggle="tab">Personal Info</a> </li>
          <li ><a href="#skills" data-toggle="tab">Skills & Abillities</a> </li>
          <li><a href="#education" data-toggle="tab">Education</a> </li>
          <li><a href="#experience" data-toggle="tab">Experience</a> </li>
          <li><a href="#reference" data-toggle="tab">Refrences</a> </li>

      </ul>
      <div class="tab-content">

        <%@ include file="infoField/Personal Info.html" %>
          <%@ include file="infoField/Pinfo.html"%>
          <%@ include file="infoField/skills.html"%>
          <%@ include file="infoField/experience.html"%>
          <%@ include file="infoField/education.html"%>
          <%@include file="infoField/reference.html"%>

          




  </div>

  </div>

  </body>

  <script type="text/javascript" src="js/bootstrap.js" rel="script"></script>
  <script type="text/javascript" src="js/bootstrap.bundle.js" rel="script"></script>

  <script>
      $(document).ready(function(){
    
        
        $("div.container").fadeIn(3000);
        
        $('button#proceed').click(function(){
    $('li#pinfo').addClass('active');
    $('li#home1').removeClass('active');
});

   
      });
      
      
      </script>



</html>
