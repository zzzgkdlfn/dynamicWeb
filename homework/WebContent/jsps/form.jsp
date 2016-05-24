<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>
h1{text-align:center;}
body{
 background:#ffffd2;
 margin:5px;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<h1> A Sample Form </h1>

<form action="Server" method="post" >
Item Number: <input type="text" name="itemNum" /><br/>
Description: <input type="text" name="description"> <br/>
Price Each: <input type="text" name="price"> <br/>
<hr/>
First Name: <input type="text" name="firstName"> <br/>
Last Name: <input type="text" name="lastName"> <br/>
Middle Initial: <input type="text" name="middleName"> <br/>

Shipping Address: <textarea rows="3" cols="30" name="address"> </textarea> <br/>
Credit Card: <br/>
 <input type="radio" name="cardType" value="visa" /> Visa <br/>
 <input type="radio" name="cardType" value="MasterCard"/> MasterCard <br/>
 <input type="radio" name="cardType" value="American Express"/> American Express <br/>
 <input type="radio" name="cardType" value="Discover"/> Discover <br/>
 <input type="radio" name="cardType" value="Java SmartCard"/> Java SmartCard <br/>
 
 Credit Card Number: <input type="password" name="cardNum"><br/>
 Repeat Credit Card Number: <input type="password" name="cardNum2"> <br/>
 
 
<input type="submit" style="float:right" value="Submit Order"/>

</form>

</body>
</html>