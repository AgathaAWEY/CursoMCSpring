package com.agathamelo.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.agathamelo.cursomc.domain.Categoria;


/**
 * Uma classe controladora rest 
 * @author Agatha Santos Silva
 *
 */

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria catInformatica = new Categoria(1, "Informatica");
		Categoria catEscritorio = new Categoria(2, "Escritorio");
		
		List<Categoria> categorias = new ArrayList<>();
		
		categorias.add(catInformatica);
		categorias.add(catEscritorio);
		
		return categorias;
	}
	
}
