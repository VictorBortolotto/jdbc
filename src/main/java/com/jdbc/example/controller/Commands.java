package com.jdbc.example.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.jdbc.example.db.DataBase;
import com.jdbc.example.model.Users;

public class Commands {
    
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private Connection connection = null;
    private DataBase dataBase = null; 

    public void select(String column, String table, int id){

        connection = dataBase.openConnection();

        try {
        
            preparedStatement = connection.prepareStatement("select " + column + " from " + table + " where id = " + id);
            resultSet = preparedStatement.executeQuery();
        
        } catch (SQLException e) {
        
            e.printStackTrace();
        
        }finally{

            dataBase.closePreparedStatement(preparedStatement);
            dataBase.closeConnection(connection);

        }   

    }

    private ArrayList<Users> usersList(){

        

        return null;

    }

}