package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.engine.AttributeName;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Basket;
import com.example.demo.Models.Product;
import com.example.demo.Models.User;
import com.example.demo.Repositorys.ProductBasketRepository;
import com.example.demo.Repositorys.ProductRepository;
import com.example.demo.Security.SecurityUser;
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

    
    


    @PostMapping("/checkout")
    public String basket(Model model){
        
        User user = SecurityUser.getUser();
        Optional<Basket> basket = basketRepository.findByUser(user);
        model.addAttribute("basket", basket.get());
        model.addAttribute("product", basket.get().getProductBaskets());
        return "checkout";
    }


    
    @PostMapping("/add")
    public String basketAdd(@RequestParam ("product") Long product,@RequestParam ("quantity") int quantity, Model model  ){
        User user = SecurityUser.getUser();
        Optional<Basket> basket = basketRepository.findByUser(user);
        Optional<Product> products = productRepository.findById(product);
        if(!basket.isPresent()){
            Basket newBasket = new Basket(user);
            basketRepository.save(newBasket);
            basket = Optional.of(newBasket);
        }
        basket.get().addProduct(products.get(), quantity);
        productBasketRepository.save(null);
    
        return "basketAdd";
    }
}



