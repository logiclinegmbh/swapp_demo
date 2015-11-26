<!doctype html>

<html>
<head>
<meta charset="utf-8">
<title>Spring MVC and Hibernate Template</title>

<meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="./img/favicon.ico"
	type="image/x-icon; charset=binary" />
<link
	href="//netdna.bootstrapcdn.com/bootstrap/2.3.2/css/bootstrap.min.css"
	rel="stylesheet">
<link href="//cdnjs.cloudflare.com/ajax/libs/prettify/r224/prettify.css"
	rel="stylesheet">

<!--
  IMPORTANT:
  This is Heroku specific styling. Remove to customize.
  -->
<link href="http://heroku.github.com/template-app-bootstrap/heroku.css"
	rel="stylesheet">
<link href="./css/logicline.css" rel="stylesheet">

<script src="//code.jquery.com/jquery-1.9.1.min.js"></script>
<script
	src="//netdna.bootstrapcdn.com/bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/prettify/r224/prettify.min.js"></script>
</head>

<body onload="prettyPrint();">

	<div id="MainContainer">
		<!-- Start: Header -->
		<header>
			<jsp:include page="./templates/_header.html"></jsp:include>
		</header>
		<!-- End: Header -->
		
		<div id="Fullpage">
			<div class="row">
				<div class="span8 offset2">

					<div style="margin-bottom: 20px">
						Some unexpected error occoured:
						Status Code: ${javax.servlet.error.status_code}<p>
						Message: ${javax.servlet.error.message}<p>
						Requested URI: ${javax.servlet.error.request_uri}<p>
						Servlet Name: ${javax.servlet.error.servlet_name}<p>
						
						Status Code: ${status_code}<p>
						Message: ${message}<p>
						Requested URI: ${request_uri}<p>
						Servlet Name: ${servlet_name}<p>
					</div>

					<div class="tab-content"></div>
				</div>
			</div>
		</div>
		
		<!-- Start: Footer -->
		<footer>
			<jsp:include page="./templates/_footer.html"></jsp:include>
		</footer>
		<!-- End: Footer -->
	</div>
</body>
</html>
