package com.dzy.dubbo.controller;

import com.dzy.dubbo.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by dengzhiyuan on 2016/7/4.
 */

@Controller
@RequestMapping("hello")
public class HelloWorldController {

    @Resource
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homePageInit(HttpServletRequest request) {
        String 晓明 = helloWorldService.sayHello("晓明");

        return "{'flag':1,'msg':'success'}";
    }

}
