package com.example.demo.Controllers;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Models.Orders;
import com.example.demo.Repositorys.OrdersRepository;
import com.example.demo.Security.SecurityUser;
import com.example.demo.Services.orderService;

@Controller

public class OrdersController {

    @Autowired
    OrdersRepository ordersRepository;

 

    @PreAuthorize("hasAuthority('USER_ROLE')")
    @GetMapping("/orders")    
    public String getOrders(Model model){
    Long user = SecurityUser.getUserID();
    List<Orders> orders =  ordersRepository.findByUserID(user);
    model.addAttribute("orders", orders);
    return "userorders";
}
}