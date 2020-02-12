package com.sws.springboot.basic.dao;

import com.sws.springboot.basic.entity.ProductEntity;

public interface ProductDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductEntity record);

    int insertSelective(ProductEntity record);

    ProductEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductEntity record);

    int updateByPrimaryKey(ProductEntity record);
}