<%@page import="java.sql.Connection"%>
<%@page import="com.conn.DBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.bg{
	height:100vh;
	background:url('img/about.jpg');
	background-size:cover;
	background-repeat:no-repeat;	
	background-position:center;
	position:relative;
}
h1{
	color:navy;
	
}
</style>
<meta charset="UTF-8">
<title>Employee Management System</title>
<%@ include file="cssfile.jsp"%>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<div class="bg">
	<div class= "container">
		<h1 class="display-1">About Us</h1>
		<div class="container  top-25 start-25 position-absolute w-25">
		<p class="text-white fs-bold text-center">Almost any website you go to has an About Us page. It’s a page dedicated to answering the question, “who is this company, and what’s it all about?”</p>
	</div>
		</div>
		</div>
	
</body>
</html>