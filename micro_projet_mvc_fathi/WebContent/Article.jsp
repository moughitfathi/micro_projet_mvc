<%@page import="models.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Article</title>
</head>
<body bgcolor="#E2EFF5">
<h1 >Détail de l'article</h1><hr>
<%Client client =(Client) session.getAttribute("client");%>
<% client.getEmail(); %>

<img height="100px" width="200px" src="<c:url value="${article.photo}"/>"/>
<table>
      <tr bgcolor="#D0D4D3"><td><h3>Code Article:<input type="text" value="${article.codearticle}"/> 
                                    Designation:<input type="text" value="${article.designation}"/> </h3>
      </td></tr>
      <tr bgcolor="#D0D4D3"><td><h3>Prix:<input type="text" value="${article.prix}"/> 
                                    Stock:<input type="text" value="${article.stock}"/></h3>
      </td></tr>
      <tr bgcolor="#D0D4D3"><td><h3>categorie:</h3><input type="text" value="${article.categorie}"/>
      </td></tr>
</table>

<div><a href="Catalogue.jsp">Retour</a>
<a href="Catalogue.jsp">Ajouter au panier</a></div>

</body>
</html>