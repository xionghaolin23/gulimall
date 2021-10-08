package com.xionghl.gulimall.member.feign;

import com.xionghl.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/** 远程调用service
 * @Author:xionghl
 * @Date:2021/10/8 9:07 下午
 */
@FeignClient("gulimall-coupon")
public interface MemberFeignService {

    @GetMapping("coupon/coupon/member/list")
    public R memberList();
}
