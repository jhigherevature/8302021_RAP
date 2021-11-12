<jsp:include page="header.jsp" />

<title>Employees</title>
</head>
<body>

<!-- THIS TAG LIBRARY IS REQUIRED TO USE JSTL (JSP Standard Tag Library)
	It is also known as Jakarta Standard Tag Library, or Java Standard 
	Tag Library depending on the tags used.
	
	JSTL will allow us to include java-like programming functionality on our
	webpage 
	-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

</head>

<body>
	<a href="http://localhost:8080/check">
	<button>Back To Main Page</button>
	</a>
	<h2>All Employees:</h2>

	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>TITLE</th>
			<th>SALARY</th>
		</tr>
		<c:forEach var="emp" items="${list}">
			<tr>
			<!-- Although it may seem like we are trying to access the
				fields directly here, we are actually relying on conventions.
				When you say object.field, the JSP will look at the object
				as a Java Bean, and attempt to retrieve the information
				using normal conventions. i.e. it will invoke the getter
				method for the field. 
				
				In the examples below emp.emp_id invokes the getEmp_id() 
				method on the underlying employee object. Note that it does
				not look at the actual field, rather it only looks for a 
				matching getter method.	
				
				This is an instance where following naming conventions is 
				important!
			 -->
				<td><c:out value="${emp.emp_id}"></c:out></td>
				<td><c:out value="${emp.emp_name}"></c:out></td>
				<td><c:out value="${emp.emp_title}"></c:out></td>
				<td><c:out value="${emp.emp_salary}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>