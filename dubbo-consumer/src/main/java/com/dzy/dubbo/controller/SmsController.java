package com.dzy.dubbo.controller;

import com.dzy.dubbo.service.HelloWorldService;
import com.dzy.dubbo.service.SmsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by dengzhiyuan on 2016/7/4.
 */

@Controller
@RequestMapping("sms")
public class SmsController {

    @Resource
    private SmsService smsService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String homePageInit(HttpServletRequest request) {
        String xiaoming = smsService.sendSms("xiaoming", "13127676076");
        System.out.println("发完短信的结果"+xiaoming);
        return "{'flag':1,'msg':'发短信成功!!!!'}";
    }

}
