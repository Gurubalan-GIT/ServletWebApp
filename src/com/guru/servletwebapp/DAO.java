package com.guru.servletwebapp;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    Connection connection=DBConnection.getConnection();
    DAO(String string){
        if(connection==null){
            System.out.print("Failed");
        }
        else{
            try {
                Statement statement=connection.createStatement();
                int x=statement.executeUpdate("INSERT INTO `table1`(`FirstName`) VALUES ('string')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
