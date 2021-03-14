package com.hxc.springboot03.service.impl;

import com.hxc.springboot03.bean.UserInfo;
import com.hxc.springboot03.dao.UserInfoDao;
import com.hxc.springboot03.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/25
 * Time: 23:20
 */
@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public UserInfo getById(Integer id) {
        return userInfoDao.getById(id);
    }
}
