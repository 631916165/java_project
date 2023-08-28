package com.example.book_manager.service;


import com.example.book_manager.mapper.BookMaper;
import com.example.book_manager.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookMaper bookMaper;


    @Autowired
    public BookService(BookMaper bookMaper) {
        this.bookMaper = bookMaper;
    }

    public List<Book> getAllBooks() {
        return bookMaper.getAllBooks();
    }

    public Book getBookById(Long id) {
        return bookMaper.getBookById(id);
    }

    public void addBook(Book book) {
        bookMaper.addBook(book);
    }

    public void updateBook(Book book) {
        bookMaper.updateBook(book);
    }

    public void deleteBook(Long id) {
        bookMaper.deleteBook(id);
    }
}
