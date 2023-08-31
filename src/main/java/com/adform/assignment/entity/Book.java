package com.adform.assignment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_domain")
    private String bookDomain;

    @Column(name = "price")
    private int price;

    public Book(){}

    public Book(String bookName, String bookDomain, int price) {
        this.bookName = bookName;
        this.bookDomain = bookDomain;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDomain() {
        return bookDomain;
    }

    public void setBookDomain(String bookDomain) {
        this.bookDomain = bookDomain;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookDomain='" + bookDomain + '\'' +
                ", price=" + price +
                '}';
    }
}
