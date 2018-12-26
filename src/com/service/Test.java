package com.service;

import javax.xml.ws.Endpoint;

public class Test {
    public static void main(String[] args) {
        String url="http://127.0.0.1:6789/hello";
        Endpoint.publish(url, new ServiceHello());
        System.out.println("服务器启动成功！");
    }
}
