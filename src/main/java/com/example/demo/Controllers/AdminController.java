package com.example.demo.Controllers;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import ch.qos.logback.core.model.Model;
@Controller
public class AdminController {
    @GetMapping("/admin")
    public String Aboutus(Model model){
        return "admin";
    }
}