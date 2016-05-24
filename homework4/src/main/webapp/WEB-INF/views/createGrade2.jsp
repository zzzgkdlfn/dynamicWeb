
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

<h2 align="center">2016년도 1학기 수강 신청 </h2>

<form action="addDB" method="get">

<pre style= "color:#4C4C4C">
						교 과 목 : <input type="text" name ="subject"/>
						교과코드 : <input type="text" name ="subjectCode">
						구    분 : <input type = "text" name ="part"> 
						학    점 : <input type ="text" name="credit">
</pre>


<p align="center"><input type="submit" value="추가"/>

</form>
	
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