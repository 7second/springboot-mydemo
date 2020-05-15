package com.apollo.apollotest.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author yupp
 * @create 2020/5/13 14:15
 */
public class TestJavaConfigBean {
    @Value("${timeout:100}")
    private int timeout;
    private int batch;

    @Value("${app.id}")
    private String hhh;

    @Value("${server.port}")
    private String serverport;

    @Value("${driverClass}")
    private String driverClass;

    @Value("${yyyzzzz}")
    private String yyyzzzz;

    public String getYyyzzzz() {
        return yyyzzzz;
    }

    @Value("${batch:200}")
    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getTimeout() {
        return timeout;
    }

    public int getBatch() {
        return batch;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public String getServerport() {
        return serverport;
    }

    public String getHhh() {
        return hhh;
    }
}
