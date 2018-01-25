<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<%@ include file="layouts/header.jsp" %>
		
	<div id="bodyfight">
	
			<c:out value="${sessionScope.mechant.pm}"></c:out>
					<c:out value="${mechant.pm}"></c:out>
					<c:out value="${gentil.pm}"></c:out>
					<br>
	
		<form id="login" method="get" class="left">
				
					<input type="image" class= "character" name="attaque" value="0" src="${pageContext.request.contextPath}/img/${player}1.png" >
					<input type="image" class= "character" name="attaque" value="1" src="${pageContext.request.contextPath}/img/${player}2.png" >
					<c:if  test="${gentil.pm>=50}" > <input type="image" class= "character" name="attaque" value="2" src="${pageContext.request.contextPath}/img/${player}3.png" ></c:if>
					<c:if  test="${gentil.pm>=100}" ><input type="image" class= "character" name="attaque" value="3" src="${pageContext.request.contextPath}/img/${player}4.png" ></c:if>
				
			</form>
			
				<div class="left white"> 
					<div class="attak"> Recharge Ki </div>
					<div class="attak"> Attaque </div>
					<c:if  test="${gentil.pm>=50}" ><div class="attak"> Magie  </div> </c:if>
					<c:if  test="${gentil.pm>=100}" ><div class="attak"> Full Magie Ultime </div></c:if>
				</div>
					<br><br>			
		
			<div class="flexbarre " >
		  <div class="barre vie gauche" style= "width:calc(${gentil.pv}/${gIPV}*400px);">${bonVie}  %</div>
		  <div class="barre vie droite" style= "width:calc(${mechant.pv}/${mIPV}*400px);">${badVie} %</div>
		</div>
		<div class="clear"></div>
		<div class="flexbarre " >
			<div class="pmfix"> </div>
		  <div class="barre pm gauche" style= "width:calc(${gentil.pm}*2px);">  </div>
		  <div class="barre pm droite" style= "width:calc(${mechant.pm}*2px);"> </div>
		  <div class="pmfix droite"> </div>
		</div>
			
			<div class="flexfight" >
		  <img class="attaque" src="${pageContext.request.contextPath}/img/${player}.png">
		 <img class="attaque" src="${pageContext.request.contextPath}/img/${charactere}.png">
		</div>
				<div class="clear"></div>
		
	
		
		 <br>
		 <br>
		<div>mechant PV<c:out value="${sessionScope.mechant.pv}"></c:out></div>
			<div>gentil PV<c:out value="${gentil.pv}"></c:out></div>
				<div>gentil PM<c:out value="${gentil.pm}"></c:out></div>
		</div>
		

<%@ include file="layouts/footer.jsp" %>