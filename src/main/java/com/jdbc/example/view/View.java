package com.jdbc.example.view;

import java.sql.Connection;

import com.jdbc.example.controller.Commands;
import com.jdbc.example.db.DataBase;

public class View {
    
    public static void main(String[] args) {
        
        Commands teste = new Commands();
        DataBase testeConexao = new DataBase();

        Connection connection = testeConexao.openConnection();
        testeConexao.checkConnectionStatus(connection);
        testeConexao.closeConnection(connection);

        //teste.select("name", "users", 6);

    }

}
