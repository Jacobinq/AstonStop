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
    @OneToMany(mappedBy = "BasketID", cascade = CascadeType.ALL)
    private List<ProductBasket> productBaskets = new ArrayList<>();
    
    public Basket(User user){
        this.user = user;
    }

    public void addProduct(Product product, int quantity){
        ProductBasket existingItem = findBasketProductByProduct(product);
        if (existingItem != null) {
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
        } else {
            ProductBasket newItem = new ProductBasket(product, quantity, this);
            productBaskets.add(newItem);
        }
    }
    private ProductBasket findBasketProductByProduct(Product product) {
        for (ProductBasket basketProduct : productBaskets) {
            if (basketProduct.getProduct().equals(product)) {
                return basketProduct;
            }
        }
        return null;
    }
}
