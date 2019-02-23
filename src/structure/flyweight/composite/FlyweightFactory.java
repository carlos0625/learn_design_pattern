package structure.flyweight.composite;

import java.util.HashMap;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 14:08
 * Description: 共享享元类的单例工厂
 */
public class FlyweightFactory {
    private static FlyweightFactory insrance = new FlyweightFactory();
    private HashMap<String, BaseFlyweight> hashMap;

    private FlyweightFactory() {
        hashMap = new HashMap<>();
        //添加一些共享享元对象到hashmap中
        //...
    }

    public static FlyweightFactory getInstance() {
        return insrance;
    }

    public BaseFlyweight getFlyweight(String key) {
        return hashMap.get(key);
    }
}
