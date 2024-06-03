package com.demo1;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/6/3  22:31
 *@description: 抽象建造者（建造者模式）
 *              优缺点：建造者模式的封装性很好，使用建造者模式可以有效的封装变化，在使用建造者模式的场景中，一般产品类和建造者是比较稳定的
 *                     因此，将主要的业务逻辑封装在指挥者类中对整体而言可以取得比较好的稳定性
 *              缺点：建造者模式所创建的产品一般具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，例如产品的组成部分不同，不适合使用建造者模式
 */
public abstract class Builder {

    Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public Bike createBike() {
        return bike;
    }
}
