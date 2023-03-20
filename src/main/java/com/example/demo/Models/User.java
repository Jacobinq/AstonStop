package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import jakarta.persistence.Id;
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
    @Column(nullable = false, unique = true, length = 10)
    private String name;
    @Column(nullable = false, length = 64)
    private String password;
    @Column(nullable = false, length = 64)
    private String roles;

    public User(String email, String firstName, String password, String roles){
        this.email = email;
        this.name = firstName;
        this.password = password;
        this.roles = roles;

    }
    public User(){
    

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
