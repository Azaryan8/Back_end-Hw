package book.repository;

import book.entitiy.Book;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BookRepositoryimp implements BookRepository {

    List<Book> db = List.of(
            new Book("1L","Jack London",1993),
            new Book("2L","Dostoevskiy",1994),
            new Book("3L","Pushkin",1995),
            new Book("4L","Jorja Smith",1995)

    );

    @Override
    public List<Book> findAll() {
        return db;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public Book delete(Book book) {
        return null;
    }
}
