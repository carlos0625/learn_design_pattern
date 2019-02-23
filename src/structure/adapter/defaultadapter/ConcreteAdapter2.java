package structure.adapter.defaultadapter;

/**
 * Description: 缺省适配器2
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 10:35
 * @version : 1.0
 */
public class ConcreteAdapter2 extends AbstractAdapter {
    @Override
    public void serviceMethod1() {
        System.out.println("实现了method1和method2的适配器，这是method1");
    }

    @Override
    public void serviceMethod2() {
        System.out.println("实现了method1和method2的适配器，这是method2");
    }
}
