package com.example.demo.Controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Product;
import com.example.demo.Repositorys.productRepository;
import com.example.demo.Services.productService;

import org.springframework.ui.Model;
@Controller
public class ProductController {
    @Autowired
    productRepository ProductRepository;

    @RequestMapping("/products") 
    public String product(Model model){
        model.addAttribute("products", ProductRepository.findAll());
        return "Products";
    }


@PostMapping("/filter")
public String filter(@RequestParam String name,Model model) {
    List<Product> product = productService.fetchByName(name);
    model.addAttribute("product", product);
    return "Products";
}
@PostMapping("/search")
public String search(@RequestParam String name,Model model) {
    List<Product> product = productService.fetchByName(name);
    model.addAttribute("product", product);
    return "Products";
}

}

