package com.hua.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer/*表示为服务注册中心*/
public class EurkaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurkaMain7001.class,args);
    }
}
