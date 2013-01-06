<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" ignore="true" /></title>

<link rel="stylesheet" href="css/reset.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/style.css" type="text/css" media="screen">
<link rel="stylesheet" href="css/grid.css" type="text/css" media="screen">
<script src="js/jquery-1.6.3.min.js" type="text/javascript"></script>
<script src="js/cufon-yui.js" type="text/javascript"></script>
<script src="js/cufon-replace.js" type="text/javascript"></script>
<script src="js/Mate_400.font.js" type="text/javascript"></script>
<script src="js/FF-cash.js" type="text/javascript"></script>
<script src="js/tms-0.3.js" type="text/javascript"></script>
<script src="js/tms_presets.js" type="text/javascript"></script>
<script src="js/jquery.easing.1.3.js" type="text/javascript"></script>
<!--[if lt IE 7]>
<div style=' clear: both; text-align:center; position: relative;'>
	<a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
		<img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
	</a>
</div>
<![endif]-->
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/html5.js"></script>
	<link rel="stylesheet" href="css/ie.css" type="text/css" media="screen">
<![endif]-->



</head>

<body id="page1">
	<div class="extra">
		<div class="main">
			<header>
				<tiles:insertAttribute name="header" />
				<nav>
					<tiles:insertAttribute name="menu" />
				</nav>
			</header>
			
			<section id="content">
				<tiles:insertAttribute name="body" />
			</section>
		</div>
	</div>

	<footer>
		<tiles:insertAttribute name="footer" />
	</footer>
		
<script type="text/javascript"> Cufon.now(); </script>
<script type="text/javascript">
	$(window).load(function() {
		$('.slider')._TMS({
			duration:800,
			easing:'easeOutQuad',
			preset:'simpleFade',
			slideshow:7000,
			banners:false,
			pauseOnHover:true,
			pagination:false,
			nextBu:'.next',
			prevBu:'.prev'
		});
	});
</script>

</body>
</html>
