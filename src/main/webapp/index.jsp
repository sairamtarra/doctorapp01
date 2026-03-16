<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Doctor Portal</title>
</head>

<body style="background-color: #b1e6bc">

	<div class="container mt-5">

		<h1 align="center" style="font-weight: bold;">Doctor Portal</h1>

		<a href="doctorform" class="btn btn-info" style="font-weight: bold;">
			Add New Doctor </a>

		<table class="table mt-5 table-info">

			<thead>
				<tr>
					<th>#</th>
					<th>Name</th>
					<th>Email</th>
					<th>Specialist</th>
					<th>City</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>

			<tbody>

				<c:forEach var="doc" items="${list}">

					<tr>

						<th scope="row">${doc.id}</th>
						<td>${doc.name}</td>
						<td>${doc.email}</td>
						<td>${doc.specialist}</td>
						<td>${doc.city}</td>
						<td>${doc.country}</td>

						<td><a href="editdoctorform/${doc.id}"
							class="btn btn-warning"> Edit </a> <a
							href="deletedoctor/${doc.id}" class="btn btn-danger"> Delete
						</a></td>

					</tr>

				</c:forEach>

			</tbody>
		</table>

	</div>

</body>
</html>