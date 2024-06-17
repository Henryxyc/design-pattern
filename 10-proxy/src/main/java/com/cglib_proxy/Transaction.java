package com.cglib_proxy;

import com.jdk_proxy.SellTicket;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  22:58
 *@description: 火车站类 具体主题
 */
public class Transaction implements SellTicket {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
