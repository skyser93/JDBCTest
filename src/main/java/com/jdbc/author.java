package com.jdbc;

public class author {
    private int id;
    private String last_name;
    private String first_name;


    public author() {
    }

    public author(int id, String last_name, String first_name) { //передача аргументов через параметры
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;

    }

    @Override
    public String toString() {
        return "Product [" + id + "\t" + last_name + "\t" + first_name + "]";
    }
}
