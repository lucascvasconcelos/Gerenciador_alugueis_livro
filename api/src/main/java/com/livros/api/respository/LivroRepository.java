package com.livros.api.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.api.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	Livro findById(long id);
}
