package com.yupp.springboot.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yupp.springboot.entity.User;
import com.yupp.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yupp
 * @create 2020/5/29 11:03
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;


    @RequestMapping("/getAllUser")
    public PageInfo  getS(Integer currentPage, Integer pageSize){
        //第一个参数为页数，第二个为显示数
        PageHelper.startPage(currentPage, pageSize);
        //去数据库中查询数据
        List<User> allUsers = userService.getAllUser();
        //pageInfo为分页的详细信息
        return new PageInfo(allUsers);
    }
}
