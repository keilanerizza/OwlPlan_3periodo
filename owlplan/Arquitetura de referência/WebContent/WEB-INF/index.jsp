<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">   
<link rel="stylesheet" href="../css/all.css">
<script src="../node_modules/jquery/dist/jquery.min.js"></script>
<script src="../node_modules/materialize-css/dist/js/materialize.min.js"></script>
<link rel="stylesheet" href="../node_modules/materialize-css/dist/css/materialize.min.css">
<title>OwlPlan</title>

</head>
<body>
    
    <nav>
        <div class="nav-wrapper">
            <a href="#!" class="brand-logo">OwlPlan</a>
            <a href="#" data-target="mobile-demo" class="sidenav-trigger"><i class="material-icons">menu</i></a>
            <ul class="right hide-on-med-and-down">
                <li><a data-target="modalCadastro" class="modal-trigger">Cadastro</a></li>
                <li><a data-target="modalLogin" class="modal-trigger">Login</a></li>
                <li><a href="#">Contato</a></li>
            </ul>
        </div>
    </nav>
    
    <ul class="sidenav" id="mobile-demo">
        <li><a class="waves-effect"  data-target="modalCadastro">Cadastro</a></li>
        <li><a class="waves-effect" data-target="modalLogin">Login</a></li>
        <li><a class="waves-effect" href="#">Contato</a></li>
    </ul>

<!-- login -->
	
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
    
    <div class="row center slogam">
        <div class="col s12 m12">
            <h3 class="darken-3">OwlPlan</h3>
            <h4 class="darken-3">
                A forma mais fácil de criar um plano de aula
            </h4>
        </div>
    </div>
    
    <div class="container">
        <div class="row">
            <div class="col s12 m4">
                <div class="card-panel center advantage waves-effect">
                    <i class="material-icons">view_carousel</i>
                    <p class="promo-caption">Gerenciar turmas</p>
                    <p class="light center">Adicionar, consultar, editar ou excluir uma turma de maneira simples</p>
                </div>
            </div>
            <div class="col s12 m4">
                <div class="card-panel center advantage waves-effect">
                    <i class="material-icons">stars</i>
                    <p class="promo-caption">Planejamentos customizados</p>
                    <p class="light center">Criar planejamentos com base em layouts pré-definidos</p>
                </div>
            </div>
            <div class="col s12 m4">
                <div class="card-panel center advantage waves-effect">
                    <i class="material-icons">share</i>
                    <p class="promo-caption">Compartilhar Documentos</p>
                    <p class="light center">Exportar, salvar ou enviar via rede social o planejamento criado</p>
                </div>
            </div>
        </div>
        
    </div>
    
    
    <footer class="page-footer">
        <div class="footer-copyright">
            <div class="container">
                <a class="link-profile waves-effect" href="https://github.com/keilanerizza">
                    © 2018 Made by Keilane Rizza
                </a>
                <a class="waves-effect right" href="https://github.com/keilanerizza/OwlPlan">
                    <svg height="32" class="octicon octicon-mark-github" viewBox="0 0 16 16" version="1.1" width="32" aria-hidden="true"><path fill-rule="evenodd" d="M8 0C3.58 0 0 3.58 0 8c0 3.54 2.29 6.53 5.47 7.59.4.07.55-.17.55-.38 0-.19-.01-.82-.01-1.49-2.01.37-2.53-.49-2.69-.94-.09-.23-.48-.94-.82-1.13-.28-.15-.68-.52-.01-.53.63-.01 1.08.58 1.23.82.72 1.21 1.87.87 2.33.66.07-.52.28-.87.51-1.07-1.78-.2-3.64-.89-3.64-3.95 0-.87.31-1.59.82-2.15-.08-.2-.36-1.02.08-2.12 0 0 .67-.21 2.2.82.64-.18 1.32-.27 2-.27.68 0 1.36.09 2 .27 1.53-1.04 2.2-.82 2.2-.82.44 1.1.16 1.92.08 2.12.51.56.82 1.27.82 2.15 0 3.07-1.87 3.75-3.65 3.95.29.25.54.73.54 1.48 0 1.07-.01 1.93-.01 2.2 0 .21.15.46.55.38A8.013 8.013 0 0 0 16 8c0-4.42-3.58-8-8-8z"></path></svg>
                </a>
            </div>
        </div>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0-rc.2/js/materialize.min.js"></script>
	<script src="../js/all.js"></script>
</body>
</html>