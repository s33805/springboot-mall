package com.markting.springbootmall.service;

import com.markting.springbootmall.dto.UserRegisterRequest;
import com.markting.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
