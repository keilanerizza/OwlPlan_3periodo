package model.javabean;

public class Turma {
	private String apelido, serie, periodo, escola;

	public Turma(String apelido, String serie, String periodo, String escola) {
		super();
		this.apelido = apelido;
		this.serie = serie;
		this.periodo = periodo;
		this.escola = escola;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
 
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	
}
