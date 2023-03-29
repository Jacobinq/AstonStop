package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Orders;
import com.example.demo.Models.User;
import com.example.demo.Repositorys.OrdersRepository;

public class orderService {
    @Autowired
    private OrdersRepository orderRepository;

//     public List<Orders> getOrdersByUser(Long userID){
//         return orderRepository.findByUser(userID);
//     }
}
