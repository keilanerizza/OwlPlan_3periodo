package model.tarefa;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.EscolaDAO;
import model.javabean.Escola;

public class ListarEscolas implements Tarefa{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List<Escola> lista = new EscolaDAO().listarTodos();
		System.out.println(lista);
		request.setAttribute("escolas", lista);
		return "turmas";
	}

}
