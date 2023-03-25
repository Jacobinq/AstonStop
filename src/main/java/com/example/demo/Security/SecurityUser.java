package com.example.demo.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.Models.User;
import com.example.demo.Repositorys.UserRepository;

import java.util.Arrays;
import java.util.Collection;

public class SecurityUser implements UserDetails {
    private static User user;


    public SecurityUser(User user) {
        this.user = user;
    }

    public static User getUser(){
        return user;
    }

    public static long getUserID(){
        return user.getId();
    }

    @Override
    public String getUsername() {
        return user.getName();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       
        return Arrays.asList(new SimpleGrantedAuthority(user.getRoles()));
            
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

   

    

   
}