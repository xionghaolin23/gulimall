package com.xionghl.gulimall.product.dao;

import com.xionghl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 19:06:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
