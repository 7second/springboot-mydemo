package com.apollo.apollotest.controller;

import com.apollo.apollotest.config.T;
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

    @Autowired
    private T t;

    @RequestMapping("get")
    public String get(){
        System.out.println(t==null);
        int batch = testJavaConfigBean.getBatch();
        int timeout = testJavaConfigBean.getTimeout();
        String hhh = testJavaConfigBean.getHhh();
        String serverport = testJavaConfigBean.getServerport();
        String driverClass = testJavaConfigBean.getDriverClass();
        return "batch:"+batch+", timeout:"+timeout+", driverClass:"+driverClass+", serverport:"+serverport+", appid:"+hhh;
    }

}
