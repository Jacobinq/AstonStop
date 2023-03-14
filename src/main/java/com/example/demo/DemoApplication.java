package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    public nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect layoutDialect() {
        return new nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect();
    }


}	