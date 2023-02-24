package com.example.demo;

import jakarta.persistence.Id;

public class Product {
    @Id
    private long id;
    private String name;
}
