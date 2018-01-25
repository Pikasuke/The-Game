<%@ include file="layouts/header.jsp"%>
	
	<div id="bodyhome">
		
		
					<br>
					<br>
					<div class="legend yellow textc">Choose your Hero</div>
					
					<br><br>
					
			<div class="center " > 
					<input type="radio" class= "bon" id="Archer" name ="bon" value= "archer"><label for="Archer" class="label "> <img class="character select" alt="" src="${pageContext.request.contextPath}/img/kakashi.png"> Kakashi </label>
					<input type="radio" class= "bon" id="Mage" name ="bon" value= "mage"><label for="Mage" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/vegeta.png"> Vegeta </label>
					<input type="radio" class= "bon" id="Guerrier" name ="bon" value= "guerrier"><label for="Guerrier" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/felicia.png"> Felicia </label>
			</div>	
				
			<div class="center " >  
 					<input type="radio" class= "bon" id="p4" name ="bon" value= "archer"><label for="p4" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/mai.png"> Mai </label>
					<input type="radio" class= "bon" id="p5" name ="bon" value= "mage"><label for="p5" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/bryan.png"> Bryan </label>
					<input type="radio" class= "bon" id="p6" name ="bon" value= "guerrier"><label for="p6" class="label "><img class="character select" alt="" src="${pageContext.request.contextPath}/img/ichigo.png"> Ichigo </label>
			</div>
					<br><br>
					<p class="align"><input type="submit" id="p1" class="button" name="player" value="  START  "></p>
					<br>			
			</form>
	</div>
	<%@ include file="layouts/footer.jsp" %>
