<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<script
	src="https://bootstrapcreative.com/wp-bc/wp-content/themes/wp-bootstrap/codepen/bootstrapcreative.js?v=5"></script>

<link rel='stylesheet prefetch'
	href='https://cdn.rawgit.com/JacobLett/bootstrap4-latest/master/bootstrap-4-latest.min.css'>

<script type="text/javascript">
	
</script>

</head>

<body>
	<div class="col"style="width: 100%; height: 155px; background-color: blue; float: right; text-align: center; background-color: gray;">
		<h1 style="float: left">Welcome&nbsp;${msg.firstName}</h1>
		
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
								<input type="text" class="form-control" placeholder=${msg.userId} name="fname" readonly="readonly" hidden="true">
							</div>
						</div>
						<div class="row align-items-center">
							<div class="col mt-4">
								<select id="loantype" name="LoanType">
									<option value="">Select Loan Type</option>
									<option value="homeloan">Home Loan</option>
									<option value="carloan">Car Loan</option>
									<option value="bykeloan">Byke Loan</option>
									<option value="personalloan">Personal Loan</option>
									<option value="bussinessloan">Bussiness Loan</option>
								</select>
							</div>
						</div>
						<div class="row align-items-center">
							<div class="col mt-4">
								<select id="bank" name="bank" onchange="bankfunction()">
									<option value="">Select Bank Type</option>
									<option value="sbi">SBI</option>
									<option value="hdfc">HDFC</option>
									<option value="icici">ICICI</option>
									<option value="bajaj">BAJAJ FINANCE</option>
									<option value="kotak">KOTAK MAHINDRA</option>
								</select>
							</div>
						</div>
						<div class="row align-items-center">
							<div class="col mt-4">
								<select id="numberofemis" name="EMI">
									<option value="">Select EMI Number</option>
									<option value="12">1 year</option>
									<option value="24">2 Year</option>
									<option value="36">3 Year</option>

								</select>
							</div>
						</div>

						<div class="row align-items-center">
							<div class="col mt-4">
								<input type="text" class="form-control"
									placeholder="Loan Amount" readonly="readonly">
							</div>
						</div>
						<div class="row align-items-center">
							<div class="col mt-4">
								<input type="text" class="form-control"
									placeholder="Interest Rate" readonly="readonly" id="interest">
							</div>
						</div>


						<div class="row align-items-center">
							<div class="col mt-4">
								<input type="text" class="form-control" placeholder="EMI"
									readonly="readonly">
							</div>
						</div>


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
		<script type="text/javascript">
		function Sumbit() {
			alert("submited successfully");
		}

		function bankfunction() {

			alert("in functioon");
			//var bank = document.getElementById("bank").selectedIndex.value;
			var e = document.getElementById("bank");
			var bank = e.options[e.selectedIndex].value;
			alert(bank);

			if (bank === "hdfc") {

				document.getElementById("interest").value = 12;
			} else if (bank === "icici") {

				document.getElementById("interest").value = 13.5;
			} else if (bank === "bajaj") {

				document.getElementById("interest").value = 15;
			}

			else if (bank === "kotak") {

				document.getElementById("interest").value = 16;
			} else {

				document.getElementById("interest").value = 16;
			}

		}
	</script>



</body>





</html>