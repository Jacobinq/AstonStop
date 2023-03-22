package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    // @PostMapping("/filter")
    //     public String filter(@RequestParam String name,Model model) {
    //         List<Product> product = productService.fetchByType(name);
    //         model.addAttribute("product", product);
    //         return "Product/jewellery";
    //     }
    //     @PostMapping("/search")
    //     public String search(@RequestParam String name,Model model) {
    //         List<Product> product = productService.fetchByName(name);
    //         model.addAttribute("product", product);
    //         return "Product/jewellery";
    //     }

}

