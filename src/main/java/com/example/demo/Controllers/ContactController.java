package com.example.demo.Controllers;
import org.springframework.stereotype.Controller;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;
@Controller
public class ContactController {
    @GetMapping("/contact") 
    public String index(Model model){
        return "contact";
    }
}
