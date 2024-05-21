package abstract_factory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/21  22:18
 *@description:意大利风味甜品工厂对象
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
