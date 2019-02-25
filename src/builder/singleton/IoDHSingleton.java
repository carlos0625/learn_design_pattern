package builder.singleton;

/**
 * Description: 使用IoDH技术实现线程安全的单例模式，由Java虚拟机保证线程安全
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/1/31 9:33
 * @version : 1.0
 */
public class IoDHSingleton {
    /**
     * 私有构造方法
     */
    private IoDHSingleton() { }

    /**
     * 静态内部类
     */
    private static class HolderClass {
        private final static IoDHSingleton INSTANCE = new IoDHSingleton();
    }

    /**
     * 获取单个实例
     * @return instance
     */
    public static IoDHSingleton getInstance() {
        return HolderClass.INSTANCE;
    }

    /**
     * 测试
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        IoDHSingleton singleton1, singleton2;
        singleton1 = IoDHSingleton.getInstance();
        singleton2 = IoDHSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
