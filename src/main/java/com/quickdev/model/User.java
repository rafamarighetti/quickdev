package com.quickdev.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name", length=100)
    private String name;
    
    @Column(name="email", unique = true, length=191)
    private String email;

    @Column(name="password", length =100)
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
