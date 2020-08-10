package com.company.springboot.demo.service;

import com.company.springboot.demo.action.UserController;
import com.company.springboot.demo.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;
    @Autowired
    UserController userController;
    @Test
    void getQuestionByUsername() {

      //  System.out.println(userDao.findByUsernameLike("%s%"));
      //  System.out.println(userDao.findQuestionByUsername("admin"));
    //     userDao.findAll().stream().forEach(System.out::println);
     //     System.out.println(userDao.findByUsername("setgd"));

        System.out.println(userController.getQuestByUserName("admimjkl"));
        System.out.println(userController.getQuestByUserName("admin"));
    }

    @Test
    void checkPreAnswer() {
    }

    @Test
    void resetPasswordWithToken() {
    }
}