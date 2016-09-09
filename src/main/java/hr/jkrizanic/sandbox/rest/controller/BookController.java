package hr.jkrizanic.sandbox.rest.controller;

import hr.jkrizanic.sandbox.rest.Book;
import hr.jkrizanic.sandbox.rest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jkrizanic on 09/09/16.
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Book> getAllBooks() {
       return this.bookService.getAllBooks();
    }
}
