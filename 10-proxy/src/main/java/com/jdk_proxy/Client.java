package com.jdk_proxy;

import com.static_proxy.SellTicket;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  23:06
 *@description: 代理模式的优缺点
 * 优点：代理模式在客户端与目标对象之间起到一个中介作用和保护目标对象的作用
 *      代理对象可以扩展目标对象的功能
 *      代理模式能够将客户端与目标对象分离，在一定程度上降低了系统的耦合度
 * 缺点：增加了系统的复杂度
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
