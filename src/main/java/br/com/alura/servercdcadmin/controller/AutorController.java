package br.com.alura.servercdcadmin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.servercdcadmin.dao.AutorDAO;
import br.com.alura.servercdcadmin.models.Autor;

@RestController
@CrossOrigin
public class AutorController {

	@GetMapping("api/autores")
	public List<Autor> lista(){
		return AutorDAO.lista();
	}
	
	@PostMapping("api/autores")
	public Autor novoAutor(@RequestBody Autor novoAutor) {
	    return AutorDAO.salvar(novoAutor);
	  }
}
