package structure.adapter.duplexadapter;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 11:03
 * @version : 1.0
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("业务方法");
    }
}
