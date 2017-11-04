package com.agathamelo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agathamelo.cursomc.domain.Categoria;
 
/** 
 * Categoria Interface Repository 
 * Camada de acesso a dados Categoria 
 * (Repository or DAO)
 **/

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	
	
}
