package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.Product;
import com.example.demo.Models.User;
import com.example.demo.Models.Orders;
import com.example.demo.Repositorys.productRepository;
import com.example.demo.Repositorys.UserRepository;
import com.example.demo.Repositorys.OrdersRepository;

import com.example.demo.Services.productService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;






@Controller
public class AdminController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private productRepository productRepository;
    
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private productService ProductService;
    
    @GetMapping("/admin")
    public String Admin(Model model){
         List<Product> products = productRepository.findAll();
    model.addAttribute("Product", products);
        return "admin";
    }

@GetMapping("/Orders")
public String Orders(Model model) {
    List<Orders> orders = ordersRepository.findAll();
    model.addAttribute("orders", orders);
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
public String addProducts(Model model  ) {
    List<Product> products = productRepository.findAll();
    model.addAttribute("Product", products);
    return "addProducts";
}


@GetMapping("/updateorder")
public String updateOrder(@RequestParam String orderStatus, @RequestParam Integer NewStatus, Model model  ) {
    List<Orders> UpdatedStatus = ordersRepository.findByOrderID(NewStatus);
    UpdatedStatus.get(0).setStatus(orderStatus);
    ordersRepository.save(UpdatedStatus.get(0));
    return "redirect:/Orders";
}

@GetMapping("/updaterole")
public String updateRole(@RequestParam Long userId, @RequestParam String userRole) {
    Optional<User> user = userRepository.findById(userId);
    user.get().setRoles(userRole);
    userRepository.save(user.get());
    return "redirect:/Roles";
}
@PostMapping(value = "/NewAdd")
	public String createUser(@ModelAttribute Product product, Model model) {
		System.out.println(product);
		Product products = ProductService.createProduct(product);
		return "redirect:/admin";}


    }

// Public String TotalRevenue(){
//         List<Order> = 
//         return "Hello";

//     }
