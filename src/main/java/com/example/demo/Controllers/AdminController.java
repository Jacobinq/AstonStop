package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Models.Product;
import com.example.demo.Services.productService;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;

import ch.qos.logback.core.model.Model;
@Controller
public class AdminController {
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
   
    return "Roles";
}


@PostMapping(value = "/admin/productAdd")
	public String createUser(@ModelAttribute Product product, Model model, BindingResult bindingResult) {
        return null;
		
    }
}