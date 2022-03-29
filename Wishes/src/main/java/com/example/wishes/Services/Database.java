package com.example.wishes.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    private Connection con;
    private String url;
    private String password;
    private String user;
    private Statement stmt;

    public Database(String url, String user, String password) {
        try{
            this.url = url ;
            con = DriverManager.getConnection(url,user,password);
            System.out.println("Connection established");
        }
        catch(Exception e){
            System.out.println("Failed Connection");
        }
    }
}
