<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<%@ include file="layouts/header.jsp" %>
		
	<div id="bodyhome">
		
		<form id="login" method="get">
					<br>
					<br>
					
					<p class="align"><input type="text" name ="name"><label class="legend"> Entrez votre nom </label></p> 
					<br><br>
			<div class="center legend yellow" > Choose your Hero
					<input type="radio" class= "bon" id="Archer" name ="bon" value= "archer"><label for="Archer" class="label "> <img class="character select" alt="" src="${pageContext.request.contextPath}/img/kakashi.png"> Kakashi </label>
					<input type="radio" class= "bon" id="Mage" name ="bon" value= "mage"><label for="Mage" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/vegeta.png"> Vegeta </label>
					<input type="radio" class= "bon" id="Guerrier" name ="bon" value= "guerrier"><label for="Guerrier" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/kon.png"> Kon </label>
			</div>	
				
					<br><br>
			<div class="center legend yellow" >  Choose your Destiny ...
 					<input type="radio" class= "mechant" id="Assassin" name ="mechant" value= "assassin"><label for="Assassin" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/felicia.png"> Felicia </label>
					<input type="radio" class= "mechant" id="Necromantien" name ="mechant" value= "necromantien"><label for="Necromantien" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/halibel.png"> Halibel </label>
					<input type="radio" class= "mechant" id="Berserker" name ="mechant" value= "berserker"><label for="Berserker" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/ryu.png"> Ryu </label>
			</div>
					<br><br>
					<p class="align"><input type="submit" id="p1" class="button" name="player" value="  START  "></p>
					<br>			
			</form>
	</div>
	<%@ include file="layouts/footer.jsp" %>
