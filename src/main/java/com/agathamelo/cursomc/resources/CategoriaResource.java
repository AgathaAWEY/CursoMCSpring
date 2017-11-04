package com.agathamelo.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Uma classe controladora rest 
 * @author Agatha Santos Silva
 *
 */

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando";
	}
	
}
