package com.wzh.haoke.dubbo.api.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzh.haoke.dubbo.server.api.ApiHouseResourcesService;
import com.wzh.haoke.dubbo.server.pojo.HouseResources;
import org.springframework.stereotype.Service;

/**
 * @Author: wzh
 * @Date: 2019/5/26 03:28
 * @Description: 调用dubbo服务对外提供的接口
 */

@Service
public class HouseResourcesService {

    //dubbo通过远程调用接口的实现类
    @Reference(version = "1.0.0")
    private ApiHouseResourcesService apiHouseResourcesService;

    public boolean save(HouseResources houseResources){
        int result =
                this.apiHouseResourcesService.saveHouseResources(houseResources);
        return result == 1;
    }

}
