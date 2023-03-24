package com.example.demo.Repositorys;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Basket;
import com.example.demo.Models.User;

@Repository
public interface BasketRepository extends JpaRepository<Basket,Long> {
    Optional<Basket> findBasketByUser(User user);
    List<Optional<Basket>> findAllByUserId(Long userId);
    

}