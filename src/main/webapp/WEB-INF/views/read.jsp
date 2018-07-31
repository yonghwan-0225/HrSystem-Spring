<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html> 
<html>
<head>
<title>글읽기</title>
</head>
<form>
<body>

<p><label>사번 :</label> <input type="text" name ="id" value ="${EmpList.id}" readonly="readonly"></p>
<p><label>직급 :</label> <input type="text" name ="positon" value ="${EmpList.position}" readonly="readonly"></p>
<p><label>이름 :</label> <input type="text" name ="name"  value ="${EmpList.name}" readonly="readonly"></p>
<p><label>전화번호 :</label> <input type="text" name="number" value = "${EmpList.number}"readonly="readonly"><p>
<label>E-mail :</label> <input type="text" name="number" value = "${EmpList.email}"readonly="readonly"><p>


<button type="submit" formaction="modify" formmethod="get">수정</button>
<button type="submit" formaction="remove" formmethod="post">삭제</button>
<button type="submit" formaction="listAll" formmethod="get">목록</button>

</body>

</form>

</html>