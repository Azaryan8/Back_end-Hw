package book.service;

import book.entitiy.Book;
import book.repository.BookRepository;
import book.repository.BookRepositoryimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImp implements BookService {
    private final BookRepository repository;

    @Autowired

    public BookServiceImp(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Book> getAllBooks() {
        return null;
    }


    @Override
    public Book findById(Long id) {
        return repository.findAll()
                .stream()
                .filter(book -> book.getId().equals(id))
                .findAny()
                .get();
    }

    @Override
    public void deleteById() {
      Book book = findById(id);
      repository.delete(book);

    }

    //Book book = findById(id); // Используем ранее созданный метод для поиска книги по ID
      //  repository.delete(book);
        //return book;
}
