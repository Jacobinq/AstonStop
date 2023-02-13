package com.example.demo;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeController {

    @GetMapping("/Index") 
    public String index(){
        return "Index.html";
    }
}

