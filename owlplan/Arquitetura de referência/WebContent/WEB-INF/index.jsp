<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="../node_modules/jquery/dist/jquery.min.js"></script>
<script src="../node_modules/materialize-css/dist/js/materialize.min.js"></script>
<link rel="stylesheet"
	href="../node_modules/materialize-css/dist/css/materialize.min.css">
<title>Arquitetura de referência</title>
</head>
<body>

	<%-- 	<c:choose>
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
	</c:choose> --%>

	<!-- login -->
	
	 <button data-target="modalLogin" class="btn modal-trigger">LOGIN</button>
    
    <div id="modalLogin" class="modal">
		<div class="modal-content">
			<form class="col s12" action="login" method="post">
			
				<div class="input-field col s12">
					<input name="emailLogin" id="emailLogin" placeholder="" type="text" class="validate"> <label for="emailLogin">Email</label>
				</div>

				<div class="input-field col s12">
					<input name="senhaLogin" id="senhaLogin" placeholder="" type="password" class="validate"> <label for="senhaLogin">Senha</label>
				</div>
				
				<div class="modal-footer">
					<button class="btn waves-effect waves-light" type="submit" name="logar">Logar</button>
				</div>
		
			</form>
		</div>
		
	</div>
	
	<!-- login -->

	<!-- cadastro -->
	
	<button data-target="modalCadastro" class="btn modal-trigger">CADASTRO</button>
    
    <div id="modalCadastro" class="modal">
        <div class="modal-content">
            <div class="row">
				<form class="col s12" action="criarPedagoga" method="post">
		
					<div class="row">
						<div class="input-field col s6">
							<input name="nomeCadastro" id="nomeCadastro" placeholder="" type="text" class="validate"> <label for="nomeCadastro">Nome completo</label>
						</div>
						<div class="input-field col s6">
							<input name="emailCadastro" id="emailCadastro" placeholder="" type="text" class="validate"> <label for="emailCadastro">Email</label>
						</div>
					</div>
		
					<div class="row">
						<div class="input-field col s6">
							<div class="input-field col s3">
								<label> <input name="sexoCadastro" type="radio" value="F" checked /> <span>F</span>
								</label>
							</div>
							<div class="input-field col s6">
								<label> <input name="sexoCadastro" type="radio" value="M" />
									<span>M</span>
								</label>
							</div>
						</div>
						<div class="input-field col s6">
							<input name="nascimentoCadastro" type="text" placeholder="" class="datepicker"> <label for="nascimento">Data de nascimento:</label>
						</div>
					</div>
		
					<div class="row">
						<div class="input-field col s6">
							<input name="senhaCadastro" id="senhaCadastro" placeholder="" type="password" class="validate"> <label for="senhaCadastro">Senha</label>
						</div>
		
						<div class="input-field col s6">
							<input name="confirmSenha" id="confirmSenha" placeholder="" type="password" class="validate"> <label for="confirmSenha">Confirmar senha</label>
						</div>
					</div>

					<div class="modal-footer">
                        <button class="btn waves-effect waves-light" type="submit" name="cadastrar">Cadastrar</button>
                    </div>
		
				</form>
			</div>
		</div>
	</div>

	<!-- cadastro -->

	<script src="../js/all.js"></script>

</body>
</html>

