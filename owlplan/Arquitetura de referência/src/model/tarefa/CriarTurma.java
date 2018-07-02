package model.tarefa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.TurmaDAO;
import model.javabean.Turma;

public class CriarTurma implements Tarefa{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Turma turma = new Turma(
			request.getParameter("apelidoTurma"),
			request.getParameter("serieTurma"), 
			request.getParameter("periodoTurma"),
			request.getParameter("escolaTurma"));
		
		new TurmaDAO(request).salvar(turma);

		request.setAttribute("msg", "parabéns usuario cadastrado com sucesso");
		return "turmas";
		
	}
}
