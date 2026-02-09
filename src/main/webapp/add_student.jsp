<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "allcss.jsp" %>
</head>
<body class="bg-light">
	<%@ include file = "navbar.jsp" %>
	<div class="container p-4">
		<div class="row">
			<div class = "col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<p class="fs-3 text-center">Add Student</p>
					<form action = "" method="post">
					
						<div class="mb-3">
  							<label class="form-label">Full Name</label>
  							<input type="text" class="form-control" name="name">
						</div>
						<div class="mb-3">
  							<label class="form-label">DOB</label>
  							<input type="date" class="form-control" name = "dob">
						</div>
  						<div class="mb-3">
  							<label class="form-label">Address</label>
  							<textarea class="form-control"rows="3" name="address"></textarea>
						</div>
						<div class="mb-3">
  							<label class="form-label">Qualifications</label>
  							<input type="text" class="form-control" name="qualification">
						</div>
						<div class="mb-3">
  							<label class="form-label">Email</label>
  							<input type="email" class="form-control" name="email">
						</div>
						<div class="mb-3">
  							
  							<button type="submit" class="btn btn-primary col-md-12">Submit</button>
						</div>
					</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>