package com.sicau.managersystem.dao;

import com.sicau.managersystem.POJO.DO.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


/**
 * Created By Chq 2019/7/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    UserMapper userMapper;
    @Test
    public void getUserById() {
        User user=userMapper.getUserById("1");
        System.out.println();
    }

    @Test
    public void getAllUsers() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void insertUser() {
    }
}