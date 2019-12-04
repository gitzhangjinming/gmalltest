package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userInfoService.findAll();
    }
    @RequestMapping("findByUserInfo")
    public List<UserInfo> findByUserInfo(UserInfo userInfo){
        return userInfoService.findUserInfo(userInfo);
    }
    @RequestMapping("findByNickName")
    public List<UserInfo> findByNickName(String nickName){
        return userInfoService.findByNickName(nickName);
    }
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfoService.addUser(userInfo);
    }
    @RequestMapping("updUser")
    public void updUser(UserInfo userInfo){
        userInfoService.updUser(userInfo);
    }
    @RequestMapping("delUser")
    public void delUser(UserInfo userInfo){
        userInfoService.delUser(userInfo);
    }
}
