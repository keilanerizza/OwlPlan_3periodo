package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EscolaDAO;
import model.javabean.Escola;

public class ListarEscolas{

	public void getEscolas(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Escola> lista = new EscolaDAO().listarTodos();
		request.setAttribute("escolas", lista);

	}
}
