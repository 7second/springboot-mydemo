package com.yupp.springboot.snowflakedemo.service;

import com.yupp.springboot.snowflakedemo.util.IdGeneratorSnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yupp
 * @create 2020/5/19 13:41
 */
@Service
public class OrderService {

    @Autowired
    private IdGeneratorSnowFlake idGenerator;

    public String getIDBySnowFlake(){
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            threadPool.submit(()->{
                System.out.println(idGenerator.snowflakeId());
            });
        }
        threadPool.shutdown();
        return "hello snowflake";
    }

}
