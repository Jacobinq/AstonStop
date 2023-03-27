package com.example.demo.Models;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Table(name = "Orders")
public class Orders {
    
    private Integer orderID;
    private Integer orderNumber;
    private Integer userID;
    private Integer quantity;
    private String price;
    private String status;

    public Orders(Integer ordersID, Integer orderNumber, Integer userID, Integer quantity, String price, String status) {
        this.orderID = ordersID;
        this.orderNumber = orderNumber;
        this.userID = userID;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
    }
}


   

