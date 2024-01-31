package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	public List<Produto> findAllByValidadeAfter(LocalDate data);
	
	public List<Produto> findAllByValidadeBefore(LocalDate data);
	
	public List<Produto> findAllByPrecoLessThanEqual(BigDecimal preco);
	
	public List<Produto> findAllByPrecoGreaterThanEqual(BigDecimal preco);
	
}
