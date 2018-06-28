package model.javabean;

public class Pedagoga extends Usuario {
	
	private String sexo, nascimento;

	public Pedagoga(String nome, String email, String senha, String sexo, String nascimento) {
		super(nome, email, senha);
		this.sexo = sexo;
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
}
