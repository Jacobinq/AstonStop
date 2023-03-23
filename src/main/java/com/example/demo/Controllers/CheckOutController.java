package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.engine.AttributeName;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Basket;
import com.example.demo.Models.Product;
import com.example.demo.Models.User;
import com.example.demo.Repositorys.ProductBasketRepository;
import com.example.demo.Repositorys.ProductRepository;
import com.example.demo.Security.SecurityUser;

import groovyjarjarantlr4.runtime.misc.IntArray;

import com.example.demo.Repositorys.BasketRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
@Controller
public class CheckOutController {
    @Autowired
    private ProductBasketRepository productBasketRepository;
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    ProductRepository productRepository;

    
    


    @GetMapping("/checkout")
    public String basket(Model model){
        User user = SecurityUser.getUser();
        List<Optional<Basket>> ListBasket = new ArrayList<>();
        ListBasket = basketRepository.findAllById(user);
        model.addAttribute("baskets", ListBasket);
        return "checkout";
    }


    
    @GetMapping("/add")
    public String basketAdd(@RequestParam String productName,@RequestParam int unitPrice, @RequestParam int quantity, Model model  ){
        User user = SecurityUser.getUser();
        Basket newBasket = new Basket();
        newBasket.setProductName(productName);
        newBasket.setUnitPrice(unitPrice);
        newBasket.setUser(user);
        basketRepository.save(newBasket);



        // Optional<Basket> basket = basketRepository.findByUser(user);
        // Optional<Product> products = productRepository.findById(Long.parseLong(productName));
        // if(basket.isPresent()){
        //     Basket newBasket = new Basket(user);
        //     basket = Optional.of(newBasket);
        // }
        // basket.get().addProduct(products.get(), quantity);
        // productBasketRepository.save(newBasket);
    
        return "products";
    }
}



