package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Product;
import com.example.demo.Models.User;
import com.example.demo.Repositorys.ProductRepository;
import com.example.demo.Repositorys.UserRepository;
// import com.example.demo.Repositorys.OrdersRepository;

import com.example.demo.Services.productService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;






@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ProductRepository productRepository;
    
    // @Autowired
    // private OrdersRepository ordersRepository;
    
    @GetMapping("/admin")
    public String Aboutus(Model model){
        return "admin";
    }

@GetMapping("/Orders")
public String Orders(Model model) {
    // List<Orders> orders = orderService.getOrders();
    // model.addAttribute("orders", orders);
    // model.addAttribute("order", new Orders());
    return "Orders";
}
@GetMapping("/Roles")
public String Roles(Model model) {
    List<User> users = userRepository.findAll();
    model.addAttribute("Users", users);
    return "Roles";
}

@GetMapping("/Roles/userRoles")
public String UserRoles(Model model) {
    List<User> users = userRepository.findAll();
    model.addAttribute("Users", users);
    return "Roles";
}

@GetMapping("/addProduct")
public String addProducts(Model model) {
    List<Product> products = productRepository.findAll();
    model.addAttribute("Product", products);
    
    return "addProducts";
}





		
    }

// Public String TotalRevenue(){
//         List<Order> = 
//         return "Hello";

//     }
