package com.example.demo.Repositorys;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long>  {

    //  List<Orders> findAllByUserID(Integer id);


    // List<Orders> findByStatus(String processing);
}





