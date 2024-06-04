package com.static_proxy;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  22:59
 *@description: 代售点类 代理类
 */
public class ProxyPoint implements SellTicket{
    Transaction transaction = new Transaction();

    @Override
    public void sell() {
        System.out.println("代售点收取一定的手续费");
        transaction.sell();
    }
}
