package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.PedagogaDAO;
import model.javabean.Pedagoga;

public class CriarPedagoga implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Pedagoga pedagoga = new Pedagoga(request.getParameter("nomeCadastro"),
				request.getParameter("emailCadastro"), 
				request.getParameter("senhaCadastro"), 
				request.getParameter("sexoCadastro"),
				request.getParameter("nascimentoCadastro"));

		String email = request.getParameter("emailCadastro");
		request.getSession().setAttribute("email", email);

		new PedagogaDAO().salvar(pedagoga);

		request.setAttribute("msg", "parabéns usuario cadastrado com sucesso");
		return "turmas";
	}

}
