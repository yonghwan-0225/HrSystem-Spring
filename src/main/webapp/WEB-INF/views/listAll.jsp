<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<title>게시판 목록</title>
</head>
<form action="regist" method="get">
	<body>
		<table border="1" width="880">
			<tr>
				<td width="50">
					<p align="center">사번</p>
				</td>
				<td width="100">
					<p align="center">직급</p>
				</td>
				<td width="100">
					<p align="center">이름</p>
				</td>
				<td width="160">
					<p align="center">전화번호</p>
				</td>
				<td width="160">
					<p align="center">email</p>
				</td>
			</tr>
			<c:forEach items="${list}" var="EmpList">
				<tr>
					<td>${EmpList.id}</td>
					<td>${EmpList.position}</td>
					<td><a href='/read?id=${EmpList.id}'>${EmpList.name}</a></td>
					<td>${EmpList.number}</td>
					<td>${EmpList.email}</td>
				</tr>
			</c:forEach>
		</table>
		<button type="submit">직원등록</button>
	</body>
</form>

</html>