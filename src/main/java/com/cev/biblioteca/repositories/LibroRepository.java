package com.cev.biblioteca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cev.biblioteca.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String>{
	//Implementar las métricas necesarias
	
	public List<Libro> findByAutor_nif(String nif);
	public List<Libro> findByTitulo (String titulo);
	public List<Libro> findByPaginas (int paginas);
	public List<Libro> findByPaginasGreaterThan (int paginas);
	
}
