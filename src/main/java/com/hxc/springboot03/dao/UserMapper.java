package com.hxc.springboot03.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxc.springboot03.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/3/2
 * Time: 9:52
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}
