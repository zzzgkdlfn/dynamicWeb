
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

	<table border="1" align="center">

		<tr align="center" style="background:#B2CCFF">
			<td>수강년도</td>
			<td>학기</td>
			<td>교과명</td>
			<td>교과코드</td>
			<td>구분</td>
			<td>학점</td>
			<td></td>
		</tr>
		
		<tr align="center">
		<td>2016</td>
		<td>1</td>
		<td>캡스톤디자인</td>
		<td>CSE0025</td>
		<td>전지</td>
		<td>6</td>
		<td><a href="/homework4/addDB1">추가 </a></td>
		</tr>
		
		<tr align="center">
		<td>2016</td>
		<td>1</td>
		<td>웹프레임워크1</td>
		<td>CSE0032</td>
		<td>전선</td>
		<td>3</td>
		<td><a href="/homework4/addGrade2">추가 </a></td>
		</tr>
		
		<tr align="center">
		<td>2016</td>
		<td>1</td>
		<td>정보보안</td>
		<td>CSE0038</td>
		<td>전선</td>
		<td>3</td>
		<td><a href="/homework4/addGrade3">추가 </a></td>
		</tr>
	</table>
	
	
	<h2 align="center">현재 신청 학점 </h2>

	<table border="1" align="center">

		<tr align="center" style="background:#B2CCFF">
			<td>신청학점</td>
			<td>교필</td>
			<td>핵교A</td>
			<td>핵교B</td>
			<td>일교</td>
			<td>전기</td>
			<td>전지</td>
			<td>전선</td>
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


</body>
</html>