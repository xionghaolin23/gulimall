package com.xionghl.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xionghl.common.utils.PageUtils;
import com.xionghl.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 19:06:46
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

