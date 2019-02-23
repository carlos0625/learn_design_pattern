package builder.singleton;

/**
 * Description: 懒汉单例模式
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/31 9:26
 * @version : 1.0
 */
public class LazySingleton {
//    private static LazySingleton instance = null;//对应synchronized关键字实现线程安全
    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

//    /**
//     * 使用synchronized关键字保证线程安全
//     * @return instance
//     */
//    synchronized public static LazySingleton getInstance() {
//        if (instance == null)
//            instance = new LazySingleton();
//        return instance;
//    }

    /**
     * 双重锁机制保证线程安全
     * @return instance
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
