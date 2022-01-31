<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%-- <%@ page session="false" %> --%>
<html>
<head>
<title>login</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
</head>
<body>
	<form action="login.do" method="post">
		<div class="form-group has-feedback">
			<input type="text" name="id" class="form-control"
				placeholder="USER ID" /> <span
				class="glyphicon glyphicon-envelope form-control-feedback"></span>
		</div>
		<div class="form-group has-feedback">
			<input type="password" name="pwd" class="form-control"
				placeholder="Password" /> <span
				class="glyphicon glyphicon-lock form-control-feedback"></span>
		</div>
		<div class="row">
			<div class="col-xs-8">
				<div class="checkbox icheck">
					<label> <input type="checkbox" name="useCookie">
						Remember Me
					</label>
				</div>
			</div>
			<!-- /.col -->
			<div class="col-xs-4">
				<button type="submit" class="btn btn-primary btn-block btn-flat">Sign
					In</button>
			</div>
			<!-- /.col -->
		</div>
	</form>
</body>
</html>
