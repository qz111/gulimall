package com.atguigu.gulimall.gulimallorder.dao;

import com.atguigu.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kloseq
 * @email kloseqz@gmail.com
 * @date 2022-09-13 14:08:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
