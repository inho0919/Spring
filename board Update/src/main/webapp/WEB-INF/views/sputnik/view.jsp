<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시물 조회</title>
</head>
<body>
	<form method="post">
		<label>제목 : </label>
		<span>${view.title}</span>
		
		<br />

		<label>작성자 : </label>
		<span>${view.writer}</span>
		
		<br />

		<label>내용</label>
		<br />
		<div>
		${view.content}
		</div>
		<br />
		<br />
		<div>
			<a href="/sputnik/update?bno=${view.bno}">게시물 수정</a>
		</div>
	</form>
</body>
</html>