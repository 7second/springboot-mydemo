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
    /*SettableFuture<ConfigChangeEvent> futureData = SettableFuture.create();

    @ApolloConfigChangeListener("othernamespace")
    private void onChange(ConfigChangeEvent changeEvent) {
        futureData.set(changeEvent);
    }*/
}
