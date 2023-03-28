package com.example.demo.Models;

import javax.print.attribute.SetOfIntegerSyntax;

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

@Table(name = "Orders")
public class Orders {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer orderID;
    private Integer orderNumber;
    private long userID;
    private Integer quantity;
    private Integer price;
    private String status;

    public Orders( long userID, Integer quantity, Integer price, String status) {
        this.userID = userID;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }

    public Orders(User user, Basket basket){
        this.userID = user.getId();
        this.quantity = basket.getQuantity();
        
    }

    public Integer TotalCost(){
        return price * quantity;
    }
}


   

