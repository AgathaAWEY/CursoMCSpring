package com.agathamelo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agathamelo.cursomc.domain.Categoria;
import com.agathamelo.cursomc.repositories.CategoriaRepository;
import com.agathamelo.cursomc.services.exceptions.ObjectNotFoundException;

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
