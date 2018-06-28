package model.javabean;

public class Usuario {
	private String nome, email, senha;
	
	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Usuario(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
