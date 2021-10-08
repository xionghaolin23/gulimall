package com.xionghl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xionghl.common.utils.PageUtils;
import com.xionghl.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 20:13:53
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

