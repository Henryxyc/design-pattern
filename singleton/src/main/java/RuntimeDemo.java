import java.io.IOException;
import java.io.InputStream;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/9  22:48
 *@description: 测试Runtime类（饿汉式单例模式的实现）
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime runtime = Runtime.getRuntime();
        //调用runtime的exec方法，参数是一个命令
        Process process = runtime.exec("ifconfig en0");
        //调用process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] buffer = new byte[1024 * 1024 * 100];
        //读取数据
        int len = is.read(buffer); //返回读到的字节的个数
        //将字节数组转换成字符串输出到控制台
        System.out.println(new String(buffer, 0, len, "UTF-8"));

    }
}
