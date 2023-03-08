package com.example.demo.Admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Models.User;

public interface IUserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}