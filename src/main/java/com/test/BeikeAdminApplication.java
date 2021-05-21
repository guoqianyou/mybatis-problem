package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author guoqianyou
 * @date 2021/4/7 12:43
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(basePackages = {"com.test.**.mapper"})
public class BeikeAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BeikeAdminApplication.class, args);
    }
}
