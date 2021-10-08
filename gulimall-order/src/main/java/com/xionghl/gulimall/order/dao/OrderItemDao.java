package com.xionghl.gulimall.order.dao;

import com.xionghl.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 20:13:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
