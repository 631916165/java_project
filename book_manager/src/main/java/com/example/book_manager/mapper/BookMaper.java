package com.example.book_manager.mapper;

import com.example.book_manager.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface BookMaper {

    List<Book> getAllBooks();
    Book getBookById(Long id);
    void  addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Long id);
}
