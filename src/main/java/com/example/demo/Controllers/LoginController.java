package com.example.demo.Controllers;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
import jakarta.validation.constraints.Email;
@Controller
public class LoginController {
    @GetMapping("/login") 
    public String index(Model model){
    // Optional<User> userInfo = repo.findByEmail(email); 
        return "login";
    }
}
