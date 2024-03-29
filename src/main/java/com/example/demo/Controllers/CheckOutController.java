package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.engine.AttributeName;



import com.example.demo.Models.Basket;
import com.example.demo.Models.Orders;
import com.example.demo.Models.Product;
import com.example.demo.Models.User;
import com.example.demo.Repositorys.ProductBasketRepository;
import com.example.demo.Repositorys.UserRepository;
import com.example.demo.Repositorys.productRepository;
import com.example.demo.Security.SecurityUser;
import com.example.demo.Services.basketService;
import com.example.demo.Repositorys.BasketRepository;
import com.example.demo.Repositorys.OrdersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.memory.UserAttributeEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.lang.String;
import java.util.List;
import java.util.Optional;
@Controller
public class CheckOutController {
    @Autowired
    private ProductBasketRepository productBasketRepository;
    @Autowired
    private BasketRepository basketRepository;
    @Autowired
    productRepository productRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    OrdersRepository ordersRepository;

    
    


    @GetMapping("/checkout")
    public String baskets(Model model){
        Long user = SecurityUser.getUserID();
        List<Basket> baskets = basketRepository.findAllByUser_Id(user);
        model.addAttribute("baskets", baskets);
        return "checkout";
    }
    
    @PostMapping("/order")
    public String BasketOrder(Model model  ){
        Long user = SecurityUser.getUserID();
        List<Basket> baskets = basketRepository.findAllByUser_Id(user);
        for(Basket x : baskets){
           Orders NewOrder = new Orders(x.getUser().getId(), x.getQuantity(), (x.getUnitPrice() * x.getQuantity()), "Processing");
           ordersRepository.save(NewOrder);
        }
        basketRepository.deleteAll();
        
        
        return "redirect:/orders";
    }
       
    @PostMapping("/clear")
    public String clearBasket(Model model) {
        basketRepository.deleteAll();

        return "redirect:/checkout";

    }
 



    @GetMapping("/add")
    public String basketAdd(@RequestParam String productName,@RequestParam int unitPrice, @RequestParam int quantity,@RequestParam String image, Model model  ){
        User user = SecurityUser.getUser();
        Basket newBasket = new Basket();
        newBasket.setUser(user);
        newBasket.setProductName(productName);
        newBasket.setUnitPrice(unitPrice);
        newBasket.setImage(image);
        newBasket.setQuantity(quantity);
        basketRepository.save(newBasket);



        // Optional<Basket> basket = basketRepository.findByUser(user);
        // Optional<Product> products = productRepository.findById(Long.parseLong(productName));
        
        // basket.get().addProduct(products.get(), quantity);
        // productBasketRepository.save(newBasket);
    
        return "redirect:/products";
    }
}



