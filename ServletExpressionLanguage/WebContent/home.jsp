<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>JSP EL Example Home</title>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page info="test page" session="true"%>
<%@page session="true"%> 
<%@ page import="java.util.List,java.util.ArrayList" %>

	<%
		List<String> names = new ArrayList<String>();
		names.add("Pankaj");
		names.add("David");
		pageContext.setAttribute("names", names);
		
		request.setAttribute("vals", new String[]{"1","2","3","4"});
		request.setAttribute("index", "2");
	%>
	<%=request.getClass() %>
	
	${'cat' gt 'cap'}
	
	
	
	
	<% int y = 0; %>
<% int z = 0; %>

<% for(int x=0;x<3;x++) { %>
<% z++;++y;%>
<% }%>

<% if(z<y) {%>
<%= z%>
<% } else {%>
<%= z - 1%>
<% }%> 

<b>simulacro : ${vals["2"]} </b>
<b>simulacro : ${vals[index]} </b>
<b>simulacro : ${vals[vals[index-1]]} </b>
	
	<strong>Mi session es :</strong> ${sessionScope.employee}
	<br>
	<br>
	<strong>Simple . EL Example:</strong> ${requestScope.person}
	<br>
	<br>
	<br>
	<br>
	<!-- <strong>requestScope attributes . EL Example:</strong> ${requestScope.names} -->
	<br>
	<br>
	<strong>Simple . EL Example without scope:</strong> ${person}
	<br>
	<br>
	<strong>Simple [] Example:</strong> ${applicationScope["User.Cookie"]}
	<br>
	<br>
	<strong>Multiples . EL Example:</strong>
	${sessionScope.employee.address.address}
	<br>
	<br>
	<strong>List EL Example:</strong> ${names[1]}
	<br>
	<br>
	<strong>Header information EL Example:</strong>
	${header["Accept-Encoding"]}
	<br>
	<br>
	<strong>Cookie EL Example:</strong> ${cookie["User.Cookie"].value}
	<br>
	<br>
	<strong>pageContext EL Example:</strong> HTTP Method is
	${pageContext.request.method}
	<br>
		<strong>reuqestURI EL Example:</strong> URI is
	${pageContext.request.requestURI}
	<br>
	<br>
	<strong>Context param EL Example:</strong> ${initParam.AppID}
	<br>
	<br>
	<strong>Arithmetic Operator EL Example:</strong> ${initParam.AppID +
	200}
	<br>
	<br>
	<strong>Relational Operator EL Example:</strong> ${initParam.AppID <
	200}
	<br>
	<br>
	<strong>Arithmetic Operator EL Example:</strong> ${initParam.AppID +
	200}
	<br>
	<br>

</body>
</html>