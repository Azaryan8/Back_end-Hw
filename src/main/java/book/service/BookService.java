package book.service;

import book.entitiy.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book findById(Long id);
}
