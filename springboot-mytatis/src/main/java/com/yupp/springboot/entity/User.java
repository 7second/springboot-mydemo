package com.yupp.springboot.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author yupp
 * @create 2020/5/29 10:36
 */
@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
    private int sex;
    private Date birthday;
}
