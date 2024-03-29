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
    private String productName;
    @Column(nullable = false, length = 100)
    private String image;
    @Column(nullable = false, length = 20)
    private String productDescription;
     @Column(nullable = false, length = 20)
    private int stock;
    @Column(nullable = false, length = 20)
    private int unitPrice;
    @Column(nullable = false, length = 20)
    private String productType;

    public Product( String productName, int stock, int unitPrice, String productDescription,String productType ) {
        this.productName = productName;
        this.stock = stock;
        this.unitPrice = unitPrice;
        this.productDescription = productDescription;
        this.productType = productType;

    }

}



