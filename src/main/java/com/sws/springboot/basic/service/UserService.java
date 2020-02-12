package com.sws.springboot.basic.service;

import com.sws.springboot.basic.dao.UserDao;
import com.sws.springboot.basic.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private static Logger logger= LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserDao userDao;

    public List<UserEntity> getAllUser(){
        try {
            return userDao.getAll();
        }catch(Exception ex){
            logger.debug(ex.getMessage());
            return null;
        }
    }

    public UserEntity findByID(int id){
        return userDao.selectByPrimaryKey(id);
    }

    public Map<String,Object> save(UserEntity entity){
        Map<String,Object> map = new HashMap<>();
        try{
            userDao.insertSelective(entity);
            map.put("code","200");
        }catch(Exception ex){
            map.put("code","500");
            map.put("error",ex.getMessage());
        }
        return map;
    }

    public Map<String,Object> delete(int id){
        Map<String,Object> map = new HashMap<>();
        try{
            userDao.deleteByPrimaryKey(id);
            map.put("code","200");
        }catch(Exception ex){
            map.put("code","500");
            map.put("error",ex.getMessage());
        }
        return map;
    }
}
