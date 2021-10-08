package com.xionghl.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author:xionghl
 * @Date:2021/10/8 7:38 下午
 */
@EnableFeignClients
@MapperScan("com.xionghl.gulimall.member.dao")
@SpringBootApplication
public class GuLiMallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuLiMallMemberApplication.class, args);
    }
}
