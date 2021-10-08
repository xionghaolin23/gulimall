package com.xionghl.gulimall.member.dao;

import com.xionghl.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xionghl
 * @email 1445695649@qq.com
 * @date 2021-10-08 20:06:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
