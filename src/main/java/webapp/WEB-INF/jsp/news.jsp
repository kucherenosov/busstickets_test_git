<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>About</title>
</head>
<body>
news page body.


<ul class="list-1">

	<c:forEach items="${newsList}" var="newsItem">
	<li>
		<div style="news-title"><a href="#">${newsItem.title}</a></div>
		<div style="news-short-body">${newsItem.shortBody}</div>
		<c:forEach items="${newsItem.images}" var="newsImage">
			<img src="image/newsimage/${newsImage.id}" alt="pic" width="140" height="100" />
		</c:forEach>
		<!-- 
		<img src="image/newsimage/1" alt="pic" width="140" height="100" />
		 -->
	</li>
	</c:forEach>

</ul>


</body>
</html>