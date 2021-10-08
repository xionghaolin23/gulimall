package com.xionghl.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:xionghl
 * @Date:2021/10/8 7:38 下午
 */
@EnableDiscoveryClient
@MapperScan("com.xionghl.gulimall.coupon.dao")
@SpringBootApplication
public class GuLiMallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuLiMallCouponApplication.class, args);
    }
}
