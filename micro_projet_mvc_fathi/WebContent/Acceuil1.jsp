<%@page import="models.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Acceuil1</title>
</head>
<body bgcolor="#E2EFF5">
<%Client client =(Client) session.getAttribute("client");%>
<% client.getEmail(); %>

<h1>BIENVENUE ${message}</h1><hr>


<h3><a href="Catalogue.jsp">Consulter le catalogue</a></h3>
<h3><a href="">Suivre vos commande</a></h3>
<h3><a href="">Visualiser votre panier</a></h3>

</body>
</html>