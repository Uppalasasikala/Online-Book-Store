package com.bookstore.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    @OneToMany
    private List<Book> orderedBooks;

    public Order() {
    }

    public Order(Long userId, Date orderDate, List<Book> orderedBooks) {
        this.userId = userId;
        this.orderDate = orderDate;
        this.orderedBooks = orderedBooks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Book> getOrderedBooks() {
        return orderedBooks;
    }

    public void setOrderedBooks(List<Book> orderedBooks) {
        this.orderedBooks = orderedBooks;
    }
}