package br.com.alura.servercdcadmin.models;
import java.math.BigDecimal;

public class Livro {

	private Integer id;
	private String titulo;
	private BigDecimal preco;
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
