package org.generation.Farmacia.repository;

import java.util.List;

import org.generation.Farmacia.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
public List<Categoria> findAllByDescricaoContainingIgnoreCase(String Categoria);

	
}
