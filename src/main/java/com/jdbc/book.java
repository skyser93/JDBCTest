package com.jdbc;

public class book {
    private int id;
    private String title;
    private String isbn;


    public  book(){}
    public book(int id, String title, String isbn){
        this.id = id;
        this.title = title;
        this.isbn = isbn;

    }

    @Override
    public String toString(){
        return "Book [" + id + "\t" + title + "\t" + isbn + "]";

    }
}
