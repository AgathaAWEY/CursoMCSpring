package com.awey.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.awey.cursomc.domain.Categoria;
import com.awey.cursomc.services.CategoriaService;


/**
 * Uma classe controladora rest 
 * @author Agatha Santos Silva
 *
 */

/**
 * Controlador Rest Resource
 * @author Agatha Santos Silva
 *
 */
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	/**O endpoint desse metodo recebe um id */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		// acessar o servico para fazer a pesquisa
		Categoria foundCategoria = service.buscar(id);
		return ResponseEntity.ok().body(foundCategoria);
	}
	
}
