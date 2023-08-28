package com.example.book_manager.pojo;

public class Book {

    private Long id;//id编号
    private String title;//书名
    private  String author;//作者

    //无参构造和有参构造
    public Book() {

    }

    public Book(Long id,String title,String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
