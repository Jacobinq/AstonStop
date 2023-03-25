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
import com.example.demo.Repositorys.ProductRepository;



import org.springframework.ui.Model;
@Controller
public class ProductController {
    @Autowired
    ProductRepository ProductRepository;

    @RequestMapping("/products") 
    public String product(Model model){
        model.addAttribute("products", ProductRepository.findAll());
        return "Products";
    }

}
// @GetMapping("/products/search")
// public String storeSearch(@RequestParam("searchValue") String search, Model model) {
//     List<Product> allProducts = ProductRepository.findAll();
//     List<Product> result = new ArrayList<Product>();
//     for (Product product : allProducts) {
//         if (product.getProductName().toLowerCase().contains(search.toLowerCase())) {
//             result.add(product);
//         }
//     }
//     if (result.isEmpty()) {
//         String error = "No items for that search";
//         model.addAttribute("error", error);
//         return "store";
//     } else {
//         String size = Integer.toString(result.size());
//         model.addAttribute("products", result);
//         model.addAttribute("size", size);
//         return "store";
//     }
// }
// }

