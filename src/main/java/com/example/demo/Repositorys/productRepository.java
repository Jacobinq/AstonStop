package com.example.demo.Repositorys;

import com.example.demo.Models.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long productId);
   
    // Optional<Product> findByCategory(String catergory);

    // Optional<Product> findByName(String name);

    // Optional<List<Product>> findAllByCategory(String category);

         
}