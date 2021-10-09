package com.xionghl.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 引入了数据源但是没有用到 需要排除 不然启动报错  网关不需要数据源
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallGetewayApplication.class, args);
    }

}
