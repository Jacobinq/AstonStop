package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Repositorys.UserRepository;
import com.example.demo.Security.JpaUserDetailsService;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import groovyjarjarantlr4.v4.parse.ANTLRParser.modeSpec_return;
import com.example.demo.Models.User;
// import jakarta.validation.constraints.Email;
import com.example.demo.Repositorys.UserRepository;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.Valid;

@Controller
public class LoginController {
   @Autowired
   JpaUserDetailsService jpaUserDetailsService;
    @Autowired
    UserRepository Repo;

    @GetMapping("/login")
    public String login(Model model){

        return "login";
    }
    @PostMapping("/login")
    public String loginUser(Model model){

        return "redirect:/";
    }

    @GetMapping("/register")
    public String Register( Model model){
        model.addAttribute("User", new User());
        return "register";
    }
    @PostMapping("/registerAccount")
    public String RegisterUser(User user, Model model){

        jpaUserDetailsService.saveUser(user);
        return "redirect:/";
    }
}
