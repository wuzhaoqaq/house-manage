package com.wzh.haoke.dubbo.server.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzh.haoke.dubbo.server.pojo.HouseResources;
import com.wzh.haoke.dubbo.server.service.HouseResourcesService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: wzh
 * @Date: 2019/5/26 02:58
 * @Description:
 * 对外提供接口的实现类
 */
@Service(version = "1.0.0") //这是dubbo服务，对外进行暴露
public class ApiHouseResourcesServiceImpl implements ApiHouseResourcesService{


    //Spring的service
    @Autowired
    private HouseResourcesService houseResourcesService;

    @Override
    public int saveHouseResources(HouseResources houseResources) {
        return this.houseResourcesService.saveHouseResources(houseResources);
    }
}
