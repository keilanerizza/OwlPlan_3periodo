<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="../css/all.css">
<script src="../node_modules/jquery/dist/jquery.min.js"></script>
<script src="../node_modules/materialize-css/dist/js/materialize.min.js"></script>
<link rel="stylesheet" href="../node_modules/materialize-css/dist/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<title></title>
</head>
<body>

<!-- Dropdown Structure -->
	<ul id="dropdown1" class="dropdown-content">
		<li><a href="logout">logout</a></li>
	</ul>

	<nav style="margin-bottom:10px;" class="nav-extended">
	<div class="nav-wrapper">
		<a href="#!" class="brand-logo"><i class="material-icons"></i>OwlPlan</a>
		<a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
		<ul class="right hide-on-med-and-down">
			<li><a href="#!"><i class="material-icons">email</i></a></li>
			<li><a class="dropdown-trigger" href="#!" data-target="dropdown1"><i class="large material-icons">face<i id="iconDropdown" class="material-icons right">arrow_drop_down</i></i></a></li>
		</ul>
	</div>
	</nav>
	
	<div class="nav-content">
      <ul class="tabs">
        <li class="tab"><a href="#test1" class="active">Planos</a></li>
        <li class="tab disabled"><a href="#test2">Alunos</a></li>
      </ul>
      <a id="btnAddPlano" class="waves-effect waves-light btn-large right"><i class="material-icons left">add</i>CRIAR PLANEJAMENTO</a>
    </div>

	<div id="test1" class="col s12">Test 1</div>
	<div id="test2" class="col s12">Test 2</div>
	
	<script src="../js/all.js"></script>
	
</body>
</html>






