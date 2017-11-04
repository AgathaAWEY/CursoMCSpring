package com.awey.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awey.cursomc.domain.Cidade;
 
/** 
 * Categoria Interface Repository 
 * Camada de acesso a dados Cidade 
 * (Repository or DAO)
 **/

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

	
	
}
