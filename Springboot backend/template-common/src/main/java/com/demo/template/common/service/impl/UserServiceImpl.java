package com.demo.template.common.service.impl;

import com.demo.template.common.model.User;
import com.demo.template.common.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findOne(int id) {
        return new User(id,"test");
    }
}
