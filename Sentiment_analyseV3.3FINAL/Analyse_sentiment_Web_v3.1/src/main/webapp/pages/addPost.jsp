<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>GoTrave| Add new Place</title>
<sj:head jquerytheme="redmond" />
<link rel="stylesheet" type="text/css" href="styles/style.css"/>

</head>
<body style="background-image: url(../img/addPost.jpeg); backround-image-width:400px">

<jsp:include page="inc/header.jsp" flush="true"  />
<!--  
<div align="center">
		<h1>Ajouter Post</h1>
		<s:form action="addPost" method="post" enctype="multipart/form-data" >

			<div class="type-text">
				<s:textfield label="Distination" name="post.distination"/>
				<s:textfield label="Description" name="post.description" />
				<s:file type = "file" name = "upload" label="Upload"/>
			</div>
			
			<sj:submit value="Save" />

		</s:form>

</div>-->


		<div id="content " class="col-md-6 offset-md-3"  >
                <nav class="navbar navbar-default" style="top: 145px ; background-color:#f2f2f2; height:60px"  >
                    <div class="container-fluid row " style="height:50px">                   
                       
                        <h3 class="col-md-9"><center>Add New Place</center></h3>
                         
                         <form>
							<input type="button" value="All Places" class="btn btn-primary col-md-12 offset-col-1" onclick="window.location.href='getAllPosts'" />
						</form>
                       
                    </div>
                </nav>



                <nav class="navbar navbar-default" style="top: 145px; background-color:#f7f9f9">
                    <div class="container-fluid row" style="padding: 15px 45px">                   
						<s:form class="row" action="addPost" method="post" enctype="multipart/form-data" >
                        
                          <div class="form-group col-md-12">
                            <label for="PortName">Place Name</label>
                            <input type="text" name="post.distination" class="form-control" id="PortName" placeholder="Place name or location">
                            
                          </div>
              
                          <div class="form-group col-md-12">
                            <label for="exampleTextarea">Discription  </label>
                            <textarea name="post.description" class="form-control" id="exampleTextarea" placeholder="What's so special about it ?" rows="5"></textarea>
                          </div>

                          <div class="form-group col-md-12">
                            <label for="exampleInputFile">Import image</label>
                            <input type="file" name = "upload" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
                            
                          </div>

   
                          <button type="submit" class="btn btn-primary offset-md-5">Submit</button>
                        </s:form>                       
                    </div>
                </nav>




            </div>
        
		
	








	 
 <jsp:include page="inc/footer.jsp" />