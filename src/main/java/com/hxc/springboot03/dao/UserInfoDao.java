package com.hxc.springboot03.dao;

import com.hxc.springboot03.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/25
 * Time: 23:13
 */
@Repository
public interface UserInfoDao {

    @Select("select * from userinfo where id=#{id}")
    public UserInfo getById(@Param("id") Integer id);
}
