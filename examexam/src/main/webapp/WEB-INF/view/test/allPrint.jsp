<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="border:1px">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<c:forEach var="item" items="${list}">
		<tr>
			<td>${item.id}</td>
			<td>${item.name}</td>
			<td>${item.age}</td>
		</tr>
		</c:forEach>
	</table>
	<a href="main">홈으로</a>
</body>
</html>