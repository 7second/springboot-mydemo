package cn.yupp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author yupp
 * @create 2020/5/11 15:54
 */
@SpringBootApplication
public class HelloMain extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(HelloMain.class,args);
    }
    /**
     *新增此方法
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(HelloMain .class);
    }
}
