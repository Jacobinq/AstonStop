package com.example.demo.Repositorys;

import com.example.demo.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Repository;

@Repository

public interface productRepository extends JpaRepository<Product, Long> {
    
         
}
