package before;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:09
 *@description:
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }

        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
