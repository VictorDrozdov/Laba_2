package org.drozdov.Laba__2.entity;

public class User {
    private String name;
    private String surname;
    private String email;

    public User(String name, String surnam, String email) {
        this.name = name;
        this.surname = surnam;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
