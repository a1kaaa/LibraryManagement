package com.a1ka.library.service;

import java.util.List;
import com.a1ka.library.entity.Book;
import com.a1ka.library.exception.BookNotFoundException;
import com.a1ka.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book addBook(Book book) {
        if (book.getTitle() == null || book.getTitle().isBlank() || book.getCategory() == null | book.getCategory().isBlank()) {
            throw new IllegalArgumentException("Must have as non-null: Title, Category ");
        }

        if (book.getAuthor() == null) {
            book.setAuthor("Anonymous");
        }

        return bookRepository.save(book);
    }

    public void removeBook(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new BookNotFoundException("Book not found with id : " + id);
        }
        bookRepository.deleteById(id);
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // GET
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }

    public List<Book> getBooksByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

    public List<Book> getBooksByCategory(String category) {
        return bookRepository.findByCategory(category);
    }




}
