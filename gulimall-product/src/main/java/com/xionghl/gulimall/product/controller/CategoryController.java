package com.xionghl.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.xionghl.gulimall.product.entity.CategoryEntity;
import com.xionghl.gulimall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xionghl.common.utils.PageUtils;
import com.xionghl.common.utils.R;



/**
 * 商品三级分类
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 19:06:46
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 显示分类树形列表详情
     */
    @RequestMapping("/list/tree")
    public R categoryList() {
        List<CategoryEntity> categoryList = categoryService.categoryList();
        return R.ok().put("data", categoryList);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 菜单品牌删除（逻辑删除）
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
		categoryService.removeByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
