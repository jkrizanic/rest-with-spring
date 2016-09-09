package hr.jkrizanic.sandbox.rest.service;

import hr.jkrizanic.sandbox.rest.Book;

import java.util.List;

/**
 * Created by jkrizanic on 09/09/16.
 */
public interface BookService {

    List<Book> getAllBooks();

    Book getBookByName(String name);

    void addBook (Book book);
}
