package com.hxc.springboot03.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hxc.springboot03.bean.User;
import com.hxc.springboot03.dao.UserMapper;
import com.hxc.springboot03.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/3/2
 * Time: 10:03
 */
@Service
public class UserServiceIml extends ServiceImpl<UserMapper, User> implements UserService {

}
