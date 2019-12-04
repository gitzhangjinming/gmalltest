package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> findAll();
    List<UserInfo> findUserInfo(UserInfo userInfo);
    List<UserInfo> findByNickName(String nickName);
    void addUser(UserInfo userInfo);
    void updUser(UserInfo userInfo);
    void delUser(UserInfo userInfo);

}
