package com.example.demo.Repositorys;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Basket;
import com.example.demo.Models.ProductBasket;

@Repository
public interface ProductBasketRepository extends JpaRepository<Basket,Long> {
    // Optional<ProductBasket> findById(ProductBasket ProductBasket);
}