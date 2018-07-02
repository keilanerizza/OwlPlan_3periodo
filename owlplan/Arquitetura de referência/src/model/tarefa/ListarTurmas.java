package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.TurmaDAO;
import model.javabean.Turma;

public class ListarTurmas {

public void getTurmas(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Turma> lista = new TurmaDAO(request).listarTodos();
		request.setAttribute("turmas", lista);

	}

}
