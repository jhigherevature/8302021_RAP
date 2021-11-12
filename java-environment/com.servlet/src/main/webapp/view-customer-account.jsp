<jsp:include page="header.jsp" />

<title>Customer Account</title>
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
	<h2>Customer Info:</h2>

	<table>
		<tr>
			<th>NAME</th>
			<!--
				Although the example below looks to be accessing the private
				field of the Customer class directly (see the com.revature.banking.models.Customer class)
				it is actually calling the customer.getCust_name() method using conventions.
				
				The convention specifically is to call a method called 'getVar_Name' using the
				exact capitalization that is provided (it will capitalize the first letter of
				the field).
			 -->
			<td>${customer.cust_name}</td>
		</tr>
	</table>
	
	<h2>Accounts:</h2>
	<table>
		<tr>
			<th>Account Number</th>
			<th>Account Type</th>
			<th>Account Balance</th>
		</tr>
		<c:forEach var="acc" items="${accounts}">
			<tr>
				<td><c:out value="${acc.account_id}"></c:out></td>
				<td><c:out value="${acc.account_type}"></c:out></td>
				<td><c:out value="${acc.account_value}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>