package com.jdbc.example.view;

import java.sql.Connection;

import com.jdbc.example.controller.Commands;
import com.jdbc.example.db.DataBase;

public class View {
    
    public static void main(String[] args) {
        
        Commands teste = new Commands();
        DataBase testeConexao = new DataBase();

        teste.insert("users", "name", "Henrique Fernandez");;
        //teste.update("users", "email", "henrique_fer@gmail.com", 9);
        //teste.delete("users", 9);

        teste.selectAll("users");

    }

}
