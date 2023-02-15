package com.example.demo;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
@Controller
public class LoginController {
    @GetMapping("/login") 
    public String index(Model model){
        return "login";
    }
}
