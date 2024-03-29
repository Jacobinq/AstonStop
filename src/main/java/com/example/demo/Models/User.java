package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import jakarta.persistence.Id;

import java.util.List;

import javax.management.relation.Role;

import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Column;

@Entity
@Data

@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    @Column(nullable = false, unique = true, length = 45)
    private String email;
    // @Column(nullable = false, unique = true, length = 10)
    private String name;
    @Column(nullable = false, length = 64)
    private String password;
    @Column(nullable = false, length = 64)
    private String roles;

    public User(String email, String name, String password, String roles){
        this.email = email;
        this.name = name;
        this.password = password;
        this.roles = roles;

    }
    public User(){


    }
    public String getName(){

        return this.name;
    }
    @Override
    public String toString() {
        return "SecurityUser{" +
                "id=" + id +
                ", username='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                '}';
    }
  
}
