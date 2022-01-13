<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page session="true"%>

<!DOCTYPE html>
<!--
	Delex by TEMPLATE STOCK
	templatestock.co @templatestock
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->

<html lang="en">
<head>
<!-- Meta Tags -->
<meta charset="utf-8" />

<!-- Site Title-->
<title>Kedai Teh</title>

<!-- Mobile Specific Metas-->
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />

<!-- Google-fonts -->
<link
	href='http://fonts.googleapis.com/css?family=Signika+Negative:300,400,600,700'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Kameron:400,700'
	rel='stylesheet' type='text/css'>

<!-- Bootstrap -->
<link rel="stylesheet" href="css/bootstrap.min.css" />
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
<link rel="stylesheet" href="css/style.css" />
<!-- Template Color-->
<link rel="stylesheet" type="text/css" href="css/green.css"
	media="screen" id="color-opt" />



</head>

<body data-spy="scroll" data-offset="80">

	<!-- Preloader -->
	<div class="animationload">
		<div class="loader">Please Wait....</div>
	</div>
	<!-- End Preloader -->


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
					<li><a href="homeUser.jsp">Home</a></li>
					<li><a href="CreateOrderUser1?action=createOrderUser.jsp">Order Now</a></li>
					<li><a href="ViewOrderUserController?action=viewOrderUser.jsp&user_id=<%=session.getAttribute("user_id")%>">Order History</a></li>
					<li><a href="ViewMenuUserController?action=viewProductUser.jsp">Menu</a></li>
					<li><a href="ViewProfileUserController?action=viewProfileUser.jsp&user_id=<%=session.getAttribute("user_id")%>">Profile</a></li>
					<li><a href="UserLogoutController">Log Out</a></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<!-- /HOME -->
	<section class="main-home" id="home">
		<div class="home-page-photo"></div>
		<!-- Background image -->
		<div class="home__header-content">
			<div id="main-home-carousel" class="owl-carousel">
				<div>
					<h1 class="intro-title">Paradise for Tea-Lover!</h1>
					<p class="intro-text">
						For those who want any type of tea <br /> We got your back for
						varieties of tea's!
					</p>
					<a class="btn btn-custom" href="CreateOrderUser1?action=createOrderUser.jsp">Get sipping!</a>
				</div>
				<!--slide item like paragraph-->

				<!-- <div>
            <h1 class="intro-title">Best ideas for your Business</h1>
            <p class="intro-text">Lorem ipsum dolor sit amet consectetur adictum piscing elit fusce sit amet inerdum neque ultra icies <br/>  pelentesque tempor justo a scelerisque placerat sit amet magna e.</p>
            <a class="btn btn-custom" href="#">Get started</a>
          </div>  -->
				<!--slide item like paragraph-->

				<!-- <div>
            <h1 class="intro-title">We are digital expert</h1>
            <p class="intro-text">Lorem ipsum dolor sit amet consectetur adictum piscing elit fusce sit amet inerdum neque ultra icies <br/>  pelentesque tempor justo a scelerisque placerat sit amet magna e.</p>
            <a class="btn btn-custom" href="#">Get started</a>
          </div>slide item like paragraph -->
			</div>
		</div>
	</section>
	<!-- /End HOME -->
	<!-- FOOTER begings -->
	<footer id="footer">
		<div class="footer-widgets-wrap">
			<div class="container text-center">
				<div class="row">
					<div class="col-sm-4 col-md-4">
						<div class="footer-content">
							<h4>KEEP IN TOUCH</h4>
							<div class="footer-socials">
								<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
									class="fa fa-google-plus"></i></a> <a href="#"><i
									class="fa fa-twitter"></i></a> <a href="#"><i
									class="fa fa-pinterest"></i></a>
							</div>
						</div>
						<!-- end footer-content -->
					</div>
					<!-- end col-sm-4 -->
					<div class="col-sm-4 col-md-4">
						<div class="footer-content">
							<p><%=session.getAttribute("user_id")%></p>
							<h4>ADDRESS</h4>
							<p>
								Jalan Mahameru<br> 5300, Kuala Lumpur
							</p>
							<p>
								+012-345678<br> <a href="#">kedaiteh.com</a><br>
						</div>
						<!-- end footer-content -->
					</div>
					<!-- end col-sm-4 -->
					<div class="col-sm-4 col-md-4">
						<div class="footer-content">
							<h4>SUPPORT</h4>
							<p>You need support? Visit our support forum and open tickets
								for you questions.</p>
							<p>
								<button type="button" class="btn btn-custom-sm">forum</button>
							</p>
						</div>
						<!-- end footer-content -->
					</div>
					<!-- end col-sm-4 -->
				</div>
				<!-- end row -->
			</div>
			<!-- container -->
		</div>
		<div class="footer-bottom text-center">
			<!-- Footer-copyright -->
			<p>�2021 Kedai Teh</p>
		</div>
	</footer>
	<!-- End footer begings -->


	<!-- Scroll top -->
	<a href="#" class="back-to-top"> <i class="fa fa-chevron-up"> </i>
	</a>


	<!-- Style switcher -->
	<div id="style-switcher" style="left: 0px;">
		<div>
			<h3>Select your color</h3>
			<ul class="pattern">
				<li><a class="color1" href="#"></a></li>
				<li><a class="color2" href="#"></a></li>
				<li><a class="color3" href="#"></a></li>
				<li><a class="color4" href="#"></a></li>
				<li><a class="color5" href="#"></a></li>
				<li><a class="color6" href="#"></a></li>
				<li><a class="color7" href="#"></a></li>
				<li><a class="color8" href="#"></a></li>
				<li><a class="color9" href="#"></a></li>
				<li><a class="color10" href="#"></a></li>
				<li><a class="color11" href="#"></a></li>
				<li><a class="color12" href="#"></a></li>
			</ul>
		</div>
		<div class="bottom">
			<a href="#" class="settings"><i class="fa fa-refresh fa-spin"></i></a>
		</div>
	</div>
	<!-- end Style switcher -->


	<!-- JavaScript
     ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<!-- initialize jQuery Library -->
	<script src="js/jquery.min.js"></script>
	<!-- jquery easing -->
	<script src="js/jquery.easing.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- modal-effect -->
	<script src="js/classie.js"></script>
	<script src="js/modalEffects.js"></script>
	<!-- Counter-up -->
	<script src="js/waypoints.min.js" type="text/javascript"></script>
	<script src="js/jquery.counterup.min.js" type="text/javascript"></script>
	<!-- SmoothScroll -->
	<script src="js/SmoothScroll.js"></script>
	<!-- Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Jquery-Nav -->
	<script src="js/jquery.nav.js"></script>
	<!-- Owl carousel -->
	<script type="text/javascript" src="js/owl.carousel.min.js"></script>
	<!-- App JS -->
	<script src="js/app.js"></script>

	<!-- Switcher script for demo only -->
	<script type="text/javascript" src="js/switcher.js"></script>


</body>
</html>
