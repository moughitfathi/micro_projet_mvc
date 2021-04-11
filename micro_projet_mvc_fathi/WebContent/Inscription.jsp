<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSCRIPTION</title>
</head>
<body bgcolor="#E2EFF5">
<h2>${failedmessage}</h2>
<h1>INSCRIVEZ  VOUS:</h1><hr>
    <form action="Identinscription" method="post">
    <table>
    <tr><td><label for="name"><b>Name</b></label></td></tr>
    <tr><td><input type="text" placeholder="Enter Name" name="name" ></td></tr>
    
    <tr><td><label for="surname"><b>Prenom</b></label></td></tr>
    <tr><td><input type="text" placeholder="Enter Surname" name="surname" ></td></tr>
    
    <tr><td><label for="Adress"><b>Adresse</b></label></td></tr>
    <tr><td><input type="text" placeholder="Adresse" name="adresse" ></td></tr>
    <tr><td><input type="text" placeholder="codepost" name="codepost" ></td></tr>
    <tr><td><input type="text" placeholder="country" name="country" ></td></tr>
    
    <tr><td><label for="email"><b>Email*</b></label></td></tr>
    <tr><td><input type="email" placeholder="Enter email" name="email" ></td></tr>
    
    <tr><td><label for="password"><b>Password*</b></label></td></tr>
    <tr><td><input type="password" placeholder="Entrer password" name="password" ><h6>*champ obligatoire ${failmessage}</h6></td></tr>
    <tr><td><input type="submit" value="S'inscrire" name="submit" ></td></tr>
    </table>
    
    </form>



</body>
</html>