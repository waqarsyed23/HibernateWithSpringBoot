package com.hib;

import javax.persistence.*;

/**
 * Created by WS on 20/1/17.
 */
//This is the entity class. Table Book is created in DB
//Use Entity annotation to tell hibernate to map this class to table Book
@Entity
@Table(name = "bookStore")
public class Book {

    //All these are the columns of the table Book
    //Hibernate can automatically map the attribute with the column name which has same name
    //For attributes which has different name then that of column name - use the column annotation to
    //specify which column name is mapped with this attribute

    //This is the id column so strategy is defined for auto incrementing the column value with below 2 annotations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private long id;

    @Column(name = "author")
    private String author;
    @Column(name = "price")
    private float price;
    @Column(name = "title")
    private String title;

    public Book(){

    }

    public Book(long id, String author, float price, String title) {
        this.id = id;
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
