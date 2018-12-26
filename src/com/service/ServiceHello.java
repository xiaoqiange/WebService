package com.service;

import javax.jws.WebResult;
import javax.jws.WebService;

//必须指定endpointInterface
@WebService(endpointInterface = "com.service.Hello")
public class ServiceHello implements Hello {

    public String name = "张三";

    @Override
    @WebResult(name = "name")
    public String getName() {
        return "my name:" + name;
    }
    
    @WebResult(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    @WebResult(name = "name")
    public String getValue() {
        return "我是：" + name;
    }

}
