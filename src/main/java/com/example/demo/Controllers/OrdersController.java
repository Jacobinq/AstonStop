package com.example.demo.Controllers;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Repository

public class OrdersController {
    @GetMapping("/UserOrders") 
    public String index(Model model){
        return "UserOrders";
    }
}
