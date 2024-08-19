package book.controller;

import book.entitiy.Book;
import book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
public class BookController {
    private final BookService service;
@Autowired
    public BookController(BookService service) {
        this.service = service;
    }
    @GetMapping("/book")
    public List<Book> getAllBooks(){
    return service.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book findById(@PathVariable Long id){
    Book book = service.findById(id);
    return book;
    }

    @DeleteMapping("/book/{id}")
   public Book delete(@PathVariable Long id){
     Book book = service.deleteById();
     return book;
    }


}
