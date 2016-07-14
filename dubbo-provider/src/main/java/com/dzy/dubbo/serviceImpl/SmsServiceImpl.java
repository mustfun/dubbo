package com.dzy.dubbo.serviceImpl;

import com.dzy.dubbo.service.SmsService;
import org.springframework.stereotype.Service;

/**
 * Created by dengzhiyuan on 2016/7/14.
 * provider  后台服务的提供者
 */
@Service("smsService")
public class SmsServiceImpl implements SmsService{
    @Override
    public String sendSms(String msg, String mobilenum) {
        System.out.println("大数据中心正在提供服务LOG"+msg+"手机号"+mobilenum);
        return "大数据中心正在提供服务";
    }
}
