<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Custom Tag Example</title>
<%@ taglib prefix="mytags"  uri="http://lino.com/jsp/tlds/mytags"%>
</head>
<body>

	<h2>Number Formatting Example</h2>

	<mytags:formatNumber number="100050.574" format="#,###.00" />
	<br>
	<br>

	<mytags:formatNumber number="1234.567" format="$# ###.00" />
	<br>
	<br>

	<p>
		<strong>Thanks You!!</strong>
	</p>
</body>
</html>