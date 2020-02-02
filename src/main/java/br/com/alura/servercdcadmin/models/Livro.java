package br.com.alura.servercdcadmin.models;
import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Valid
public class Livro {

	private Integer id;
	@NotNull(message="O título do livro não pode ser nulo") 
	@NotEmpty(message="O título do livro não pode ser vazio") 
	private String titulo;

	@NotNull(message="O preço do livro não pode ser nulo") 
	private BigDecimal preco;
	
	@NotNull(message="O autor do livro não pode ser nulo") 
	private Autor autor;
	
	/**
	 * @deprecated
	 */
	public Livro() {

	}
	
	public Livro(Integer id, String titulo, BigDecimal preco, Autor autor) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
	}

	public Livro(String titulo, BigDecimal preco, Autor autor) {
		super();
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
