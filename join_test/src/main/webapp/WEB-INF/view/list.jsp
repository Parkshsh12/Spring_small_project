<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	table{
		border: 1px solid
	}
	th, td{
		border : 1px solid
	}
</style>
<body>
	<table>
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>이메일</th>
		</tr>
		<c:forEach var="member" items="${list}">
		<tr>
			<td>${member.id}</td>
			<td>${member.name}</td>
			<td>${member.email}</td>
		</tr>
		</c:forEach>
	</table>
	<a href="main">[홈으로]</a>
</body>
</html>