package com.sws.springboot.basic.dao;

import com.sws.springboot.basic.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    List<UserEntity> getAll();
}