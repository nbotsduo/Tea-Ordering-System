<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Meta Tags -->
<meta charset="utf-8" />
<!-- Site Title-->
<title>View Product | Kedai Teh</title>
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

.content {
	position: absolute;
	left: 10%;
	right: 10%;
	top: -2%;
	/* transform: translate(-25%,-10%); */
	font-size: 15px;
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
			<p>Product Management</p>
			<hr class="solid">
		</div>
	</section>
	<section>
		<div class="content">
			<table class="table table-hover">
				<thead>
					<tr>
						<th scope="col">Menu ID</th>
						<th scope="col">Menu Name</th>
						<th scope="col">Menu Description</th>
						<th scope="col">Price (RM)</th>
						<th scope="col">
							<center>Action</center>
						</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th></th>
						<td></td>
						<td></td>
						<td></td>
						<td>
							<center>
								<button type="button" class="btn btn-primary" onclick="location.href='createProductAdmin.html'">Add New
									Product</button>
							</center>
						</td>
					</tr>
					<c:forEach items="${menuList}" var="menu">
					<tr>
					<th><c:out value="${menu.menu_id}"/></th>
						<th><c:out value="${menu.name}"/></th>
						<td><c:out value="${menu.desc}"/></td>
						<td><c:out value="${menu.price}"/></td>
						<td>
							<center>
								<a href="UpdateMenuAdminController?action=updater&menu_id=<c:out value="${menu.menu_id}"/>" class="btn btn-warning">Update Product</a>
								<a href="DeleteMenuAdminController?action=delete&menu_id=<c:out value="${menu.menu_id}"/>" class="btn btn-danger">Delete Product</a>
							</center>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</section>
	<script>
		function delOrder() {
			if (confirm('Are you sure you want to delete this product?')) {
				location.href ="DeleteMenuAdminController?action=delete&menu_id=<c:out value="${menu.menu_id}"/>";
				} 
		}
	</script>
</body>

</html>