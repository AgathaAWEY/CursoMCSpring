package com.awey.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.awey.cursomc.domain.Estado;
 
/** 
 * Categoria Interface Repository 
 * Camada de acesso a dados Estado 
 * (Repository or DAO)
 **/

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

	
	
}
