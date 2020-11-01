package com.example.Javacrudapp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.jdbc.core.*;



@RestController
public class HelloWorld {

    @RequestMapping("/")
    public void index() {
        String dbURL = "jdbc:mysql://localhost:8889/java";
        String username = "fnovello";
        String password = "novello2";

        try {

            Connection conn = DriverManager.getConnection(dbURL, username, password);

            if (conn != null) {
                System.out.println("Connected");
            }else {
                System.out.println("failed");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}