<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<html>
<head>
	<title>Student Data</title>
</head>
<body>
	<h1>WELCOME TO STUDENT DATA PAGE</h1>
	<%--
	<h1>
		<%-- Data is : ${stdId}, ${stdName}, ${stdFee} --%>
		<%-- Data is: ${sob} </br> ${sob.stdId}, ${sob.stdName}, ${sob.stdFee} --%>
		Data is: ${list} 
	</h1>
	--%>
	Data is: ${list}
	<%--
	<table border="1">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>FEE</th>
		</tr>
		<c:forEach items="${list}" var="ob">
		<tr>
			<td>${ob.stdId}</td>
			<td>${ob.stdName}</td>
			<td>${ob.stdFee}</td>
		</tr>
		</c:forEach>
	</table>
	--%>
</body>
</html>