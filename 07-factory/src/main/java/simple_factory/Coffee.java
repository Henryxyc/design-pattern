package simple_factory;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/10  22:03
 *@description: 咖啡类
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addSugar(){
        System.out.println("加糖");
    }

    //加奶
    public void addMilk(){
        System.out.println("加奶");
    }


}
