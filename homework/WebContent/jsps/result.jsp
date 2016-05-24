<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
h1 {
	text-align: center;
}

body {
	background: #ffffd2;
}

th {
	background-color: #ffbb00;
}

table {
	align: center;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<title>Insert title here</title>

</head>

<body>

	<h1>Reading All Request Parameters</h1>
	<br />
	<table border="1" align=center>
		<tr>
			<th>Parameter Name</th>
			<th>Parameter Value(s)</th>
		</tr>

		<tr>
			<td>cardNum</td>
			<td>
				<ul>
					<li>${cardNum}</li>
					<li>${cardNum2}</li>
				</ul>
			</td>
		</tr>

		<tr>
			<td>cardType</td>
			<td>${cardType}</td>
		</tr>

		<tr>
			<td>price</td>
			<td>${price}</td>
		</tr>

		<tr>
			<td>initial</td>
			<td>${middleName}</td>
		</tr>

		<tr>
			<td>itemNum</td>
			<td>${itemNum}</td>
		</tr>

		<tr>
			<td>address</td>
			<td>${address}</td>
		</tr>

		<tr>
			<td>firstName</td>
			<td>${firstName}</td>
		</tr>

		<tr>
			<td>description</td>
			<td>${description }</td>
		</tr>

		<tr>
			<td>lastName</td>
			<td>${lastName}</td>
		</tr>


	</table>

</body>
</html>