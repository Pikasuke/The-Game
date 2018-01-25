<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<%@ include file="layouts/header.jsp" %>
			
 			
		

		<c:if  test="${gentil.pv<0}" >
		 	<div class="background"> 
				<img class="gameover" src="${pageContext.request.contextPath}/img/gameover1.jpg"> 
				<audio autoplay>
	 			 <source src="${pageContext.request.contextPath}/img/ko.mp3" type="audio/mpeg">
				</audio>
			</div>	
		</c:if>
		
		<c:if  test="${gentil.pv>0}" >
			<div id="bodyend">
				<div id="winner" class="fingood legend blue"> ${gentil.nom}  WIN ! </div>
				<img class="win" src="${pageContext.request.contextPath}/img/youwin.gif"> 
				<audio autoplay>
	 			 <source src="${pageContext.request.contextPath}/img/win.mp3" type="audio/mpeg">
				</audio>
			</div> 
		</c:if>
 
 		<div>mechant PV<c:out value="${sessionScope.mechant.pv}"></c:out></div>
		<div>gentil PV<c:out value="${gentil.pv}"></c:out></div>
		<div>gentil PM<c:out value="${gentil.pm}"></c:out></div>

<%@ include file="layouts/footer.jsp" %>