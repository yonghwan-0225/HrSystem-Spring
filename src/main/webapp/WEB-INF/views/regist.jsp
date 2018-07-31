<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>글쓰기</title>
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
	<form action="" method="post" onsubmit="return validate();">
		<p>
			<label>직급</label><input type="text" name="position">
		</p>
		<p>
			<label>이름</label><input type="text" name="name" id="name">
		</p>
		<p>
			<label>전화번호</label><input type="text" name="number" id="number">
		</p>
		<p>
			<label>email</label><input type="text" name="email" id="email">
		</p>
		<button type="submit">등록</button>
	</form>
</body>
</html>