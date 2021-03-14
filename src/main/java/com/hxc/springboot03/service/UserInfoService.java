package com.hxc.springboot03.service;

import com.hxc.springboot03.bean.UserInfo;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/25
 * Time: 23:19
 */
public interface UserInfoService {
    public UserInfo getById(Integer id);
}
