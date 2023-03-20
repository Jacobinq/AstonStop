package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Repositorys.ProductRepository;

import org.springframework.ui.Model;
@Controller
public class ProductController {
    @Autowired
    ProductRepository ProductRepository;

    @GetMapping("/products") 
    public String index(Model model){
        model.addAttribute("products", ProductRepository.findAll());
        return "Products";
    }
    

}

