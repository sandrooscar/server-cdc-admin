package br.com.alura.servercdcadmin.controller.forms;

import java.math.BigDecimal;

import br.com.alura.servercdcadmin.dao.AutorDAO;
import br.com.alura.servercdcadmin.models.Livro;

public class LivroForm {

	private String titulo;
	private BigDecimal preco;
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
