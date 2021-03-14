package com.hxc.springboot03;

import com.hxc.springboot03.bean.User;
import com.hxc.springboot03.dao.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
@MapperScan({"com.**.dao","com.**.dao.*"})
@Slf4j
@SpringBootTest
class Springboot03ApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
//        jdbcTemplate.queryForList("SELECT * FROM login.userinfo");
        Long along = jdbcTemplate.queryForObject("SELECT count(*) FROM login.userinfo",Long.class);
        log.info("记录总数: {}",along);
        log.info("数据源类型: {}",dataSource.getClass());
    }

    @Test
    public void testUserMapper(){
        User user = userMapper.selectById(1);
        log.info("用户信息：{}",user);
    }

}
