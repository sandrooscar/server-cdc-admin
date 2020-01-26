package br.com.alura.servercdcadmin.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.servercdcadmin.models.Livro;

public class LivroDAO {
	private static List<Livro> lista = new ArrayList<>();
	private static int id = 0;
	static {
		id++;
		lista.add(new Livro(id,"Senhor dos Aneis - Sociedade do anel", new BigDecimal(150), AutorDAO.procurarPorId(1)));
		id++;
		lista.add(new Livro(id,"Senhor dos Aneis - As duas torres", new BigDecimal(200), AutorDAO.procurarPorId(1)));
		id++;
		lista.add(new Livro(id,"O Gênio do Crime", new BigDecimal(150), AutorDAO.procurarPorId(3)));
		id++;
		lista.add(new Livro(id,"Harry Potter - A pedra filosofal", new BigDecimal(150), AutorDAO.procurarPorId(2)));
	}
	
	public static List<Livro> lista(){
		return lista;
	}
	
	public static Livro salvar(Livro novoLivro) {
		id++;
		novoLivro.setId(id);
		lista.add(novoLivro);
		return novoLivro;
	}	
}
