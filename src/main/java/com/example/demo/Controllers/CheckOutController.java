package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.engine.AttributeName;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Basket;
import com.example.demo.Models.Product;
import com.example.demo.Models.User;
import com.example.demo.Repositorys.ProductBasketRepository;
import com.example.demo.Repositorys.BasketRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
@Controller
public class CheckOutController {
    @Autowired
    ProductBasketRepository productBasketRepository;
    @Autowired
    BasketRepository basketRepository;


    @GetMapping("/basket")
    public String basket(Model model){
        // Optional<Basket> basket = BasketRepository.findByUser(user);
        // model.addAttribute("basket", basketRepository.findByUser(User.getFirstName()).get());
        // model.addAttribute("product", basketRepository.get());
        return "basket";
    }

}