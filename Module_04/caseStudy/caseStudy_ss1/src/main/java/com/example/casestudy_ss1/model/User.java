package com.example.casestudy_ss1.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    private Integer userName;

    private String password;

    public User() {
    }

    public User(Integer userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Integer getUserName() {
        return userName;
    }

    public void setUserName(Integer userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
