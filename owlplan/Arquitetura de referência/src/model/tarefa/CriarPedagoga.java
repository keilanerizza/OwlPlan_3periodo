package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.PedagogaDAO;
import model.javabean.Pedagoga;

public class CriarPedagoga implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// recuperar os parametros do formulario
		Pedagoga pedagoga = new Pedagoga(request.getParameter("nomeCadastro"),
				request.getParameter("emailCadastro"), 
				request.getParameter("senhaCadastro"), 
				request.getParameter("sexoCadastro"),
				request.getParameter("nascimentoCadastro"));
		// enviar dados para o DAO persistir
		new PedagogaDAO().salvar(pedagoga);
		//retornar o nome da view
		request.setAttribute("msg", "parabéns usuario cadastrado com sucesso");
		return "turmas";
	}

}
