package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String product;
    private int stock;
    private Double unitPrice;

    public Product(long id, String product, int stock, double unitPrice) {
        this.id = id;
        this.product = product;
        this.stock = stock;
        this.unitPrice = unitPrice;
    
    }

}



