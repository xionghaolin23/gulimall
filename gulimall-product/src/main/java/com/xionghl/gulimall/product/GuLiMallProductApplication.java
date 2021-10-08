package com.xionghl.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:xionghl
 * @Date:2021/10/8 7:38 下午
 */
@MapperScan("com.xionghl.gulimall.product.dao")
@SpringBootApplication
public class GuLiMallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuLiMallProductApplication.class, args);
    }
}
