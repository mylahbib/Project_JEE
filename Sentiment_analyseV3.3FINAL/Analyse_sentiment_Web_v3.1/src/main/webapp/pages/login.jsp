<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
	<meta charset="utf-8">
	<title>GoTravel,You Guide to Discover The World</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- Animate.css -->
	
   	<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href=<%out.print(request.getContextPath() + "/styles/index/animate.css");%> />
	

	<!-- Bootstrap  
	<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href=<%out.print(request.getContextPath() + "/styles/isndex/bootstrap.css");%> /> -->
	

	<!-- Theme style  -->
	<link rel="stylesheet" type="text/css" media="screen,projection,print"
	href=<%out.print(request.getContextPath() + "/styles/index/style.css");%> />
	
	
	<!-- Modernizr JS -->
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/index/modernizr-2.6.2.min.js"></script>
	
	
	</head>
	
	<jsp:include page="inc/headerUser.jsp" flush="true" />
	
	
	<body>
		
	<div class="gtco-loader"></div>
	
	<div id="page">

	
	<!-- <div class="page-inner"> -->
	<nav class="gtco-nav" role="navigation">
		<div class="gtco-container">
			
		
			
		</div>
	</nav>
	
	<header id="gtco-header" class="gtco-cover gtco-cover-md" role="banner" style="background-image: url(../img/loginBackGround.jpeg)">
		<div class="overlay"></div>
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-left">
					<div class="row row-mt-15em">
						<div class="col-md-7 mt-text animate-box" data-animate-effect="fadeInUp">
							<h1>Planing Trip To Anywhere in The World?</h1>	
						</div>
						<div class="col-md-4 col-md-push-1 animate-box" data-animate-effect="fadeInRight">
							<div class="form-wrap">
								<div class="tab">
									
									<div class="tab-content">
										<div class="tab-content-inner active" data-content="signup">
											<h3>Sign up !</h3>
											<s:form action="loginAction" methode="post">
												<div class="row form-group">
													<div class="col-md-12">
														<label for="fullname">Email Adress</label>
														<input type="text" name="user.email" id="fullname" class="form-control">
													</div>
												</div>
												
												<div class="row form-group">
													<div class="col-md-12">
														<label for="fullname">Password</label>
														<input type="password" name="user.password" id="fullname" class="form-control">
													</div>
												</div>											

												<p style="color: red;"><s:property value="msg"></s:property></p>
												

												<div class="row form-group">
													<div class="col-md-12">
														<input type="submit" class="btn btn-primary btn-block" value="Log in">
													
														
													</div>
												</div>
											</s:form>	<center><p>Not a member ? <a href="showUserForm">Create an account !</a></p></center>
										</div>

										
									</div>
								</div>
							</div>
						</div>
					</div>
							
					
				</div>
			</div>
		</div>
	</header>
	
	
	

	</div>

	
	
	<!-- jQuery -->
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/index/jquery.min.js"></script>
	<!-- jQuery Easing -->
	
	<!-- Bootstrap -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/index/bootstrap.min.js"></script>

	<!-- Waypoints -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/index/jquery.waypoints.min.js"></script>
	
	<!-- Carousel -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/index/owl.carousel.min.js"></script>


	<!-- Main -->
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/index/main.js"></script>
	

	</body>
</html>

