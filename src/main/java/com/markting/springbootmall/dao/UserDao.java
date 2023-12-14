package com.markting.springbootmall.dao;

import com.markting.springbootmall.dto.UserRegisterRequest;
import com.markting.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
