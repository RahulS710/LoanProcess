<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>Users Registration Form</title>
<script
	src="https://bootstrapcreative.com/wp-bc/wp-content/themes/wp-bootstrap/codepen/bootstrapcreative.js?v=5"></script>

<link rel='stylesheet prefetch'
	href='https://cdn.rawgit.com/JacobLett/bootstrap4-latest/master/bootstrap-4-latest.min.css'>

<script type="text/javascript">


</script>

</head>

<body>
<div class="col" style="width: 200px;height: 25px;background-color: blue;float: right;text-align: center;margin-right: 50px ">
	<a href="/view/Home.jsp" style="color: white;text-align: center;">Register If Not Registered</a>
</div>
	<form action="/login" method="post">
		<section>
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-12 col-md-8 col-lg-8 col-xl-6">
						<div class="row">
							<div class="col text-center">
								<h1>Login</h1>
								<p class="text-h3"></p>
							</div>
						</div>

						<div class="row align-items-center">
						<div class="col mt-4">
								<label>UserName</label>
							</div>
							<div class="col mt-4">
								<input type="text" class="form-control" placeholder="User Name" name="un" required="required">
							</div>
						</div>

						<div class="row align-items-center mt-4">
						<div class="col mt-4">
								<label>Password</label>
							</div>
							<div class="col">
								<input type="password" class="form-control"
									placeholder="Password" name="pass" required="required">
							</div>

						</div>
						<div class="row justify-content-start mt-4">

							<div class="col">


								<button class="btn btn-primary mt-4">Submit</button>

							</div>
							
						</div>
					</div>
				</div>
			</div>
		</section>

	</form>
	


</body>

</html>