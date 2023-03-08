package com.example.demo.Admin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    public Role() {

    }
    public Role(String name) {
        super();
        this.name =name;
    }

    @Id
    @Column(name = "role_id")
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    @Column(name="name")
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // other getters and setters are hidden for brevity
}