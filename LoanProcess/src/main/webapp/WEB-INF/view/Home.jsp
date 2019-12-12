<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Upload</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

</head>
<body>

	<form action="/document/upload" method="post"
		enctype="multipart/form-data">
		<h4>Select document to upload</h4>
		<table border="1px solid">
			<br>
			<hr>
			<tr>
				<td><input type="file"  
					value="Upload Pan"></td>
				<td>
				<td><b>Upload PAN</b></td>
			</tr>

			<tr>
				<td><input type="file" name="fileToUpload"></td>
				<td>
				<td><b>Upload Aadhar</b></td>
			</tr>
			<tr>
				<td rowspan="2"><input type="submit" value="submit" name="fileToUpload"
					multiple="multiple"/></td>
			</tr>
		</table>
	</form>
</body>
</html>