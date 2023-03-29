package com.example.demo.Repositorys;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Basket;
import com.example.demo.Models.User;

@Repository
public interface BasketRepository extends JpaRepository<Basket,Long> {
    Optional<Basket> findABasketByUser(User user);

    List<Basket> findAllByUser_Id(Long userId);



    


}
