package com.demo.template.common.service.impl;

import com.demo.template.common.model.User;
import com.demo.template.common.service.UserService;
import com.demo.template.common.utils.UnitTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;



public class UserServiceImplTest extends UnitTest {

    @Autowired
    private UserService userService;
    @Test
    public void findOne() {
        int id=0;
        User user=userService.findOne(id);
        Assert.assertEquals(id,user.getId());
    }
}