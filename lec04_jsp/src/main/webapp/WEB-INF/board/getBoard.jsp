<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>글 상세보기</h1>
	<hr />
	<form action="updateBoard" method="post">
		<input type="hidden" name="seq" value="${board.getSeq() }" />
		<table border="1">
			<tr>
				<td bgcolor="orange" width="70">제목</td>
				<td align="left"><input type="text" name="title" value="${board.getTitle() }"/></td>
			</tr>
			<tr>
				<td bgcolor="orange">작성자</td>
				<td align="left"><input type="text" name="writer" size="20" value="${board.getWriter() }" readonly/></td>
			</tr>
			<tr>
				<td bgcolor="orange">글내용</td>
				<td align="left"><textarea name="content" cols="30" rows="10" >${board.getContent() }</textarea></td>
			</tr>
			<tr>
			<td bgcolor="orange">등록일</td>
			<td align="left"><fmt:formatDate value="${board.getCreateDate() }" pattern="yyyy.MM.dd"/></td>
			</tr>
			<tr>
				<td bgcolor="orange">조회수</td>
				<td align="left">${board.getCnt() }</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="글수정하기" />
				</td>
			</tr>
		</table>
	</form>
	<hr />
	<a href="insertBoard">글등록</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoard?seq=${board.getSeq() }">글삭제</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList">글목록</a>
</body>
</html>