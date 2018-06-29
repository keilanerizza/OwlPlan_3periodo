package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EscolaDAO;
import model.dao.TurmaDAO;
import model.javabean.Escola;
import model.javabean.Turma;

public class CriarTurma implements Tarefa{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Turma turma = new Turma(
			request.getParameter("apelidoTurma"),
			request.getParameter("serieTurma"), 
			request.getParameter("periodoTurma"),
			request.getParameter("escolaTurma"));
		new TurmaDAO().salvar(turma);

		request.setAttribute("msg", "parabéns usuario cadastrado com sucesso");
		return "turmas";
		
	}
}
