package com.example.demo.Repositorys;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
        Optional<User> findByEmail(String email);
        Optional<User> findByName(String name);
        List<User> findAll();
    
}
