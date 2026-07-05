package com.a1ka.library.repository;

import com.a1ka.library.entity.Book;
import com.a1ka.library.entity.Borrow;
import com.a1ka.library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {
    // Requêtes métier
    List<Borrow> findByUserAndReturnDateIsNull(User user); // Emprunts actifs de l'user
    boolean existsByUserAndReturnDateIsNull(User user); // Un user emprunte actuellement un livre ?
    boolean existsByBookAndReturnDateIsNull(Book book); // Le livre est déjà emprunté ?

    // Autres
    List<Borrow> findByBook(Book book);
    List<Borrow> findByUser(User user);
}
