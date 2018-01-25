
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/home.css">
<title>The Game</title>
</head>

<body>
	<header>

		<h1>
			<a href="home"><img id="logo"
				src="${pageContext.request.contextPath}/img/logo.png"></a> The
			Game
		</h1>

		<p id="restart">
			<a class="lien" href="home"> 1 Player    </a>
			<a class="lien" href="player1">    Versus </a>
		</p>


	</header>
	<div class="background">
		<iframe class="intro" width="560" height="315"
			src="https://www.youtube.com/embed/LCXEPXfTsEk?autoplay=1"
			frameborder="0" gesture="media" allow="encrypted-media"
			allowfullscreen></iframe>
	</div>

	<%@ include file="layouts/footer.jsp"%>