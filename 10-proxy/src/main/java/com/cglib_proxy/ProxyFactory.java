package com.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/17  22:31
 *@description: 代理工厂 cglib动态代理是通过生成一个被代理对象的子类，然后重写父类的方法实现的
 */
public class ProxyFactory implements MethodInterceptor {
    Transaction transaction = new Transaction();

    public Transaction getProxyObject() {
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象，指定父类
        enhancer.setSuperclass(Transaction.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        Transaction transaction = (Transaction) enhancer.create();
        return transaction;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("cglib代理开始");
        System.out.println("售票点：收取手续费");
        Object obj = method.invoke(transaction, objects);
        return obj;
    }
}
