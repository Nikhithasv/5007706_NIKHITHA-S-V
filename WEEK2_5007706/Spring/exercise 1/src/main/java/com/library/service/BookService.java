package com.library.service;

/**
 *
 * @author nikhi
 */
import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }

    public void service() {
        System.out.println("Working");
        bookRepository.performRepositoryAction();
    }
}
