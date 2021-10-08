package com.xionghl.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xionghl.common.utils.PageUtils;
import com.xionghl.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 20:13:53
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

