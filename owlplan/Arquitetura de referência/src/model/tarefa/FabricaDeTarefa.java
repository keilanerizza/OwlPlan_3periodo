package model.tarefa;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class FabricaDeTarefa {

	static Map<String, Tarefa> tarefas = new HashMap<String, Tarefa>();
	static {
		tarefas.put("POST/login", new LoginTarefa());
		tarefas.put("GET/logout", new LogoutTarefa());
		tarefas.put("POST/alterarTurma", new AlterarTurma());
		tarefas.put("POST/alterarUsuario", new AlterarUsuario());
		tarefas.put("GET/buscarTurma", new BuscarTurma());
		tarefas.put("GET/buscarUsuario", new BuscarUsuario());
		tarefas.put("POST/criarTurma", new CriarTurma());
		tarefas.put("POST/criarPedagoga", new CriarPedagoga());
		tarefas.put("GET/excluirTurma", new ExcluirTurma());
		tarefas.put("GET/excluirUsuario", new ExcluirUsuario());
	}

	public static Tarefa getTarefa(HttpServletRequest request) {
		Tarefa tarefa = tarefas.get(request.getMethod() + request.getPathInfo());
		if (tarefa != null)
			return tarefa;
		else
			return new NULLTarefa();
	}
}
