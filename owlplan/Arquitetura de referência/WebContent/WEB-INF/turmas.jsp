<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

	<nav style="margin-bottom:10px;">
	<div class="nav-wrapper">
		<a href="#!" class="brand-logo"><i class="material-icons"></i>OwlPlan</a>
		<ul class="right hide-on-med-and-down">
			<li><a href="#!"><i class="material-icons">email</i></a></li>
			<li><a class="dropdown-trigger" href="#!" data-target="dropdown1"><i class="large material-icons">face<i id="iconDropdown" class="material-icons right">arrow_drop_down</i></i></a></li>
		</ul>
	</div>
	</nav>

	<a id="btnAddTurma" class="waves-effect waves-light btn-large right sidenav-trigger" data-target="slide-out"><i class="material-icons left">add</i>CRIAR OU EDITAR TURMA</a>
			
	   <!-- turma -->
	    <div id="slide-out" class="sidenav row">
	    	
	    	<a class="sidenav-close"><i style="padding:10px" class="right material-icons closeModal">close</i></a>
	    	 
	    	<p id="titleNav">Criar ou editar turma</p>
	        
	        <form class="col s12"  action="criarTurma" method="post">
	            
            <div class="input-field col s12 tooltipped" data-position="left" data-tooltip="Como você deseja chamar sua turma">
           		<input name="apelidoTurma" id="apelidoTurma" type="text" class="validate"> <label for="apelidoTurma">Apelido da turma</label>
            </div>

			<div id="divNovoApelido" style="display: none" class="input-field col s12 tooltipped" data-position="left" data-tooltip="Escolha um novo apelido para sua turma">
				<input name="novoApelidoTurma" id="novoApelidoTurma" type="text" class="validate"> <label for="novoApelidoTurma">Novo apelido da turma</label>
			</div>

			<div class="input-field col s12 tooltipped" data-position="left" data-tooltip="Em qual série seus alunos estão">
	        	<input name="serieTurma" id="serieTurma" type="text" class="validate"> <label for="serieTurma">Série</label>
            </div>

			<div class="input-field col s12 tooltipped" data-position="left" data-tooltip="De qual escola sua turma é">
			
				<select name="escolaTurma">
					
					<option value="escolha" disabled selected>Escolha uma escola</option>
	
					<c:forEach var="e" items="${escolas}">
	
						<option value=${e.id_escola}>${e.nome}</option>
	
					</c:forEach>
	
				</select> 
					
				<label>Escola</label>

			</div>

			<a class="tooltipped" data-position="left" data-tooltip="Em qual período do dia você da aula para essa turma"> <label>Período</label> <br />
			
				<br />

				<div>
					<label> <input name="periodoTurma" type="radio" value="matutino" checked /> <span>Matutino</span></label>
				</div>

				<div>
					<label> <input name="periodoTurma" type="radio"	value="vespertino" /> <span>Vespertino</span></label>
				</div>

				<div>
					<label> <input name="periodoTurma" type="radio" value="noturno" /> <span>Noturno</span></label>
				</div>
			</a> 
			
			<br/><br/>

			<button class="btn waves-effect waves-light btnDisable red" type="submit" name="name" value="excluir"><i class="small material-icons">delete_forever</i></button> 
			<button class="btn waves-effect waves-light btnDisable blue" type="submit" name="name" value="editar"><i class="small material-icons">edit</i></button>
			<button class="btn waves-effect waves-light green" type="submit" name="name" style="margin-left:82px;" id="btnDisable" value="criar">Criar</button>

		</form>
	    </div>

	<div class="row col s12">
			<c:forEach var="t" items="${turmas}">
				<div class="col s4 card-panel teal cardTurma">
						<span class="white-text">
							<h5 class="apelidoTurma">${t.apelido}</h5>
							<p>${t.serie}</p>
							<p>${t.periodo}</p>
							<p>${t.escola}</p>
						</span>
					<a href="listarPlanos" class="btn pink right">Ir para a turma</a>
				</div>
			</c:forEach>
		</div>
		
	<script src="../js/all.js"></script>

</body>
</html>