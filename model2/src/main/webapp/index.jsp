<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> --%>
<%-- <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> --%>
<%-- <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %> --%>
<%-- <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %> --%>
    
<%--
	core set : var-변수명, value-값, scope-영역(request, page(기본), application, session)
	core if : test- 조건식, 조건식이 참일경우에 대해서만 처리가능
	core choose : switch문과 비슷한 동작을 한다.
		 when : test- 조건식, choose 내부에 여러개의 when을 만들 수 있다.
		 otherwise : choose내부의 when태그 중에 일치하는 조건이 없으면 otherwise가 실행된다.
	core forEach : for문과 비슷한 동작, var-내부변수명, begin- 시작값, end - 종료값, step - 증감값
		c:forEach var="i" begin="1" end="10" step="1"
		c:forEach var="name" items="people" , people은 배열 또는 컬렉션
	core redirect : url-처리할 페이지주소 reponse.sendRedirect와 동일
--%>
    
<c:set var ="part" value="main" scope="page" />
<c:if test="${prt != null }" >
	<c:set var="part" value="${prt }"/>
</c:if>

<%--${part} 가 requset.getAtrribute("part") --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 애플반 </title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

<link rel="stylesheet" href="http://localhost:8080/static/css/default.css">
<script src="./static/js/init.js"></script>
<%-- part 파라미터의 유무에 따라 추가 css,js --%>
<link rel="stylesheet" href="./static/css/${part}.css">

<script src="./static/js/${part}.js"></script>

</head>
<body>
	<div id="wrap">
		<%@ include file="header.jsp" %>
		
		<div id="main">
			<c:import url="${part}.jsp" charEncoding="UTF-8"/>
		</div>
		
		<%@ include file="footer.jsp" %>
	</div>

</body>
</html>

<!-- 
	 회원가입- 로그인
	 게시판 - 목록, 글쓰기, 수정, 삭제, 댓글

	jstl - jsp standard tag library의 약자
	
		core - 변수, 조건문, 반복문 // jsap < % % >와 동격
		
		formatting - 날짜, 시간, 숫자, 통화단위, 텍스트, 등을 표시하는 방법
		
		functions - 메서드를 사용할 수 있는 라이브러리
		
		database - 데이터베이스 상호 작용 라이브러리
		
		xml - xml문서를 생성 조작하기위한 라이브러리
 -->