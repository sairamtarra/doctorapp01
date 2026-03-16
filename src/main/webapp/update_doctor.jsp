<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Update Doctor</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body style="background-color: #e2e2e2">

	<div class="container mt-5">

		<div class="card" style="width: 25rem;">

			<div class="card-body">

				<h5 class="card-title text-center">Update Doctor</h5>

				<f:form modelAttribute="doctor" action="../updatedoctor"
					method="post">

					<f:hidden path="id" />

					<div class="form-group">

						<label>Name</label>

						<f:input path="name" class="form-control" />

					</div>

					<div class="form-group">

						<label>Email</label>

						<f:input path="email" class="form-control" />

					</div>

					<div class="form-group">

						<label>Specialist</label>

						<f:input path="specialist" class="form-control" />

					</div>

					<div class="form-group">

						<label>City</label>

						<f:input path="city" class="form-control" />

					</div>

					<div class="form-group">

						<label>Country</label>

						<f:input path="country" class="form-control" />

					</div>

					<br>

					<div class="text-center">

						<input type="submit" value="Update Doctor" class="btn btn-success">

					</div>

				</f:form>

			</div>

		</div>

	</div>

</body>
</html>