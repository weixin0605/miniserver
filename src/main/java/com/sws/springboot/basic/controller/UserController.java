package com.sws.springboot.basic.controller;

import com.sws.springboot.basic.entity.UserEntity;
import com.sws.springboot.basic.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/User")
@Api(value="User",description="用户管理API")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(method= RequestMethod.GET)
    @ApiOperation(
            value = "获取所有用户",  notes = "获取所有用户", httpMethod = "GET", tags="用户管理API")
    @ApiImplicitParams({
            @ApiImplicitParam(name="page",value="第几页",dataType = "int",paramType = "query"),
            @ApiImplicitParam(name="size",value="页面大小",dataType = "int",paramType = "query")
    })
    public List<UserEntity> getAll(int page,int size){
        return userService.getAllUser();
    }

    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    @ApiOperation(
            value = "获取用户详情",  notes = "获取用户详情", httpMethod = "GET", tags="用户管理API")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="用户主键",dataType = "Integer",paramType = "path")
    })
    public UserEntity findById(@PathVariable Integer id){
        return userService.findByID(id);
    }

    @RequestMapping(value="/{id}",method= RequestMethod.POST)
    @ApiOperation(
            value = "更新用户详情",  notes = "更新用户详情", httpMethod = "POST", tags="用户管理API")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="用户主键",dataType = "int",paramType = "path"),
            @ApiImplicitParam(name="user",value="用户详情",dataType = "UserEntity",paramType = "body")
    })
    public Map<String,Object> update(@PathVariable Integer id, @RequestBody UserEntity user){
        return userService.save(user);
    }

    @RequestMapping(value="/{id}",method= RequestMethod.DELETE)
    @ApiOperation(
            value = "删除用户",  notes = "删除用户", httpMethod = "DELETE", tags="用户管理API")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="用户主键",dataType = "int",paramType = "path")
    })
    public Map<String,Object> delete(@PathVariable Integer id){
        return userService.delete(id);
    }
}
