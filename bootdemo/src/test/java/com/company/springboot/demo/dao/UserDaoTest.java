package com.company.springboot.demo.dao;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDaoTest {
    @Autowired
    UserDao userDao;
    @Test
    public void  t(){

    }

    @org.junit.jupiter.api.Test
    void findByUsernameLike() {
        System.err.println(userDao.findByUsernameLike("a"));
    }
}