<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>About</title>
</head>
<body>
About page body.

<div class="wrapper">
	<article class="grid_12">
		<div class="indent-left2">
			<h3 class="p1">Contact Form</h3>
			
			<form:form id="contact-form" commandName="contactInfo" method="POST"  >
				<fieldset>
					  <label><span class="text-form">Your Name:</span><form:input path="name"/></label>
					  <label><span class="text-form">Your E-mail:</span><form:input path="email"/></label>
					  <div class="wrapper">
						<div class="text-form">Your Message:</div>
						<div class="extra-wrap">
							<form:textarea path="message"/>
							<div class="clear"></div>
							<div class="buttons">
								<a class="button" href="#" onClick="document.getElementById('contact-form').reset()">Clear</a>
								<!-- 
								<a class="button" href="#" onClick="document.getElementById('contact-form').submit()">Send</a>
								 -->
								 <input type="submit">
							</div>
						</div>
					  </div>
				</fieldset>
			</form:form>
		</div>
	</article>
</div>





</body>
</html>