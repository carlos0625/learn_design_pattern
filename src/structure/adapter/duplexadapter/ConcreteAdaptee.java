package structure.adapter.duplexadapter;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 11:03
 * @version : 1.0
 */
public class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("业务方法");
    }
}
