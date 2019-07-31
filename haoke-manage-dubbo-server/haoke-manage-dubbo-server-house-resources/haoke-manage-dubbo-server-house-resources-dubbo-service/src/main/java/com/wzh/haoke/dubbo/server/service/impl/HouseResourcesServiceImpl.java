package com.wzh.haoke.dubbo.server.service.impl;

import com.wzh.haoke.dubbo.server.pojo.HouseResources;
import com.wzh.haoke.dubbo.server.service.HouseResourcesService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wzh
 * @Date: 2019/5/26 02:50
 * @Description:
 */
@Service //这是一个Spring事务
@Transactional //开启事务
public class HouseResourcesServiceImpl extends BaseServiceImpl<HouseResources>
        implements HouseResourcesService {

    /**
     *
     * @param houseResources
     * @return -1:输入的参数不符合要求，0：数据插入数据库失败，1：成功
     */
    @Override
    public int saveHouseResources(HouseResources houseResources) {
        // 编写校验逻辑，如果教研不通过，返回-1
        if (StringUtils.isBlank(houseResources.getTitle())){
            //不符合要求
            return -1;
        }

        return super.save(houseResources);
    }
}
