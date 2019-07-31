package com.wzh.haoke.dubbo.server.service;

import com.wzh.haoke.dubbo.server.pojo.HouseResources;

/**
 * @Author: wzh
 * @Date: 2019/5/26 02:42
 * @Description:
 * 这里编写的Service是Spring的service，不是dubbo服务，因为需要控制事务以及一些逻辑
 */
public interface HouseResourcesService {

    /**
     * *
     @param houseResources
      * *
     @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    int saveHouseResources(HouseResources houseResources);
}
