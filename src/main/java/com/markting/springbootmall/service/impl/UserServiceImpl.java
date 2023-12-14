package com.markting.springbootmall.service.impl;

import com.markting.springbootmall.dao.UserDao;
import com.markting.springbootmall.dto.UserRegisterRequest;
import com.markting.springbootmall.model.User;
import com.markting.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
