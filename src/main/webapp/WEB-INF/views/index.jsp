<!DOCTYPE html>
<html lang="en" data-ng-app="scotchApp">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="static/css/bootstrap.min.css"">
<script src="static/js/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>
<script src="static/js/angular.min.js"></script>
<script src="static/js//angular-route.min.js"></script>
<script src="static/js/nglr/app.js"></script>

</head>
<body data-ng-controller="mainController">
	  <header>
            <nav class="navbar navbar-default">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/">Angular Routing Example</a>
                </div>

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="#"><i class="fa fa-home"></i> Home</a></li>
                    <li><a href="#about"><i class="fa fa-shield"></i> About</a></li>
                    <li><a href="#contact"><i class="fa fa-comment"></i> Contact</a></li>
                </ul>
            </div>
            </nav>
        </header>

        <!-- MAIN CONTENT AND INJECTED VIEWS -->
        <div id="main">

           <div data-ng-view></div>

        </div>

</body>