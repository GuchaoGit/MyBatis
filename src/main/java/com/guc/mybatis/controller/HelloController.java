package com.guc.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author guc
 * @Date 2020/1/21 10:35
 * @Description 欢迎Controller
 */
@Controller
public class HelloController {

    @RequestMapping("welcome")
    public String welcome(){
        return "hello";
    }
    @RequestMapping("/")
    public String index(){
        return "hello";
    }
}
