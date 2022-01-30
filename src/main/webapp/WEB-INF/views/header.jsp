<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%-- <%@ page session="false" %> --%>
<html>
<head>
<title>header</title>
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
	<a href="/user/logout.do" class="btn btn-default btn-flat">Sign out</a>
</body>
</html>
