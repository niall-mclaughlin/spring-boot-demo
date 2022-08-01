package com.example.team.gd.SpringBootDemo.model.person;

import java.util.Date;

/**
 * Basic class for person
 */


public class Person {
    private int id;
    private String name;
    private Date dateOfBirth;
    private String email;

    // Default Constructor
    public Person() {

    }

    public Person (int id, String name, Date dateOfBirth, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    // Intellij Tip-----Right click, Select Generate, Getters / Setters / Constructors

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
