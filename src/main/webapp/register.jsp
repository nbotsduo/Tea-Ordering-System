<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
	<title>Kedai Teh | New Customer Page</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

	<link rel="stylesheet" href="css/login/style.css">

</head>

<body>
	<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section">Customer Registration Page</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-md-12 col-lg-10">
					<div class="wrap d-md-flex">
						<div class="text-wrap p-4 p-lg-5 text-center d-flex align-items-center order-md-last">
							<div class="text w-100">
								<h2>Welcome to Kedai Teh</h2>
								<p>Don't have an account?</p>
								<p>Open now to enjoy the benefit for becoming fellow tehrians</p>
								<!-- <a href="#" class="btn btn-white btn-outline-white">Sign Up</a> -->
							</div>
						</div>
						<div class="login-wrap p-4 p-lg-5">
							<div class="d-flex">
								<div class="w-100">
									<h3 class="mb-4">Register</h3>
								</div>
								<div class="w-100">
									<p class="social-media d-flex justify-content-end">
										<a href="#"
											class="social-icon d-flex align-items-center justify-content-center"><span
												class="fa fa-facebook"></span></a>
										<a href="#"
											class="social-icon d-flex align-items-center justify-content-center"><span
												class="fa fa-twitter"></span></a>
									</p>
								</div>
							</div>
							<form action="CreateUserController" method="POST" class="signin-form">
								<div class="form-group mb-3">
									<label class="label" for="name">Name</label>
									<input type="text" name="name" class="form-control" placeholder="Name" required>
								</div>
								<div class="form-group mb-3">
									<label class="label" for="name">Username</label>
									<input type="text" class="form-control" placeholder="Username" required name="username">
								</div>
								<div class="form-group mb-3">
									<label class="label" for="email">E-Mail</label>
									<input type="email" class="form-control" placeholder="E-Mail" name="email" required>
								</div>
								<div class="form-group mb-3">
									<label class="label" for="password">Password</label>
									<input type="password" class="form-control" placeholder="Password" name="password" required>
								</div>
								<div class="form-group mb-3">
									<label class="label" for="birthdate">Birth Date</label>
									<input type="date" class="form-control"  name="birthdate" required>
								</div>
								<div class="form-group">
									<button type="submit"
										class="form-control btn btn-primary submit px-3">Register</button>
								</div>
								
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<script src="js/login/jquery.min.js"></script>
	<script src="js/login/popper.js"></script>
	<script src="js/login/bootstrap.min.js"></script>
	<script src="js/login/main.js"></script>

</body>

</html>