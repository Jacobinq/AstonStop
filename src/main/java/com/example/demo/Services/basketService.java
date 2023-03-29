package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositorys.BasketRepository;
import com.example.demo.Repositorys.ProductBasketRepository;
import com.example.demo.Repositorys.productRepository;
@Service
public class basketService {
    @Autowired
    private BasketRepository basketRepository;
    private productRepository productReposiory;


    
}
