<pre><%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script> 
function validate()
{ 
var nom = document.form.nom.value;
var prenom = document.form.prenom.value;

var email = document.form.email.value;
var password = document.form.password.value;
var conpassword= document.form.conpassword.value;
if (nom==null || nom=="")
{ 
alert("Name can't be blank"); 
return false; 
}
else if (email==null || email=="")
{ 
alert("Email can't be blank"); 
return false; 
}
else if (prenom==null || prenom=="")
{ 
alert("Firstname can't be blank"); 
return false; 
}
else if(password.length<6)
{ 
alert("Password must be at least 6 characters long."); 
return false; 
} 
else if (password!=conpassword)
{ 
alert("Confirm Password should match with the Password"); 
return false; 
} 
} 
</script> 
<link rel="stylesheet" type="text/css" href="styles/style.css"/>

</head>
<body>
<center><h2>New Regestration </h2></center>
<form name="form" action="addUser" method="post" enctype="multipart/form-data" validate="true">

<table align="center">
<tr>
<td>Nom</td>
<td><input type="text" name="user.nom" /></td>
</tr>
<td>Prenom</td>
<td><input type="text" name="user.prenom" /></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="user.email" /></td>
</tr>
<tr>

<tr>
<td>Mot de passe</td>
<td><input type="password" name="user.password" /></td>
</tr>
<tr>
<td>Confirmer Mot de passe</td>
<td><input type="password" name="conpassword" /></td>
</tr>
<tr>
<td><%=(request.getAttribute("errMessage") == null) ? ""
: request.getAttribute("errMessage")%></td>
</tr>
<td></td>
<td><input type="submit" value="Register"></input><input
type="reset" value="Reset"></input></td>
</tr>
</table>
</form>
</body>
</html>