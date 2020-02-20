package com.spring.tutorials.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Data
public class User {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long Id;

    private String firstName;
    private String lastName;
    private int age;

}
