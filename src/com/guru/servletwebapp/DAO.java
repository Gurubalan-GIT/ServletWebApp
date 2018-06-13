package com.guru.servletwebapp;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
    Connection connection=DBConnection.getConnection();
    DAO(){
        if(connection==null){
            System.out.print("Failed!");
        }
        else{
            try {
                Statement statement=connection.createStatement();
                int x=statement.executeUpdate("CREATE TABLE `test`.`table1` ( `FirstName` VARCHAR(30) NOT NULL ) ENGINE = InnoDB;");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
