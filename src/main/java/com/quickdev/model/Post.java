package com.quickdev.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="title", length=100)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;
}
