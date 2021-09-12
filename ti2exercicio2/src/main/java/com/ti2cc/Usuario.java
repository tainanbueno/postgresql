package com.ti2cc;

public class Usuario {
	private int codigo;
	private String nome;
	private String telefone;
	private String email;
	private String senha;
	
	public Usuario() {
		this.codigo = 0;
		this.nome = "";
		this.telefone = "";
		this.email = "";
		this.senha = "";
	}
	public Usuario(int codigo, String nome, String telefone, String email, String senha) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario: [codigo = "+codigo+" ,Nome = "+nome+" ,Telefone = "+telefone+" ,E-mail = "+email+" ,Senha = "+senha+"]";
	}	
}


