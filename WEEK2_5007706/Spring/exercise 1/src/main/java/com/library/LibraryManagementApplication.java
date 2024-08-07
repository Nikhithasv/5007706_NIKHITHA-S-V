package com.library;

/**
 *
 * @author nikhi
 */
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        BookService bs = new BookService();
        bs.service();
    }
}
