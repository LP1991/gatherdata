package com.hleast.webservice;

import javax.xml.ws.Endpoint;

/**
 * @类名: Test
 * @职责说明:
 * @创建者: Primo
 * @创建时间: 2017/4/13
 */
public class Test {
    public static void main(String[] args){
        System.out.println("Starting Server");
        TestWebService helloWorldServiceImpl=new TestWebService();
        String address="http://10.1.21.54:8890/staffServer";
        Endpoint.publish(address, helloWorldServiceImpl);
        System.out.println("Start success");
    }
}
