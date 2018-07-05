package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.PedagogaDAO;
import model.dao.PlanoDAO;
import model.javabean.Plano;
import model.javabean.Turma;

public class ListarPlanos implements Tarefa {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Plano> lista = new PlanoDAO().listarTodos();
		
		return "planos";
	}

}
