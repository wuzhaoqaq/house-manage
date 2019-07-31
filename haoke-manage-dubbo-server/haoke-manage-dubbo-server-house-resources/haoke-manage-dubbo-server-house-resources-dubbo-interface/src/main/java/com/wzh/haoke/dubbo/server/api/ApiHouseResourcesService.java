package com.wzh.haoke.dubbo.server.api;

import com.wzh.haoke.dubbo.server.pojo.HouseResources;

/**
 * @Author: wzh
 * @Date: 2019/5/26 02:25
 * @Description: dubbo服务，提供接口，就是SDK
 */
public interface ApiHouseResourcesService {

    /**
     *
     * @param houseResources
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    int saveHouseResources(HouseResources houseResources);
}
