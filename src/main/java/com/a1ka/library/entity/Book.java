package com.a1ka.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Permet de ne pas faire les getters / Setters à la main.
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // Identifiant
    private String title;
    private String author;
    private String category;
    private boolean available = true;   // Le livre est disponible à l'emprunt
}
