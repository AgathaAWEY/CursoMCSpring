package com.awey.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awey.cursomc.domain.Categoria;
import com.awey.cursomc.repositories.CategoriaRepository;
import com.awey.cursomc.services.exceptions.ObjectNotFoundException;

/**
 * The Categoria Service class
 * @author Agatha Santos Silva
 *
 */
@Service
public class CategoriaService {

	/* @Autowired dependencia sera automaticamente instanciada atraves de 
	 *  Injecao de Dependencia ou Inversao de Controller do Spring*/
	@Autowired  
	private CategoriaRepository repository;
	
	public Categoria buscar(Integer id) {
		
		Categoria objCategoria = repository.findOne(id);
		
		if (objCategoria == null) {
			// Lança uma excecao no caso do ID nao existir
			throw new ObjectNotFoundException("Objeto não encontrado! id: " + id
					+ " , Tipo: " + Categoria.class.getName());
		}
		
		return objCategoria;
	}
	
	
}
