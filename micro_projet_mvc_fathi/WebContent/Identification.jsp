<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IDENTIFICATION</title>
</head>
<body bgcolor="#E2EFF5">
<h2>${succesmessage}</h2>
<h1>IDENTIFIEZ VOUS:</h1><hr>
    <form action="Identinscription" method="post">
    <table>
    <tr><td><label for="email"><b>Email</b></label></td></tr>
    <tr><td><input type="email" placeholder="Enter email" name="email" ></td></tr>
    <tr><td><label for="password"><b>Password</b></label></td></tr>
    <tr><td><input type="password" placeholder="Entrer password" name="password" ><h5>${failmessage}</h5></td></tr>
    <tr><td><input type="submit" value="identification" name="submit" ></td></tr>
    </table>
    </form>

</body>
</html>