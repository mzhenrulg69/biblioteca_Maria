package com.example.biblioteca.Entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Libro")
public class Libro {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column
    private String autor;
}
