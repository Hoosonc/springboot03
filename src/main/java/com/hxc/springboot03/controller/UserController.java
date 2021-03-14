package com.hxc.springboot03.controller;

import com.hxc.springboot03.bean.User;
import com.hxc.springboot03.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/3/2
 * Time: 10:06
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/alluser")
    public List<User> allUser(){
        List<User> list = userService.list();
        return list;
    }


    @ResponseBody
    @RequestMapping("/user/delete/{id}")
    public List<User> deleteUser(@PathVariable("id") Integer id){
        userService.removeById(id);
        List<User> list = userService.list();
        return list;
    }
}
