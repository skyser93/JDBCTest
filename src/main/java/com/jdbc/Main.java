package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private  static final String USERNAME = "root";
    private  static final String PASSWORD = "root";
    private  static final String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";


    public static void main(String[] args) throws SQLException {
            DBProcessor db = new DBProcessor();
            Connection connection = db.getConnection(URL, "root", "root");
            String query = "select * from library.book";
            Statement statement = connection.createStatement();
            ResultSet resSet = statement.executeQuery(query);


            while(resSet.next()) {
                int id = resSet.getInt("book_id");
                String title = resSet.getNString("title");
                String isbn = resSet.getNString("isbn");


                book book = new book(id, title, isbn);
                System.out.println(book);
            }



            statement.close();
            connection.close();
        }

    }





