<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>

<html>
<head>
<title>Phantom by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
<noscript>
	<link rel="stylesheet" href="assets/css/noscript.css" />
</noscript>
</head>
<body class="is-preload">
	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div class="inner">

				<!-- Nav -->
				<nav>
					<ul>
						<li><a href="#menu">Menu</a></li>
					</ul>
				</nav>

			</div>
		</header>

		<!-- Menu -->
		<nav id="menu">
			<h2>Menu</h2>
			<ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="login.jsp">로그인</a></li>
				<li><a href="dog.jsp">강아지</a></li>
				<li><a href="cat.jsp">고양이</a></li>
				<li><a href="generic.jsp">관심상품</a></li>
				<li><a href="elements.jsp">장바구니</a></li>
			</ul>
		</nav>

		<!-- Main -->
		<section>
			<h2>회원 로그인</h2>
			<form method="post" action="#">
				<div class="row gtr-uniform">
					<div class="col-6 col-12-xsmall" display="table">
						<input type="text" name="inputId" id="inputId" value="" required="true" placeholder="아이디 입력" /> 
						<input type="password" name="inputPwd" id="inputPwd" value="" required="true" placeholder="비밀번호 입력" />
					</div>
					<div class="col-6 col-12-xsmall"></div>
					<div class="col-6 col-12-small">
						<input type="checkbox" id="loginSave" name="loginSave"> 
						<label for="demo-copy">로그인 정보 기억</label>
					</div>
					<div class="col-12">
						<ul class="actions">
							<li><input type="button" value="로그인" class="primary" /></li>
							<li><input type="button" value="회원가입" /></li>
						</ul>
					</div>
				</div>
			</form>
		</section>

		<!-- Scripts -->
		<script src="assets/js/jquery.min.js"></script>
		<script src="assets/js/browser.min.js"></script>
		<script src="assets/js/breakpoints.min.js"></script>
		<script src="assets/js/util.js"></script>
		<script src="assets/js/main.js"></script>
</body>
</html>