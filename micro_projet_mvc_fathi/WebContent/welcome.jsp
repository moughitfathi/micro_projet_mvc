<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ACCEUIL</title>
</head>
<body bgcolor="#E2EFF5" >
<a href="InternationalisationController?Language=en_US">ENGLISH</a>
<a href="InternationalisationController?Language=fr_FR">FRANCAIS</a><br>
<fmt:setLocale value="language" scope="session" />
<!--set internationalisation test with jstl -->
<fmt:setBundle var="testbundle" basename="resources.content"  scope="session" />
<!--<fmt:message key="key" bundle="${testbundle}" ></fmt:message>-->

<h1><%= request.getAttribute("string2") %> </h1><hr>
<table>
    <tr><td>
        <h3><%= request.getAttribute("string") %><a href="Identification.jsp"><%= request.getAttribute("string3") %></a></h3>
    </td></tr>
    <tr><td>
        <h3><%= request.getAttribute("string1") %><a href="Inscription.jsp"><%= request.getAttribute("string4") %></a></h3>
    </td></tr>
</table>
</body>
</html>