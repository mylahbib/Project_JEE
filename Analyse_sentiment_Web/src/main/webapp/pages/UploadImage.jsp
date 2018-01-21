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


<div>
<h2 class="H" >Votre publication est ajouter avec success </h2>
<img class= "upoadImage"src="<s:property value='"img/"+getUploadsFileName().toString()+".jpg"'/>"/>
</div>
</body>
</html>