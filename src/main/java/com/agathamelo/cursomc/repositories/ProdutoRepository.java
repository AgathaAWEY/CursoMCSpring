package com.agathamelo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agathamelo.cursomc.domain.Produto;
 
/** 
 * Categoria Interface Repository 
 * Camada de acesso a dados Produto 
 * (Repository or DAO)
 **/

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

	
	
}
