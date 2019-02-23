package builder.singleton;

/**
 * Description: 饿汉单例模式
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/31 9:24
 * @version : 1.0
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() { }

    /**
     * 获取类的实例，通过在类加载时就进行初始化，实现多线程访问
     * @return instance
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
