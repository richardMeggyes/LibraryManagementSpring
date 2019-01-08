package com.readdeo.vehiclectracker.vehicletracker.model;

import javax.persistence.*;

@Entity
@Table(name = "book", schema = "public")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "author")
    private String author;

    @Column(name = "title", unique = true)
    private String title;

    public Book() {
    }

    public Book(String name) {
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }
}
