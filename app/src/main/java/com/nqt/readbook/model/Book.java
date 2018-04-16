package com.nqt.readbook.model;

/**
 * Created by USER on 4/16/2018.
 */

public class Book {
    private String titleImage;
    private String title;
    private String author;
    private String year;
    private String view;

    public Book() {
    }

    public Book(String titleImage, String title, String author, String year, String view) {

        this.titleImage = titleImage;
        this.title = title;
        this.author = author;
        this.year = year;
        this.view = view;
    }

    public String getTitleImage() {
        return titleImage;
    }

    public void setTitleImage(String titleImage) {
        this.titleImage = titleImage;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
}
