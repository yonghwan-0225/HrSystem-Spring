<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE>
<html>
<head>
<title>직원 수정</title>
</head>
<script type="text/javascript">

	function validate() {
		var number = document.getElementById('number');
		var email = document.getElementById('email');
		// 이메일 검사
		// 4글자 이상(\w = [a-zA-Z0-9_], [\w-\.]) @가 나오고
		// 1글자 이상(주소). 글자 가 1~3번 반복됨
		
		if (email.value != "") {
			if (!chk(/^[\w]{3,}@[\w]+(\.[\w-]+){1,3}$/, email, "이메일 형식에 어긋납니다."))
				return false;
		}

		if (number.value != "") {
			if (!chk(/^\d{2,3}-\d{3,4}-\d{4}$/, number, "전화번호는 010-0000-0000으로 입력바랍니다.."))
				return false;
		}
	}

	function chk(re, e, msg) {
		if (re.test(e.value)) {
			return true;
		}

		alert(msg);
		e.value = "";
		e.focus();
		return false;
	}
</script>

<body>
	직원 수정 페이지
	<form action="modify" method="post" onsubmit="return validate();">
		<body>
			<p>
				<label>id</label> <input type="text" name="id" value="${EmpList.id}">
			</p>
			<p>
				<label>직급</label><input type="text" name="position"
					value="${EmpList.position}">
			</p>
			<p>
				<label>이름</label> <input type="text" name="name"
					value="${EmpList.name}">
			</p>
			<p>
				<label>전화번호</label> <input type="text" name="number"
					value="${EmpList.number}">
			</p>
			<p>
				<label>email</label> <input type="text" name="email"
					value="${EmpList.email}">
			</p>
			<br>
			<button type="submit">완료</button>
		</body>
	</form>
</html>