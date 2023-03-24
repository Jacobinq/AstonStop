package com.example.demo.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.Models.Product;
@Entity
@Data
@Table(name = "basket")
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String productName;
    private String image;
    private String productDescription;
    private int unitPrice;
    private int quantity;
    private String productType;


    public String getProductName() { // Add this getter
        return productName;
    }

    public void setProductName(String productName) { // Add this setter
        this.productName = productName;
    }


}

