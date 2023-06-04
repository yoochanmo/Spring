<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>새글 등록하기</h3>
		<hr />
		<form action="insertBoard" method="post">
			<table border="1">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input type="text" name="title"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left"><input type="text" name="writer" size="20"/></td>
				</tr>
				<tr>
					<td bgcolor="orange">글내용</td>
					<td align="left"><textarea name="content" cols="30" rows="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="새글등록하기"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>