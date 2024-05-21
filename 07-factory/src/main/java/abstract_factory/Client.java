package abstract_factory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/21  22:18
 *@description:
 */
public class Client {
    public static void main(String[] args) {
        //创建意大利风味甜品工厂对象
//        ItalyDessertFactory factory = new ItalyDessertFactory();
        AmericanDessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
