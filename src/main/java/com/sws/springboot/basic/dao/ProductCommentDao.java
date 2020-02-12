package com.sws.springboot.basic.dao;

import com.sws.springboot.basic.entity.ProductCommentEntity;

public interface ProductCommentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ProductCommentEntity record);

    int insertSelective(ProductCommentEntity record);

    ProductCommentEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProductCommentEntity record);

    int updateByPrimaryKey(ProductCommentEntity record);
}