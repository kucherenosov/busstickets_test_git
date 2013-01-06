<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul class="menu">


	<c:if test="${activePage == 'welcome'}">
		<c:set value="active" var="cssClass4Welcome"></c:set>
	</c:if>
	<li class="${cssClass4Welcome}"><a href="welcome.htm">Home</a></li>
	

	<c:if test="${activePage == 'service'}">
		<c:set value="active" var="cssClass4Services"></c:set>
	</c:if>
	<li class="${cssClass4Services}"><a href="services.htm">Services</a></li>



	<li><a href="photo.htm">Photo</a></li>
	<li><a href="news.htm">News</a></li>
	<li class="last"><a href="about.htm">Contacts/About</a></li>

	
	
	
	


</ul>