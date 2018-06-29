package model.javabean;

public class Escola {
	private String nome;
	private int id_escola;

	public Escola(String nome, int id_escola) {
		super();
		this.nome = nome;
		this.id_escola = id_escola;
	}

	public int getId_escola() {
		return id_escola;
	}

	public void setId_escola(int id_escola) {
		this.id_escola = id_escola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
