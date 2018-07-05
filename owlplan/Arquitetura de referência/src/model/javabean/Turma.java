package model.javabean;

public class Turma {
	private String id_turma, apelido, novoApelido, serie, periodo, id_pedagoga, escola;
	
	public Turma(String apelido, String novoApelido, String serie, String periodo, String escola) {
		super();
		this.apelido = apelido;
		this.novoApelido = novoApelido;
		this.serie = serie;
		this.periodo = periodo;
		this.escola = escola;
	}
	
	public Turma(String apelido, String serie, String periodo, String escola) {
		super();
		this.apelido = apelido;
		this.serie = serie;
		this.periodo = periodo;
		this.escola = escola;
	}

	public Turma(String id_turma, String apelido, String serie, String periodo, String id_pedagoga, String escola) {
		super();
		this.id_turma = id_turma;
		this.apelido = apelido;
		this.serie = serie;
		this.periodo = periodo;
		this.escola = escola;
		this.id_pedagoga = id_pedagoga;
	}

	public String getId_turma() {
		return id_turma;
	}

	public void setId_turma(String id_turma) {
		this.id_turma = id_turma;
	}

	public String getId_pedagoga() {
		return id_pedagoga;
	}

	public void setId_pedagoga(String id_pedagoga) {
		this.id_pedagoga = id_pedagoga;
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

	public String getNovoApelido() {
		return novoApelido;
	}

	public void setNovoApelido(String novoApelido) {
		this.novoApelido = novoApelido;
	}
	
	
}
