package com.yupp.springboot.service.impl;

import com.yupp.springboot.entity.User;
import com.yupp.springboot.mapper.UserMapper;
import com.yupp.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yupp
 * @create 2020/5/29 11:23
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
