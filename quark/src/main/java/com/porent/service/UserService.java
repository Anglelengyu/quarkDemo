package com.porent.service;


import com.porent.entity.User;

/**
 * @Author LHR
 * Create By 2017/8/24
 */
public interface UserService {

    User getUserByApi(String token);

    
}
