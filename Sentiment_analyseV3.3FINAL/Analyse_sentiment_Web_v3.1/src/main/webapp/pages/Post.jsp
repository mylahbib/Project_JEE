<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>
<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sj:head jquerytheme="redmond" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<jsp:include page="inc/header.jsp" flush="true" />
</head>
<body>



	
	<div class="container-fluid col-md-1 offset-md-1" style="top:80px">
	<a href="showPostForm" class="btn btn-primary ">Add Location </a>
	</div>
			
			
	<div class="container col-md-6 offsit-3" style="top:60px">
			
			
			
		<s:iterator value="listPost" var="post">
		        <div class="container-fluid" style="background-color:#f8f8f8">
		        	<div class="container-fluid head" style="height:50px;padding:20px 0px">
		        		<h4><Center><s:property value="#post.distination" /></Center></h4>
		        	</div>
		        	<hr>
		        	<div class="container-fluid" >
		        	<img src="<s:property value='"../img/"+#post.urlImg+".jpg"'/>" width="580"/>
		       		</div>
		       		<hr>
		       		<div class="container-fluid row" >
		       			<div class="col-md-6">
		       				Posted By : <b><s:property value="#post.user.nom" /></b><br>
		       				on : <s:property value="#post.created_date" />
		       			<br></div>
		       			
		       			<div class="col-md-6">
		       				<div  class="col-md-4">Rating:</div>
		       				
		       				<div class="progress offset-col-4">
		    						<div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="10" aria-valuemin="0" aria-valuemax="100" style="width:<s:property value= "%{(#post.rating + 1) / 2*100}"/>%">
		     							 <s:property value= "%{(#post.rating + 1) / 2*100}"/>%
		   							 </div><br>
		 				   	</div>
		       				

		
		
		
		       			</div>
					</div>
			<br></div>
				<br>
				<div class="container-fluid" style="background-color:#f8f8f8;padding:20px ">
					<div class="container-fluid row" >
						<h4>Comments</h4><hr>
					</div>
					<s:iterator value="comments" var="com"><br/>
				
					<div class="container-fluid row" >
						<div class="col-md-2">
							<i><s:property value="#com.user.nom"/> :</i>
						</div>
						<div class="col-md-10">
							<p><s:property value="#com.content"/></p>
						</div>
					</div>
				</s:iterator> 
				<hr>
					<s:form   action="addComment" method="post" class="row">
						<s:hidden name="idpost" value="%{#post.idPost}" />
						<div class="form-group col-md-11 offset-md-1">
				
							<textarea name="comment.content" class="form-control"  rows="2">
			                   </textarea>
						</div>
						<div class="form-group col-md-2 offset-md-8">
							<s:submit class="btn btn-success " value="Comment" />
						</div>
					</s:form>
					      
		        
					

					
			</div><br><br><br><br>
	  	
		</s:iterator>		
		
		
		<!--
			<s:iterator value="listPost" var="post">
			<s:property value="#post.description" /> <br/>
			<s:property value="#post.created_date" /><br/>
         	
         	<div>
         		commentaire:
         		<s:iterator value="comments" var="com"><br/>
					par <s:property value="#com.user.nom"/>: <s:property value="#com.content"/>
					<br/>
				</s:iterator> 
			</div>
				<br />
				
			<s:form   action="addComment" method="post">
				<s:hidden name="idpost" value="%{#post.idPost}" />
			
				<s:textarea name="comment.content"  ></s:textarea>
				
				<s:submit value="Save" />
			</s:form>
		
			<div>
 				<img src="<s:property value='"../img/"+#post.urlImg+".jpg"'/>" height=200px/>
 			</div>		
		</s:iterator>
		-->	
		
	</div>
	
</body>
</html>