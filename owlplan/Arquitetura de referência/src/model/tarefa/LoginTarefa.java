package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.PedagogaDAO;
import model.javabean.Usuario;

public class LoginTarefa implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String email = request.getParameter("emailLogin");
		String senha = request.getParameter("senhaLogin");
		Usuario usuario = new PedagogaDAO().busca(email, senha);

		if (usuario != null) {
			request.getSession().setAttribute("usuario", usuario);
			return "turmas";
		} else {
			request.setAttribute("erro", "Nome de usuário/senha errado. Tente novamente.");
			return "index";
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tarefa Login";
	}
}
