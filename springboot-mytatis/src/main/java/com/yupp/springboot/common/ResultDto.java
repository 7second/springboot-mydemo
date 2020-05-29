package com.yupp.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yupp
 * @create 2020/5/29 11:26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDto<T> implements Serializable {
    /**返回的状态值 200 成功 , 2失败*/
    private Integer code = 200;

    /**返回的信息*/
    private String msg;

    /**返回值*/
    private T data;

    /**是否成功*/
    private boolean success;

}