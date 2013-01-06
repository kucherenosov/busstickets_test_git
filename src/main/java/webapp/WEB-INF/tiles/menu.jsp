<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul class="menu">

	<c:forEach var="menuItem" items="${topMenu}" varStatus="status">
		
		<c:set value="" var="cssClass4MenuItem"></c:set>
		
		<c:if test="${menuItem.link eq activePage}">
			<c:set value="active" var="cssClass4MenuItem"></c:set>
		</c:if>
		
		
		<c:if test="${menuItem.link eq activePage and status.last}">
			<c:set value="active last" var="cssClass4MenuItem"></c:set>
		</c:if>
		
		<c:if test="${ !(menuItem.link eq activePage) and status.last}">
			<c:set value="last" var="cssClass4MenuItem"></c:set>
		</c:if>
		
		
		
		<li class="${cssClass4MenuItem}"><a href="${menuItem.link}"> ${menuItem.label} </a></li>
	</c:forEach>

</ul>