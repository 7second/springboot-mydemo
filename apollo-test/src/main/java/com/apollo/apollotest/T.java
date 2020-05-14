package com.apollo.apollotest;

import java.time.ZonedDateTime;

/**
 * @author yupp
 * @create 2020/5/14 19:01
 */
public class T {

    public static void main(String[] args) {
        //获取默认时区时间
        ZonedDateTime obj = ZonedDateTime.now();
        System.out.println(obj);
    }
}
