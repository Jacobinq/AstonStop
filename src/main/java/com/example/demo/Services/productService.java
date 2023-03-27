package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Models.Product;
import com.example.demo.Repositorys.productRepository;

public class productService {

    @Autowired
    private static productRepository productRepository;

    public void ProductService(productRepository productRepository) {
        this.productRepository = productRepository;
    }
    
public Product createProduct(Product product){
    return this.productRepository.save(product);
}


public void updateProduct(Product product) {
    productRepository.save(product);
}    

public static List<Product> fetchByName(String name){
    return productRepository.findByProductNameContains(name);
}

}
