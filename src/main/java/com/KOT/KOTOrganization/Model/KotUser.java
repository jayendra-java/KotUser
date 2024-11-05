package com.KOT.KOTOrganization.Model;

import jakarta.persistence.*;

@Entity
public class KotUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(unique = true,nullable = false)
    String userName;
    @Column(unique = true,nullable = false)
    String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
