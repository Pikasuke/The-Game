<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<%@ include file="layouts/header.jsp" %>
		
	<div id="bodyvs">
		
		 <div class="center legend" >
		 	<div class="yellow"> ${gentil.nom} </div>
		 	<div class="yellow"> ${mechant.nom} </div>
		</div>
		<div class="center legend" >
			<div class="white ">  PV : ${gentil.pv}   PM : ${gentil.pm}   Chakra = ${gentil.vol}<br>
		 	Attaque : ${gentil.phy}   Special : ${gentil.spe}   Ultime : ${gentil.ult} </div>
			<div class=" white"> PV : ${mechant.pv}   PM : ${mechant.pm}   Chakra : ${mechant.vol}<br>
		 	Attaque : ${mechant.phy}   Special : ${mechant.spe}   Ultime : ${mechant.ult} </div>
		</div>
		
		<div class="center legend" >
		 <img class="character" src="${pageContext.request.contextPath}/img/${player}.png">
		<br>
		 <br>
		  <img class="character" src="${pageContext.request.contextPath}/img/versus.png"> 
		 <br>
		 <br>
		<img class="character" src="${pageContext.request.contextPath}/img/${charactere}.png">
		 </div>
		 <br>
		 <br>
		 <form id="login" method="get">
					<p class="align"><input type="submit" class="button" id="fight" name="start" value="FIGHT !"> </p><br>			
			</form>
		</div>
	<%@ include file="layouts/footer.jsp" %>