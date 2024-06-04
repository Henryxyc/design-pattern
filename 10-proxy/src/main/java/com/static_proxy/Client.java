package com.static_proxy;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  23:00
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
