package com.jdk_proxy;

import com.static_proxy.SellTicket;
import com.static_proxy.Transaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  23:01
 *@description:
 */
public class ProxyFactory {
    Transaction transaction = new Transaction();

    public SellTicket getProxyObject(){
        SellTicket proxyObject = (SellTicket) Proxy.newProxyInstance(
                transaction.getClass().getClassLoader(),  //类加载器
                transaction.getClass().getInterfaces(),  //要代理的类实现的接口
                new InvocationHandler() { //InvocationHandler接口
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取一定的手续费（JDK动态代理）");
                        return method.invoke(transaction, args);
                    }
                });
        return proxyObject;
    }
}
