<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="d"%>

<%@ taglib prefix="sjdt" uri="/struts-jquery-datatables-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
<jsp:include page="inc/header.jsp" flush="true" />
	<div id=dvtd>
		<d:table  name="posts" export="true">
			<d:column property="post.urlImg" title="Post" />
			<d:column property="description" title="Description" />
			<d:column property="rating" title="rating" />

		</d:table>
	</div>
 <jsp:include page="inc/footer.jsp" />