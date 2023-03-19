package com.example.demo.Controllers;

import com.example.demo.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Repositorys.UserRepository;
import org.springframework.ui.Model;

@Controller
public class SignupController {
    @Autowired
    private UserRepository Repo;

    @GetMapping("/signup")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
         
        return "signup";

    }
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
        Repo.save(user);
     
    
    return "register_success";
    }
}

    


