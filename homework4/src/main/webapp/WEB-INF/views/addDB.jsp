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


<h2 align="center">������ �߰� �� ����</h2>

	<table border="1" align="center" >

		<tr align="center" style="background:#B2CCFF">
			<td>��û����</td>
			<td>����</td>
			<td>�ٱ�A</td>
			<td>�ٱ�B</td>
			<td>�ϱ�</td>
			<td>����</td>
			<td>����</td>
			<td>����</td>
		</tr>

		<tr align="center">
			<td><c:out value="${allCredit}">
				</c:out></td>
			<td><c:out value="${rees}">
				</c:out></td>
			<td><c:out value="${coreA}">
			</c:out></td>
			<td><c:out value="${coreB}">
				</c:out></td>
			<td><c:out value="${free}">
				</c:out></td>
			<td><c:out value="${majorBasic}">
				</c:out></td>
			<td><c:out value="${major}">
				</c:out></td>
			<td><c:out value="${majorSelect}">
				</c:out></td>
		</tr>
	</table>
	
	<p align="center"><a href ="/homework4" >���ư��� </a> 

</body>
</html>