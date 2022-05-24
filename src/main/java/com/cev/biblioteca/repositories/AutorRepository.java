package com.cev.biblioteca.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cev.biblioteca.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, String> {
	//Implementar las métricas necesarias
}
