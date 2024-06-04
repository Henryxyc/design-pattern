package com.demo2;

import com.demo1.Builder;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/4  22:52
 *@description: 建造者模式 产品类 链式调用
 */
public class Phone {
    private String cpu;
    private String memory;
    private String battery;
    private String screen;

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", battery='" + battery + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }

    public Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.battery = builder.battery;
        this.screen = builder.screen;
    }

    public static class Builder {
        private String cpu;
        private String memory;
        private String battery;
        private String screen;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder battery(String battery) {
            this.battery = battery;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}
