package com.markting.springbootmall.dao;

import com.markting.springbootmall.dto.UserRegisterRequest;
import com.markting.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
