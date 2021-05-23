package com.jdbc.example.model;

public class Users {
    
    private String name;
    private String email;
    private int id;

    public Users(String name, String email, int id) {

        this.name = name;
        this.email = email;
        this.id = id;

    }

    public Users() {}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public int getId() { return id; }
    
    public void setId(int id) { this.id = id; }
    
}
