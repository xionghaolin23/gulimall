package com.xionghl.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import com.xionghl.gulimall.coupon.entity.CouponEntity;
import com.xionghl.gulimall.coupon.service.CouponService;
import com.xionghl.common.utils.PageUtils;
import com.xionghl.common.utils.R;


/**
 * 优惠券信息
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 19:56:05
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    /**
     * //从配置中心nacos获取
     */
    @Value("${version}")
    private String version;

    /**
     * 获取nacos配置中心文件
     */
    @GetMapping("/nacos/config")
    public R nacosNonfig() {
        return R.ok().put("version", version);
    }

    /**
     * 列表
     */
    @GetMapping("/member/list")
    public R memberList() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        return R.ok().put("coupons", couponEntity);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon) {
        couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon) {
        couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
