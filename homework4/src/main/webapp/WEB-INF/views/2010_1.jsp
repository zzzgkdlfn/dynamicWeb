<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1 align="center"> 2010�г⵵ 1�б� </h1>
	<table border="1" align="center">

		<tr align="center" style="background:#B2CCFF">
			<td>�����⵵</td>
			<td>�б�</td>
			<td>������</td>
			<td>�����ڵ�</td>
			<td>����</td>
			<td>����</td>
			<td>����</td>
		</tr>

		<c:forEach var="grade" items="${grades }">
			<tr align="center">
				<td><c:out value="${grade.getYear()}">
					</c:out></td>
				<td><c:out value="${grade.getSemester()}">
					</c:out></td>
				<td><c:out value="${grade.getSubject()}">
					</c:out></td>
				<td><c:out value="${grade.getSubjectCode()}">
					</c:out></td>
				<td><c:out value="${grade.getPart()}">
					</c:out></td>
				<td><c:out value="${grade.getCredit()}">
					</c:out></td>
				<td><c:out value="${grade.getGrade()}">
					</c:out></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>