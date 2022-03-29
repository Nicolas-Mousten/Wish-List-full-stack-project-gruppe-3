package com.example.wishes;

import com.example.wishes.Services.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WishesApplication {

    public static void main(String[] args) {
        Database db = new Database("jdbc:mysql://localhost:3306/wishlists", "root","Uvnx3gxc");
        SpringApplication.run(WishesApplication.class, args);
    }

}
