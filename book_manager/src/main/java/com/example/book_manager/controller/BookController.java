package com.example.book_manager.controller;


import com.example.book_manager.pojo.Book;
import com.example.book_manager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/sou/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
        System.out.println("添加成功。。。。。。。。。。");
    }

    @PutMapping("/update/{id}")
    public void updateBook(@PathVariable Long id,@RequestBody Book book) {
        bookService.updateBook(book);
        System.out.println("更新成功。。。。。。。。。");
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        System.out.println("删除成功。。。。。。。");
    }
}
