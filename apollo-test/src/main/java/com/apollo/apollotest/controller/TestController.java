package com.apollo.apollotest.controller;

import com.apollo.apollotest.config.TestJavaConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yupp
 * @create 2020/5/13 14:15
 */
@RestController
public class TestController {

    @Autowired
    private TestJavaConfigBean testJavaConfigBean;

    @RequestMapping("get")
    public String get(){
        int batch = testJavaConfigBean.getBatch();
        int timeout = testJavaConfigBean.getTimeout();
        return "batch:"+batch+", timeout:"+timeout;
    }

}
