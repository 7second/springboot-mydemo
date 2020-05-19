package com.yupp.springboot.snowflakedemo.controller;

import com.yupp.springboot.snowflakedemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yupp
 * @create 2020/5/19 13:40
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/snowflake")
    public String index(){
        return orderService.getIDBySnowFlake();
    }

}
