package com.sicau.managersystem.dao;

import com.sicau.managersystem.POJO.DO.User;

import java.util.List;

/**
 * Created By Chq ${Date}
 */
public interface UserMapper {
    /**
     * 通过id用户查询
     */
    User getUserById(String id);
    /**
     * 查询所有用户
     */
    List<User> getAllUsers();
    /**
     * 修改用户信息
     */
    void updateUser(User user);
    /**
     * 添加新用户
     */
    void insertUser(User user);
}
