package com.rcc.api.oauth.service;


import com.rcc.api.oauth.dto.UserDto;
import com.rcc.api.oauth.model.User;

import java.util.List;

public interface UserService {

    UserDto save(UserDto user);
    List<UserDto> findAll();
    User findOne(long id);
    void delete(long id);
}
