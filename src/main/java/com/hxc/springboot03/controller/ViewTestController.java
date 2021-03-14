package com.hxc.springboot03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: hxc
 * Date: 2021/2/23
 * Time: 15:29
 */
@Controller
public class ViewTestController {


    @RequestMapping("hxc")
    public String hxc(Model model){

        model.addAttribute("msg","你好hxc");
        model.addAttribute("link","http://www.baidu.com");
        return "success";
    }
}
