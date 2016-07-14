package com.dzy.dubbo.serviceImpl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.dzy.dubbo.service.HelloWorldService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dengzhiyuan on 2016/7/4.
 * 在provider里面就相当于服务提供者，所以做了实例化操作
 */
@Service("helloService")
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String sayHello(String who) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + who + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + who + ", response form provider: " + RpcContext.getContext().getLocalAddress();

    }
}
