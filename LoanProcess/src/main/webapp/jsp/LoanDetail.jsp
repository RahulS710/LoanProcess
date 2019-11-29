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
<style>

</style>


</head>

<body>
	<ul>
		<li><a class="active" href="">${msg.firstName}</a></li>
		<li><a href="/jsp/LoanDetail.jsp">Loan Application</a></li>
		<li><a href="">Load Details</a></li>
		<li><a href="#about">EMI</a></li>
	</ul>

	<form action="/loanapplication" method="post">
		<section>
			<div class="container">
				<div class="row justify-content-center">
					<div class="col-12 col-md-8 col-lg-8 col-xl-6">
						<div class="row">
							<div class="col text-center">
								<h1>Loan Application</h1>
								<p class="text-h3"></p>
							</div>
						</div>
						<div class="row align-items-center">
							<div class="col mt-4">
								<input type="text" class="form-control"   name="uid" readonly="readonly" value="${msg.userId}" >
							</div>
						</div>
						<div class="row align-items-center">
							<div class="col mt-4">
								<select id="loantype" name="LoanType" onchange="loanselect()">
									<option value="">Select Loan Type</option>
									<option value="homeloan">Home Loan</option>
									<option value="carloan">Car Loan</option>
									<option value="bykeloan">Byke Loan</option>
									<option value="personalloan">Personal Loan</option>
									<option value="bussinessloan">Bussiness Loan</option>
								</select>
							</div>
						</div>
						<script type="text/javascript">
										function  loanselect() 
										{
											var e = document.getElementById("loantype");
											var ltype = e.options[e.selectedIndex].value;
											alert(ltype);
											if(ltype=="carloan")
											{
												document.getElementById("4wc").style.display = "block"; 
												alert("carrrrrr");
												
												
											}
											else if(ltype=="bykeloan")
											{

												document.getElementById("2wc").style.display = "block"; 
												
												alert("bykkkkkkk");
												
											}
											
											
											
										}
										function bykeselect(){
											
											var e = document.getElementById("2wcompany");
											var bcomp = e.options[e.selectedIndex].value;
											alert(bcomp);
											if(bcomp=="bajaj")
											{
												document.getElementById("bajaj2w").style.display = "block"; 
												alert("carrrrrr");
												
												
											}
											else if(bcomp=="tvs")
											{
												document.getElementById("tvs2w").style.display = "block"; 
												alert("carrrrrr");
												
											}
											
										}
										
						</script>
							<div class="row align-items-center" style="display: none;" id="2wc">
							<div class="col mt-4">
								<select id="2wcompany" name="2WCOMPANY" onchange="bykeselect()">
									<option value="">Select Company</option>
									<option value="bajaj">Bajaj</option>
									<option value="tvs">TVS</option>
								</select>
							</div>
						</div>
						<div class="row align-items-center" style="display: none;" id="bajaj2w" onchange="bajaj()">
							<div class="col mt-4">
								<select id="bjajabyke" name="bajajbyke" >
									<option value="">Select Byke</option>
									<option value="pulsar220">Pulsar 220</option>
									<option value="200ns">Pulsar 200ns</option>
									<option value="200rs">Pulsar Loan</option>
									<option value="dominar">Dominar</option>
								</select>
							</div>
						</div>
						<div class="row align-items-center" style="display: none;" id="tvs2w" onchange="tvs()">
							<div class="col mt-4">
								<select id="tvsbyke" name="tvsbyke">
									<option value="">Select Byke</option>
									<option value="Apache">Apache 160</option>
									<option value="vector">Vector</option>
									
								</select>
							</div>
						</div>
						<div class="row align-items-center" style="display: none;" id="4wc"">
							<div class="col mt-4">
								<select id="4wcompany" name="4WCOMPANY"  onchange="fourwselect()">
									<option value="">Select Company</option>
									<option value="suzuki">Suzuki</option>
									<option value="toyoto">Toyoto</option>
								</select>
							</div>
						</div>
						<script type="text/javascript">
						
							function fourwselect()
							{
								
									var e = document.getElementById("4wcompany");
									var ccomp = e.options[e.selectedIndex].value;
									alert(ccomp);
									if(ccomp=="suzuki")
									{
										document.getElementById("suzuki4w").style.display = "block"; 
										
										
										
									}
									else if(ccomp=="toyoto")
									{
										document.getElementById("toyoto4w").style.display = "block"; 
										
										
									}
									
								
								
							}
						</script>
						<div class="row align-items-center" style="display: none;" id="suzuki4w">
							<div class="col mt-4">
								<select id="suzukicars" name="suzukicars">
									<option value="">Select Car</option>
									<option value="brezza">Brezza</option>
									<option value="swift">Swift</option>
									
								</select>
							</div>
						</div>
						<div class="row align-items-center" style="display: none;" id="toyoto4w">
							<div class="col mt-4">
								<select id="toyotocars" name="toyotocars">
									<option value="">Select Car</option>
									<option value="fortuner">Fortuner</option>
									<option value="quallis">Qualiss</option>
									
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
								<input type="text" class="form-control"
									placeholder="Interest Rate" readonly="readonly" id="interest" name="interest">
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