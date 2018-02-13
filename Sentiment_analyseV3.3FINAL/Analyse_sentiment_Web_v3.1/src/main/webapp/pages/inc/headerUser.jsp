<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>


  
  <meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		

		<!-- Bootstrap CSS -->
  		  <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" 
  		  integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous"> 




	
   		  <link rel="stylesheet" type="text/css"media="screen,projection,print"
			href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css" />
   		 
   		 
   		 
   		 <link rel="stylesheet" type="text/css" media="screen,projection,print"
			href=<%out.print(request.getContextPath() + "/styles/fontawesom/css/font-awesome.min.css");%> />

   		 <!--Navbar.css-->		 
		 <link rel="stylesheet" type="text/css" media="screen,projection,print"
			href=<%out.print(request.getContextPath() + "/styles/navbar.css");%> />
		 
  
  
  
  
</head>
<body>
	<nav class="navbar navbar-toggleable-md navbar-light bg-faded " style="background-color: #eff0f2;   z-index: 999; position: fixed; width: 100%;">
  <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <a class="navbar-brand" href="#">
  		 <img src="../img/GoTravel.png" width="130" height="45" alt=""/>
  </a>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      

      <li class="nav-item active menu-icon-spacing manu-name">
        <center>
          <a href="#"> 
            <i class="fa fa-home fa-2x profile-name" aria-hidden="true"></i><br>
            <i class="manu-name">Home</i>
          </a>
        </center>
      </li>

      <li class="nav-item active menu-icon-spacing manu-name">
        <center>
          <a href="#"> 
            <i class="fa fa-plane fa-2x profile-name" aria-hidden="true"></i><br>
            <i class="manu-name">Flights</i>
          </a>
        </center>
      </li>


       <li class="nav-item active menu-icon-spacing manu-name">
        <center>
          <a href="#"> 
            <i class="fa fa-bed fa-2x profile-name" aria-hidden="true"></i><br>
            <i class="manu-name">Hotels</i>
          </a>
        </center>
      </li>

         <li class="nav-item active menu-icon-spacing manu-name">
        <center>
          <a href="getAllPosts"> 
            <i class="fa fa-map-marker fa-2x profile-name" aria-hidden="true"></i><br>
            <i class="manu-name">Places</i>
          </a>
        </center>
      </li>



     
    </ul>


    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search">
      <button class="btn btn-outline-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>

  </div>
</nav>

</body>
</html>