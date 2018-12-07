<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table border="1"  align="center">
		<tr>
			<th>员工编号</th>
			<th>员工姓名</th>
			<th>入职时间</th>
			<th>工资</th>
		</tr>
		<c:forEach items="${list }" var="emp">
			<tr>
				<td>${emp.empno }</td>
				<td>${emp.ename }</td>
				<td>${emp.hiredate }</td>
				<td>${emp.sal }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>