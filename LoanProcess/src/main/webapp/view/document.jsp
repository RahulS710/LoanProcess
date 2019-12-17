<!DOCTYPE html>
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Document For  Approval</title>

<script type="text/javascript">

function myapprove() {
	alert("Hiii");
	document.approved.action="approve"
	document.approved.submit()
	
}
</script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
 
  
 
</head>
	<body>
	<form name="approved">
 		 <h2>Document For  Approval</h2>
	
	<div >
		<table  id="example" class="table table-bordered" border="1" height="100%" width="100%" bordercolor="grey">
		<tr>
			<th>Select</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>AadharNo</th>
			<th>PanNo</th>
			<th></th>
		</tr>
		 <c:forEach items="${msg}" var="user">
			<tr>
			<td><input id="p" type="checkbox" name="approveId" value=${user.userId}></td>
				<!-- <td>${user.userId}</td> -->
				<td>${user.firstName}</td>
				<td>${user.lastName}</td>
				<td>${user.adharNo}</td>
				<td>${user.panNo}</td>
				<td><button type="button" class="btn btn-primary" onclick="myapprove()">Approve</button>&nbsp;&nbsp;
				<button type="button" class="btn btn-danger">Reject</button>
				</td>
			</tr>
		</c:forEach>
		</table>
		</div>

	</body>
</html>

