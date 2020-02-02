package br.com.alura.servercdcadmin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.servercdcadmin.controller.forms.LivroForm;
import br.com.alura.servercdcadmin.dao.LivroDAO;
import br.com.alura.servercdcadmin.models.Livro;

@RestController
@CrossOrigin
public class LivroController {

	@GetMapping("api/livros")
	public List<Livro> lista(){
		return LivroDAO.lista();
	}
	
	@PostMapping("api/livros")
	public Livro novoLivro(@Valid @RequestBody LivroForm novoLivro) {
	    return LivroDAO.salvar(novoLivro.build());
	  }
}
