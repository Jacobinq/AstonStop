package com.example.demo.Repositorys;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Orders;
import com.example.demo.Models.User;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long>  {
List<Orders> findByOrderID(Integer orderID);
List<Orders> findByUserID(long userID);
}





