package structure.flyweight.simple.inner;

import java.util.Hashtable;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Time: 2019/2/18 - 13:04
 * Description: 享元类的工厂
 */
public class IgoChessmanFactory {
    /**
     * 单例模式
     */
    private static IgoChessmanFactory instance = new IgoChessmanFactory();

    /**
     * 存储共享的享元对象
     */
    private static Hashtable ht;

    /**
     * 私有构造方法，实例化ht并添加两个享元对象
     */
    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        white = new WhiteIgoChessman();
        ht.put("b", black);
        ht.put("w", white);
    }

    /**
     * 获取类的实例
     * @return instance
     */
    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    /**
     * 从ht中取共享的享元对象
     * @param color 颜色参数
     * @return IgoChessman
     */
    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}
