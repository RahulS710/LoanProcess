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
<div class="col" style="width: 100px;height: 25px;background-color: blue;float: right;text-align: center;margin-right: 50px ">
	<a href="/login.jsp" style="color: white;text-align: center;">Login</a>
</div>
<form action="/user" method="post">
	<section>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-12 col-md-8 col-lg-8 col-xl-6">
					<div class="row">
						<div class="col text-center">
							<h1>Register</h1>
							<p class="text-h3"></p>
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control" placeholder="First Name" name="fname">
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control" placeholder="Last Name" name="lname">
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control" placeholder="User Name" name="username">
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control" placeholder="Address" name="address">
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control" placeholder="Contact No" name="contactno">
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control"
								placeholder="Enquiry Description">
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control" placeholder="Pan No" name="panno">
						</div>
					</div>
					<div class="row align-items-center">
						<div class="col mt-4">
							<input type="text" class="form-control" placeholder="Aadhar No" name="aadharno">
						</div>
					</div>


					<div class="row align-items-center mt-4">
						<div class="col">
							<input type="email" class="form-control" placeholder="Email" name="email">
						</div>
					</div>
<!-- 					<div class="row align-items-center mt-4">
						<div class="col">
							<input type="password" class="form-control"
								placeholder="Password">
						</div>
						<div class="col">
							<input type="password" class="form-control"
								placeholder="Confirm Password">
						</div>
					</div> -->
					<div class="row justify-content-start mt-4">
						<div class="col">
							<button class="btn btn-primary mt-4" onclick="Sumbit()">Submit</button>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</section>

</form>
<h1><a href="/jsp/LoanDetail.jsp">LoAN</a></h1>

<script type="text/javascript">

function Sumbit()
{
	alert("submited successfully");
}
</script>


</body>

</html>