<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%-- <%@ page session="false" %> --%>
<html>
<head>
<title>header</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
</head>
<body>
	<!-- sing in add -->
	<c:if test="${loginUser == null}">
		<li>
			<a href="/loginForm.do">
				<i class="fa fa-sign-in" aria-hidden="true"></i>
			</a>
		</li>
	</c:if>
</body>
</html>
