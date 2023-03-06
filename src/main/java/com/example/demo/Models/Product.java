package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column(nullable = false, length = 20)
    private String product;
    @Column(nullable = false, length = 20)
    private String image;
     @Column(nullable = false, length = 20)
    private int stock;
    @Column(nullable = false, length = 20)
    private Double unitPrice;

    public Product(long id, String product, int stock, double unitPrice) {
        this.id = id;
        this.product = product;
        this.stock = stock;
        this.unitPrice = unitPrice;
    }

}



