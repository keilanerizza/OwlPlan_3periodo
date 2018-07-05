package model.javabean;

public class Plano {
	String id_plan, imagem, id_turma, id_layout;

	public Plano(String id_plan, String imagem, String id_turma, String id_layout) {
		super();
		this.id_plan = id_plan;
		this.imagem = imagem;
		this.id_turma = id_turma;
		this.id_layout = id_layout;
	}

	public String getId_plan() {
		return id_plan;
	}

	public void setId_plan(String id_plan) {
		this.id_plan = id_plan;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getId_turma() {
		return id_turma;
	}

	public void setId_turma(String id_turma) {
		this.id_turma = id_turma;
	}

	public String getId_layout() {
		return id_layout;
	}

	public void setId_layout(String id_layout) {
		this.id_layout = id_layout;
	}
	
	
}
