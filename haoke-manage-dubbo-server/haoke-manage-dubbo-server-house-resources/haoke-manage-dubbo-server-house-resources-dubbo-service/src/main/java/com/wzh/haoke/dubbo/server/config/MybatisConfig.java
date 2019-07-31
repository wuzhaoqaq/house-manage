package com.wzh.haoke.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: wzh
 * @Date: 2019/5/26 02:37
 * @Description: MybatisPlus配置类
 */
@MapperScan("com.wzh.haoke.dubbo.server.mapper")
@Configuration
public class MybatisConfig {
}
