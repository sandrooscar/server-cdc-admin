package br.com.alura.servercdcadmin.models;



import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Valid
public class Autor {
	
	private Integer id;
	@NotNull(message="Nome é obrigatório") 
	@NotEmpty(message="Nome não pode ser vazio")
	private String nome;
	@NotEmpty(message="Nome não pode ser vazio")
	@NotNull(message="E-mail é obrigatório") 
	private String email;
	@JsonIgnore
	@NotEmpty(message="Senha não pode ser vazia")
	@NotNull(message="Senha é obrigatório") 
	@Size(min=3, message="Senha deve conter no minimo 3 digitos")
	private String senha;
	
	public Autor(Integer id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

}
