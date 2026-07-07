package com.a1ka.library.repository;

import com.a1ka.library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> { // Notre Book et Long car c'est le type de la clé primaire
    List<Book> findByAuthor(String author);
    List<Book> findByCategory(String category);
    List<Book> findByTitle(String title);
    List<Book> findByAvailableTrue();
}
