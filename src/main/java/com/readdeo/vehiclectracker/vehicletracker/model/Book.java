//package com.readdeo.vehiclectracker.vehicletracker.model;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "book", schema = "public")
//public class Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private int id;
//
//    @Column(name = "title")
//    private String title;
//
//    @Column(name = "publishers")
//    private String publishers;
//
//    @Column(name = "key")
//    private String key;
//
//    @Column(name = "identifiers")
//    private String identifiers;
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getPublishers() {
//        return publishers;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public String getIdentifiers() {
//        return identifiers;
//    }
//
//    public String getLanguages() {
//        return languages;
//    }
//
//    public String getNumber_of_pages() {
//        return number_of_pages;
//    }
//
//    public String getIsbn_10() {
//        return isbn_10;
//    }
//
//    public String getPublish_date() {
//        return publish_date;
//    }
//
//    public String getAuthors() {
//        return authors;
//    }
//
//    public String getSubjects() {
//        return subjects;
//    }
//
//    @Column(name = "languages")
//    private String languages;
//
//    @Column(name = "number_of_pages")
//    private String number_of_pages;
//
//    @Column(name = "isbn_10")
//    private String isbn_10;
//
//    @Column(name = "publish_date")
//    private String publish_date;
//
//    @Column(name = "authors")
//    private String authors;
//
//    @Column(name = "subjects")
//    private String subjects;
//
//    public Book() {
//    }
//
//    public Book(String title, String publishers, String key, String identifiers, String languages, String number_of_pages, String isbn_10, String publish_date, String authors, String subjects) {
//        this.title = title;
//        this.publishers = publishers;
//        this.key = key;
//        this.identifiers = identifiers;
//        this.languages = languages;
//        this.number_of_pages = number_of_pages;
//        this.isbn_10 = isbn_10;
//        this.publish_date = publish_date;
//        this.authors = authors;
//        this.subjects = subjects;
//    }
//
//    public int getId() {
//        return id;
//    }
//}
