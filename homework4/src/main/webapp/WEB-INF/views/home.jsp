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
			<td>	�⵵	</td>
			<td>	�б�	</td>
			<td>	������		</td>
			<td>	�󼼺���	</td>
		</tr>

		<tr align="center">
			<td>2010</td>
			<td>1</td>
			<td><c:out value="${sumCredit[0]}"> </c:out></td>
			<!-- <td><a href="/homework4/2010/1">��ư </a></td> -->
			<td><input type="button" value="��ư" name="��ư" onclick="location.href='/homework4/2010/1'"/></td>
			  
		</tr>

		<tr align="center">
			<td>2010</td>
			<td>2</td>
			<td><c:out value="${sumCredit[1]}"> </c:out></td>
			<!-- <td><a href="/homework4/2010/2">��ư </a></td> -->
			<td><input type="button" value="��ư" name="��ư" onclick="location.href='/homework4/2010/2'"/></td>
		</tr>

		<tr align="center">
			<td>2014</td>
			<td>1</td>
			<td><c:out value="${sumCredit[2]}"> </c:out></td>
			<td><input type="button" value="��ư" name="��ư" onclick="location.href='/homework4/2014/1'"/></td>
		</tr>

		<tr align="center">
			<td>2014</td>
			<td>2</td>
			<td><c:out value="${sumCredit[3]}"> </c:out></td>
			<td><input type="button" value="��ư" name="��ư" onclick="location.href='/homework4/2014/2'"/></td>
		</tr>

		<tr align="center">
			<td>2015</td>
			<td>1</td>
			<td><c:out value="${sumCredit[4]}"> </c:out></td>
			<td><input type="button" value="��ư" name="��ư" onclick="location.href='/homework4/2015/1'"/></td>
		</tr>

		<tr align="center">
			<td>2015</td>
			<td>2</td>
			<td><c:out value="${sumCredit[5]}"> </c:out></td>
			<td><input type="button" value="��ư" name="��ư" onclick="location.href='/homework4/2015/2'"/></td>
		</tr>
	</table>
	</form>
	
	<p>
	<p>
	<p>
	<p>
	<p align="center" > <font color="blue"> �� ���� ����</font>
	
	<table border="1" align="center" style="color:blue">
	
	<tr align = "center">
	<td> ��û���� </td>
	<td> ������� </td>
	<td> ���� </td>
	<td> �ٱ�A </td>
	<td> �ٱ�B </td>
	<td> �ϱ� </td>
	<td> ���� </td>
	<td> ���� </td>
	<td> ���� </td>
	<td> �ϼ� </td>
	<td> ���� </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> ������ </td>
	<td> �����Ѱ� </td>
	<td> ������� </td>
	<td> ����� ���� </td>
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
	
	<!-- <h4 align="center"><a href ="createGrade">������û </a> </h4> -->
	<p align="center"><input type="button" value="������û" name="��ư" onclick="location.href='createGrade'"/><input type="button" value="��������" name="��ư" onclick="location.href='deleteGrade'"/></p>
	
</body>
</html>

