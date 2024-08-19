package book.service;

import book.entitiy.Book;
import book.repository.BookRepositoryimp;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();

    Book findById(Long id);

    Book deleteById();

    }

