<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${ title }</title>
</head>
<body>
	<%-- ${ boards } --%>
	<div align="center">
		<h1>게시글 목록 보기</h1>
		<table border="1">
			<thead>
				<tr>
					<th bgcolor="orange" width="50">번호</th>
					<th bgcolor="orange" width="200">제목</th>
					<th bgcolor="orange" width="150">작성자</th>
					<th bgcolor="orange" width="150">등록일</th>
					<th bgcolor="orange" width="100">조회수</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="board" items="${ boards }">
				<tr>
					<td>${ board.seq }</td>
					<td align="left"><a href="getBoard?seq=${ board.seq }">${ board.title }</a></td>
					<td>${ board.writer }</td>
					<td><fmt:formatDate value="${ board.createDate }" pattern="yyyy-MM-dd"></fmt:formatDate></td>
					<td>${ board.cnt }</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<br />
		<a href="insertBoard">새글등록</a>
	</div>
</body>
</html>