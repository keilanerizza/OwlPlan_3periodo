package model.javabean;

public class Escola {
	private String nome;
	private String id_escola;

	public Escola(String nome, String id_escola) {
		super();
		this.nome = nome;
		this.id_escola = id_escola;
	}

	public String getId_escola() {
		return id_escola;
	}

	public void setId_escola(String id_escola) {
		this.id_escola = id_escola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
