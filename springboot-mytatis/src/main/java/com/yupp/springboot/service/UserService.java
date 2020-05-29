package com.yupp.springboot.service;

import com.yupp.springboot.entity.User;

import java.util.List;

/**
 * @author yupp
 * @create 2020/5/29 11:01
 */
public interface UserService {
    List<User> getAllUser();
}
