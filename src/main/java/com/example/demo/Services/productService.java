package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Product;
import com.example.demo.Repositorys.ProductRepository;

public class productService {

    @Autowired
    private ProductRepository productRepository;

    public void ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
public Product createProduct(Product product){
    return this.productRepository.save(product);
}


public void updateProduct(Product product) {
    productRepository.save(product);
}    
}

