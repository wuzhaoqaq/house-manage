package com.wzh.haoke.dubbo.server.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: wzh
 * @Date: 2019/5/26 01:32
 * @Description:
 *
 * 编写BasePojo，所有的pojo类都要继承该类，在该类中定义了created、updated字段，表明在每一个表中都需要
 * 有这2个字段
 */
@Data
public abstract class BasePojo implements Serializable {

    private Date created;
    private Date updated;
}
