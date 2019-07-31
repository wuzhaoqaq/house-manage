package com.wzh.haoke.dubbo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: wzh
 * @Date: 2019/5/26 03:41
 * @Description:服务的消费者
 */
@SpringBootApplication
public class DubboApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboApiApplication.class,args);
    }
}
