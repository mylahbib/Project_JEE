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
<title>Catalogue touristique</title>
<sj:head jquerytheme="redmond" />
<link rel="stylesheet" type="text/css" href="styles/style.css"/>

</head>
<body>

<jsp:include page="inc/header.jsp" flush="true" />

<div align="center">
		<h1>Ajouter Post</h1>
		<s:form action="addPost" method="post" enctype="multipart/form-data" >

			<div class="type-text">
				<s:textfield label="Description" name="post.description" />
				<s:file type = "file" name = "upload" label="Upload"/>
			</div>
			
			<sj:submit value="Save" />

		</s:form>

</div>

	 
 <jsp:include page="inc/footer.jsp" />