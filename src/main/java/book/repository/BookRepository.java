package book.repository;

import book.entitiy.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll();
    Book save (Book book);
    Book delete (Book book);
}
