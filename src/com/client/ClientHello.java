package com.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.service.Hello;

public class ClientHello {

    public static void main(String[] args) throws Exception {
        /**
         * axis 调用
         */
//        try {
//            String endpoint = "http://localhost:8080/HelloWebService/services/ServiceHello?wsdl";
//            //直接引用远程的wsdl文件
//            //以下都是套路 
//            Service service = new Service();
//            Call call = (Call) service.createCall();
//            call.setTargetEndpointAddress(endpoint);
//            call.setOperationName("setName");
//            call.setOperationName("getValue");//WSDL里面描述的接口名称
//            call.addParameter("name", org.apache.axis.encoding.XMLType.XSD_STRING, javax.xml.rpc.ParameterMode.IN);//接口的参数
//            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型  
//            String temp = "测试人员";
//            String result = (String) call.invoke(new Object[] { temp });
//            //给方法传递参数，并且调用方法
//            System.out.println("result is " + result);
//        } catch (Exception e) {
//            System.err.println(e.toString());
//        }
        /**
         * service 调用
         */
        URL url = new URL("http://127.0.0.1:6789/hello?wsdl");
        //创建服务名称
        //1.命名空间地址---->namespaceURL
        //2.服务名称------>localPart
        QName qname = new QName("http://service.com/", "ServiceHelloService");
        //Service创建视图  
        //参数：  
        //1.wsdlDocumentLocation - 使用说明书地址  
        //2.serviceName - 服务名称 
        Service service=Service.create(url,qname);
        Hello Hello=service.getPort(Hello.class);  
        String name=Hello.getValue();
        System.out.println(name);
    }

}
