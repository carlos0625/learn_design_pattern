package structure.adapter.defaultadapter;

/**
 * Description: 继承自Target的抽象类，因为适配器可能不需要实现所有的
 *              服务，因此使用抽象类提供空方法，再使用子类来实现部分
 *              服务。
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 10:33
 * @version : 1.0
 */
public abstract class AbstractAdapter implements TargetService {
    @Override
    public void serviceMethod1() { }

    @Override
    public void serviceMethod2() { }

    @Override
    public void serviceMethod3() { }
}
