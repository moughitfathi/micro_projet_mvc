<%@page import="models.Client"%>
<%@page import="connection.MyConnection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catalogue</title>
</head>
<body bgcolor="#E2EFF5">
<h1>CATALOGUE</h1><hr>
<% Client client = (Client)session.getAttribute("client"); %>
<% client.getEmail(); %>

<fmt:setLocale value="en_US"/>
           
<sql:setDataSource var="datasource" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/microprojetmvc" user="root"  password="1997"/>
<sql:query var="result" dataSource="${datasource}">
	SELECT Cat FROM Categorie 
</sql:query>
<h3>choisir une categorie:</h3>
<select name="ctg">
          <option value="">-- categories --</option>
		<c:forEach var="row" items="${result.rows}">		  	
          <option value="${row.Cat}">${row.Cat}</option>
        </c:forEach>
</select><br>
                 
<sql:query var="results" dataSource="${datasource}">
	SELECT * FROM Article  
</sql:query>  

          
<table border=1>
            <tr bgcolor="#33C4FF">
                <th>CodeArticle</th>
                <th>Designation</th>
                <th>Prix</th>
                <th>Stock</th>
                <th>photo</th>
                <th>Ajouter</th>
            </tr>
      <c:forEach var="row" items="${results.rows}">
	        <tr  bgcolor="#D0D4D3">
	             <td><a href="ArticleController?code=${row.CodeArticle}"><c:out value="${row.CodeArticle}" /></a></td>
	             <td><c:out value="${row.Designation}" /></td>
	             
	             <fmt:formatNumber var="formatNumberCurrecy" type="currency" value="${row.Prix}"></fmt:formatNumber>
	                 
	             <td><c:out value="${formatNumberCurrecy}"/></td>
                 
                 <td><c:out value="${row.Stock}" /></td>
                 <td><img  height="100px" width="200px" src="<c:url value="${row.photo}"/>" alt=""/></td>
                 <td><a  href="PanierController?code=${row.CodeArticle}">Ajouter au panier</a></td>
	        </tr>
      </c:forEach>
</table>
</body>
</html>