package com.atguigu.gulimall.gulimallproduct.dao;

import com.atguigu.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kloseq
 * @email kloseqz@gmail.com
 * @date 2022-09-12 15:45:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
