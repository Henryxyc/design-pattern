public class RightExample {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new Email2());
        person2.receive(new Weixin());
    }
}

interface IReceiver {
    void getInfo();
}

class Weixin implements IReceiver {

    @Override
    public void getInfo() {
        System.out.println("接收微信的消息：hello weixin");
    }
}

class Email2 implements IReceiver {

    @Override
    public void getInfo() {
        System.out.println("接收email的消息： hello world");
    }
}

class Person2 {
    public void receive(IReceiver iReceiver){
        iReceiver.getInfo();
    }
}