package com.yupp.springboot.mapper;

import com.yupp.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yupp
 * @create 2020/5/29 11:22
 */
@Mapper
public interface UserMapper {
    List<User> getAllUser();
}
