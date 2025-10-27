package com.example.biblioteca.repository;

import com.example.biblioteca.Entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    @Query(name= "SELECT l FROM Libro l")
    List<Libro> listaLibros();
}
