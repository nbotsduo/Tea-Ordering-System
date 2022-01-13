<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Meta Tags -->
<meta charset="utf-8" />
<!-- Site Title-->
<title>Order Description | Kedai Teh</title>
<!-- Mobile Specific Metas-->
<!-- Navigation css -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<!-- Google-fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Signika+Negative:300,400,600,700'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Kameron:400,700'
	rel='stylesheet' type='text/css'>
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<!-- <link rel="stylesheet" href="css/bootstrap.min.css"/> -->
<!-- Fonts-style -->
<link rel="stylesheet" href="css/styles.css" />
<!-- Fonts-style -->
<link rel="stylesheet" href="css/font-awesome.min.css" />
<!-- Modal-Effect -->
<link href="css/component.css" rel="stylesheet">
<!-- owl-carousel -->
<link href="css/owl.carousel.css" rel="stylesheet" type="text/css"
	media="screen">
<link href="css/owl.theme.css" rel="stylesheet" type="text/css"
	media="screen">
<!-- Template Styles-->
<link rel="stylesheet" href="css/navstyle.css" />
<!-- Template Color-->
<link rel="stylesheet" type="text/css" href="css/green.css"
	media="screen" id="color-opt" />
<style>
.title {
	position: absolute;
	left: 15%;
	/* top: 10%; */
	/* transform: translate(-25%,-10%); */
	font-size: 30px;
}

.form {
	position: absolute;
	left: 17%;
	right: 20%;
	top: 8%;
	/* transform: translate(-25%,-10%); */
	font-size: 18px;
}

hr.solid {
	border-top: 3px solid #bbb;
	/* position: absolute; */
	left: 10%;
	top: 800px;
}
</style>
</head>

<body>
	<nav class="navbar navbar-default navbar-fixed-top navbar-custom">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Kedai Teh</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="homeAdmin.jsp">Home</a></li>
            <li><a href="ViewOrderAdminController?action=viewOrderAdmin.jsp">Order Management</a></li>
            <li><a href="ViewMenuAdminController?action=viewProductAdmin.jsp">Product Management</a></li>
            <li><a href="AdminLogoutController">Log Out</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>
	<br>
	<br>
	<section>
		<div class="title">
			<p>Order Description</p>
			<hr class="solid">
		</div>
	</section>
	<section>
		<div class="form">
		
			<form>
				<div class="form-group row">
					<label for="Type of Tea" class="col-sm-2 col-form-label">Order ID</label>
					<div class="col-sm-5"><c:out value="${od.order_id}"/></div>
				</div>
				<div class="form-group row">
					<label for="Type of Tea" class="col-sm-2 col-form-label">User ID</label>
					<div class="col-sm-5"><c:out value="${od.user_id}"/></div>
				</div>
				<div class="form-group row">
					<label for="Type of Tea" class="col-sm-2 col-form-label">Type
						of Tea</label>
					<div class="col-sm-5"><c:out value="${od.order_name}"/></div>
				</div>
				<div class="form-group row ">
					<label for="pickUp" class="col-sm-2 col-form-label">Pick Up
						Time</label>
					<div class="col-sm-1"><c:out value="${od.pickup_time}"/></div>
				</div>
				<div class="form-group row ">
					<label for="addRequest" class="col-sm-2 col-form-label">Additional
						Request</label>
					<div class="col-sm-5"><c:out value="${od.request}"/></div>
				</div>
				<a href="ViewOrderAdminController?action=viewOrderAdmin.jsp" class="btn btn-primary">Back</a>
			</form>
		</div>
	</section>
	<script>
		
	</script>
</body>

</html>