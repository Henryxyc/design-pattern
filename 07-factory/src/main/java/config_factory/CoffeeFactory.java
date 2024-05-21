package config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/*
 *@program:design-pattern
 *@author: Henry
 *@Time: 2024/5/21  22:38
 *@description: 工厂模式 + 配置文件
 */
public class CoffeeFactory {
    //加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    //1.定义容器对象存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<>();

    //加载配置文件，只需要加载一次，利用反射创建对象
    static {
        Properties properties = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(is);
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty(key.toString());
                //通过反射技术创建对象
                Class aClass = Class.forName(className);
                Coffee coffee = (Coffee) aClass.newInstance();
                map.put(key.toString(), coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    //根据名称获取对象
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
