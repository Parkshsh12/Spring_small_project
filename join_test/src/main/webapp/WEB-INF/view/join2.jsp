<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join2" method="post">
		<div>
			이름 : <input type="text" name="name">
		</div>
		<div>
			이메일 : <input type="email" name="email" value="${email}">		
		</div>
		<div>
			아이디 : <input type="text" name="id">
		</div>
		<div>
			비밀번호 : <input type="password" name="password">
		</div>
		<input type="submit">
	</form>
</body>
</html>