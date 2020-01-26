package br.com.alura.servercdcadmin.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import br.com.alura.servercdcadmin.models.Autor;

public class AutorDAO {
	private static List<Autor> lista = new ArrayList<>();
	private static int id = 0;
	static {
		id++;
		lista.add(new Autor(id,"Tolkien", "tolkien@terra.com.br", "123"));
		id++;
		lista.add(new Autor(id,"J. K. Rowling", "rowling@terra.com.br", "789"));
		id++;
		lista.add(new Autor(id,"João Carlos Marinho", "marinho@terra.com.br", "0011"));
	}
	
	public static List<Autor> lista(){
		return lista;
	}
	
	public static Autor salvar(Autor novoAutor) {
		id++;
		Autor autor = new Autor(id, novoAutor.getNome(), novoAutor.getEmail(), novoAutor.getSenha());
		lista.add(autor);
		return autor;
	}
	
	
	public static Autor procurarPorId(int id) {
		Stream<Autor> stream = lista.stream().filter(autor -> autor.getId() == id);
		return stream.findFirst().get();
	}
}
