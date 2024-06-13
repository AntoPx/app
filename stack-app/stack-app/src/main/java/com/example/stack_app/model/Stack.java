package com.example.stack_app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stackValue;

    public Stack() {
    }

    public Stack(String stackValue) {
        this.stackValue = stackValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStackValue() {
        return stackValue;
    }

    public void setStackValue(String stackValue) {
        this.stackValue = stackValue;
    }
}
