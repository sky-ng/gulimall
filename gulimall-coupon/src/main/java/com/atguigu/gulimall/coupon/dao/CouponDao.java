package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wusikai
 * @email 1287470027@qq.com
 * @date 2022-10-15 15:01:44
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
