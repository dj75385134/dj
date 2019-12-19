package com.kgc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2019/12/16.
 */

@Controller
public class Hello {

    @Value("${city[0]}")
    private String city;

    @Value("${name}")
    private String name;

    @Value("${person.addr}")
    private String addr;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "springboot 访问成功了!";
    }


    @RequestMapping("/name")
    @ResponseBody
    public String name(){
        return name;
    }

    @RequestMapping("/addr")
    @ResponseBody
    public String addr(){
        return addr;
    }

    @RequestMapping("/city")
    @ResponseBody
    public String city(){
        return city;
    }


}
