/**
 * 依赖传递的3种方式 接口传递；构造方法传递；setter传递
 */
public class RightExample2 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();

        //方式1
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(changHong);

        //方式2
//        OpenAndClose2 openAndClose2 = new OpenAndClose2(changHong);
//        openAndClose2.open();

        //方式3
        OPenAndClose3 oPenAndClose3 = new OPenAndClose3();
        oPenAndClose3.setItv(new ChangHong()); //如果没有set itv 则会报空指针
        oPenAndClose3.open();

    }
}

class ChangHong implements ITV3{

    @Override
    public void play() {
        System.out.println("长虹电视剧---已打开");
    }
}



//方式1 通过接口传递依赖
//开关
interface IOpenAndClose {
    void open(ITV itv);
}

interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}


//方式2: 通过构造方法传递依赖
interface IOpenAndClose2 {
    void open();
}

interface ITV2 {
    void play();
}

class OpenAndClose2 implements IOpenAndClose2 {
    ITV2 itv2;

    /**
     * 通过构造方法传入接口进行调用
     * @param itv2
     */
    OpenAndClose2(ITV2 itv2){
        this.itv2 = itv2;
    }

    @Override
    public void open() {
        itv2.play();
    }
}




//方式3 通过setter方式
interface IOpenAndClose3 {
    void open();
    void setItv(ITV3 itv3);
}

interface ITV3 {
    void play();
}

class OPenAndClose3 implements IOpenAndClose3 {
    ITV3 itv3;

    @Override
    public void setItv(ITV3 itv3) {
        this.itv3 = itv3;
    }

    @Override
    public void open() {
        itv3.play();
    }
}
