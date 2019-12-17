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
		enctype="multipart/form-data"  onsubmit="return Validate(this)">
		<h4>Select document to upload</h4>
		<table border="1px solid">
			<tr>
				<td><input type="file" name="fileToUpload"></td>
				<td>
				<td><b>Upload Document</b></td>
			</tr>
			<tr>
				<td rowspan="2"><input type="submit" value="submit"
					name="fileToUpload" multiple="multiple"  /></td>
			</tr>
			<div id="valid_msg" />
		</table>
	</form>
	
<!-- 	<button  action="/document/upload" method="post" onsubmit="return Validate(this)"></button> -->
	
	<script type="text/javascript">

	var _validFileExtensions = [".jpg", ".jpeg", ".gif", ".png",".txt"];    
	function Validate(oForm) {
		alert("fun call");
	    var arrInputs = oForm.getElementsByName("fileToUpload");

	    for (var i = 0; i < arrInputs.length; i++) {
	        var oInput = arrInputs[i];
	        if (oInput.type == "file") {
	            var sFileName = oInput.value;
	            if (sFileName.length > 0) {
	                var blnValid = false;
	                for (var j = 0; j < _validFileExtensions.length; j++) {
	                    var sCurExtension = _validFileExtensions[j];
	                    if (sFileName.substr(sFileName.length - sCurExtension.length, sCurExtension.length).toLowerCase() == sCurExtension.toLowerCase()) {
	                        blnValid = true;
	                        break;
	                    }
	                }
	                
	                if (!blnValid) {
	                    alert("Sorry, " + sFileName + " is invalid, allowed extensions are: " + _validFileExtensions.join(", "));
	                    return false;
	                }
	            }
	        }
	    }
	  
	    return true;
	}
	</script>
</body>
</html>