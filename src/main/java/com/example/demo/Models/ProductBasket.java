package com.example.demo.Models;

import org.hibernate.annotations.ManyToAny;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "ProductBasket")
public class ProductBasket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
    @ManyToOne
    @JoinColumn(name = "basket_id")
    private Basket BasketID;

    public ProductBasket(Product product, int quantity, Basket BasketID) {
        this.product = product;
        this.quantity = quantity;
        this.BasketID = BasketID;
    }
} 