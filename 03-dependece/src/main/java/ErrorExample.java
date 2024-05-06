/**
 * 依赖倒转原则
 * 高层模块不应该依赖底层模块，二者都应该依赖其抽象
 * 抽象不应该依赖细节，细节应该依赖抽象
 * 依赖倒置的中心思想是面向接口编程（这也是为什么后续的许多设计模式的，顶层都是抽象类或者接口）
 * 继承时遵循里氏替换原则
 */
public class ErrorExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.receiveEmail(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello，world";
    }
}

/**
 * 完成Person接收消息的功能
 * 方案1分析
 * 简单，比较容易实现
 * 如果我们获取的对象是 微信，短信等，则新增类，同时Person也要新增对应的接收方法
 * 解决思路：引入一个抽象的接口IReceiver，表示接受者，这样Person类与接口IReceiver发生依赖
 *         因为Email、Weixin 等等都属于是接收的范围，他们各自实现IReceiver 接口就ok，这样我们就符合依赖倒置原则
 */
class Person {
    public void receiveEmail(Email email) {
        System.out.println(email.getInfo());
    }
}