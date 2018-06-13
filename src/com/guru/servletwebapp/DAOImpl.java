package com.guru.servletwebapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
interface DAO {
    public int doRegistration(Bean bean);
}
public class DAOImpl implements DAO {
    Connection connection=DBConnection.getConnection();
    int x;
    public int doRegistration(Bean bean){
        if(connection==null){
            System.out.print("Failed");
        }
        else {
            try {
                Statement statement = connection.createStatement();
                x = statement.executeUpdate("INSERT INTO `table1`(`FirstName`,`LastName`,`Username`,`Password`,`Address`,`Gender`)"
                        + "VALUES ('" + bean.getFn() + "','" + bean.getLn() + "','" + bean.getUn() + "','" + bean.getPass() + "','" + bean.getAddress() + "','" + bean.getGender() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(x>0){
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
