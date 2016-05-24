<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>

<style>

table2 {
	align: center;
	color: blue;
	font: blue;
}

h2 {
	align: center;
}

tr {
	align: center;
}
</style>

<body>
<form action="/homework4/year" method="Get">
<font color="blue"></font>
	<table border="1" align="center" width="300">
		<tr align="center" style="background:#B2CCFF">
			<td>	년도	</td>
			<td>	학기	</td>
			<td>	총학점		</td>
			<td>	상세보기	</td>
		</tr>

		<tr align="center">
			<td>2010</td>
			<td>1</td>
			<td><c:out value="${sumCredit[0]}"> </c:out></td>
			<!-- <td><a href="/homework4/2010/1">버튼 </a></td> -->
			<td><input type="button" value="버튼" name="버튼" onclick="location.href='/homework4/2010/1'"/></td>
			  
		</tr>

		<tr align="center">
			<td>2010</td>
			<td>2</td>
			<td><c:out value="${sumCredit[1]}"> </c:out></td>
			<!-- <td><a href="/homework4/2010/2">버튼 </a></td> -->
			<td><input type="button" value="버튼" name="버튼" onclick="location.href='/homework4/2010/2'"/></td>
		</tr>

		<tr align="center">
			<td>2014</td>
			<td>1</td>
			<td><c:out value="${sumCredit[2]}"> </c:out></td>
			<td><input type="button" value="버튼" name="버튼" onclick="location.href='/homework4/2014/1'"/></td>
		</tr>

		<tr align="center">
			<td>2014</td>
			<td>2</td>
			<td><c:out value="${sumCredit[3]}"> </c:out></td>
			<td><input type="button" value="버튼" name="버튼" onclick="location.href='/homework4/2014/2'"/></td>
		</tr>

		<tr align="center">
			<td>2015</td>
			<td>1</td>
			<td><c:out value="${sumCredit[4]}"> </c:out></td>
			<td><input type="button" value="버튼" name="버튼" onclick="location.href='/homework4/2015/1'"/></td>
		</tr>

		<tr align="center">
			<td>2015</td>
			<td>2</td>
			<td><c:out value="${sumCredit[5]}"> </c:out></td>
			<td><input type="button" value="버튼" name="버튼" onclick="location.href='/homework4/2015/2'"/></td>
		</tr>
	</table>
	</form>
	
	<p>
	<p>
	<p>
	<p>
	<p align="center" > <font color="blue"> 총 성적 내역</font>
	
	<table border="1" align="center" style="color:blue">
	
	<tr align = "center">
	<td> 신청학점 </td>
	<td> 취득학점 </td>
	<td> 교필 </td>
	<td> 핵교A </td>
	<td> 핵교B </td>
	<td> 일교 </td>
	<td> 전기 </td>
	<td> 전지 </td>
	<td> 전선 </td>
	<td> 일선 </td>
	<td> 교직 </td>
	<td> 부전지 </td>
	<td> 부전선 </td>
	<td> 부전기 </td>
	<td> 복전지 </td>
	<td> 복전선 </td>
	<td> 복전기 </td>
	<td> 연전지 </td>
	<td> 연전선 </td>
	<td> 연전기 </td>
	<td> 평점총계 </td>
	<td> 평균평점 </td>
	<td> 백분위 점수 </td>
	</tr>
	
		<tr align = "center" >
	<td><c:out value="${allCredit}"> </c:out>  </td>
	<td> 112 </td>
	<td> <c:out value="${rees}"> </c:out> </td>
	<td> <c:out value="${coreA}"> </c:out> </td>
	<td> <c:out value="${coreB}"> </c:out> </td>
	<td> <c:out value="${free}"> </c:out> </td>
	<td> <c:out value="${majorBasic}"> </c:out> </td>
	<td> <c:out value="${major}"> </c:out> </td>
	<td> <c:out value="${majorSelect}"> </c:out> </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 0 </td>
	<td> 453 </td>
	<td> 4.04 </td>
	<td> 94.74 </td>
	</tr>
	
	
	</table>
	
	<!-- <h4 align="center"><a href ="createGrade">수강신청 </a> </h4> -->
	<p align="center"><input type="button" value="수강신청" name="버튼" onclick="location.href='createGrade'"/><input type="button" value="수강삭제" name="버튼" onclick="location.href='deleteGrade'"/></p>
	
</body>
</html>

