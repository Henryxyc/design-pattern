package com.cglib_proxy;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/17  22:35
 *@description: cglib动态代理测试类
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        Transaction transaction = proxyFactory.getProxyObject();
        transaction.sell();
    }
}
