package com.markting.springbootmall.service;

import com.markting.springbootmall.dto.UserLoginRequest;
import com.markting.springbootmall.dto.UserRegisterRequest;
import com.markting.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
