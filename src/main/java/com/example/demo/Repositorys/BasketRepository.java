package com.example.demo.Repositorys;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Basket;
import com.example.demo.Models.User;

@Repository
public interface BasketRepository extends JpaRepository<Basket,Long> {

    Optional<Basket> findByUser(User user);
}