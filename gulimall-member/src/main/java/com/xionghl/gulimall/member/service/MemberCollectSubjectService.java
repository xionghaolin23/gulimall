package com.xionghl.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xionghl.common.utils.PageUtils;
import com.xionghl.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 20:06:57
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

