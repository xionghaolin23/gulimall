package com.xionghl.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xionghl.common.utils.PageUtils;
import com.xionghl.gulimall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 20:16:29
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

