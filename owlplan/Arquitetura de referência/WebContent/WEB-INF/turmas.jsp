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
<title>Cadastro de usuário</title>
</head>
<body>
	<%-- <c:choose>
		<c:when test="${usuario != NULL}">
			<h1>Olá ${usuario.nome}</h1>
		<a href="logout">Logout</a>
		<a href="exibeFormCadastroUsuario">Cadastrar novo usuário</a>
		<a href="listarTodos">Listar todos</a>
		</c:when>

		<c:otherwise>
			<c:if test="${erro != NULL}">${erro}</c:if>

			<form action="login" method="post">
				Usuario:<input name="usuario"> Senha:<input name="senha">
				<input type="submit" value="ok">
			</form>
		</c:otherwise>
	</c:choose>
	<hr>
	${msg}
	<form action="cadastrarUsuario" method="post">
		Usuario:<input name="usuario"> Senha:<input name="senha">
		Nome completo: <input name="nome"> <input type="submit"
			value="ok">
	</form> --%>
	<!-- Dropdown Structure -->
	
	<nav>
	<div class="nav-wrapper">
		<a href="#!" class="brand-logo"><i class="material-icons"></i>OwlPlan</a>
		<ul class="right hide-on-med-and-down">
			<li><a href="#!"><i class="material-icons">email</i></a></li>
			<li><a href="#!"><i class="large material-icons">face</i></a></li>
		</ul>
	</div>
	</nav>
	<br/>
	<a id="btnAddTurma" class="waves-effect waves-light btn-large right sidenav-trigger" data-target="slide-out"><i class="material-icons left">add</i>TURMA</a>
	
	   <!-- turma -->
	    <div id="slide-out" class="sidenav row">
	        <form class="col s12"  action="criarTurma" method="post">
	            
	                <div class="input-field col s6">
	                    <input name="apelidoTurma" id="apelidoTurma" type="text" class="validate"> <label for="apelidoTurma">Apelido da turma</label>
	                </div>
	                
	                <div class="input-field col s6">
	                    <input name="serieTurma" id="serieTurma" type="text" class="validate"> <label for="serieTurma">Série</label>
	                </div>
	                
	                <div class="input-field col s12">
	                    <input name="escolaTurma" id="escolaTurma" type="text" class="validate"> <label for="escolaTurma">Escola</label>
	                </div>
	            
	            <div class="modal-footer">
        	        <button class="btn waves-effect waves-light" type="submit" name="criar">Criar</button>
                </div>
	            
	        </form>
	    </div>
  
	<script src="../js/all.js"></script>

</body>
</html>