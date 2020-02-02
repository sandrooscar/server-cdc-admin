package br.com.alura.servercdcadmin.controller.forms;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import br.com.alura.servercdcadmin.dao.AutorDAO;
import br.com.alura.servercdcadmin.models.Livro;

@Valid
public class LivroForm {

	@NotNull(message="O título do livro não pode ser nulo") 
	@NotEmpty(message="O título do livro não pode ser vazio") 
	private String titulo;

	@NotNull(message="O preço do livro não pode ser nulo") 
	private BigDecimal preco;

	@NotNull(message="O autor do livro não pode ser nulo") 
	private Integer autorId;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Integer getAutorId() {
		return autorId;
	}
	public void setAutorId(Integer autorId) {
		this.autorId = autorId;
	}
	
	public Livro build(){
		return new Livro(titulo, preco, AutorDAO.procurarPorId(autorId));
	}
	
}
