package com.jdk_proxy;

import com.static_proxy.SellTicket;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  23:06
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTicket proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
