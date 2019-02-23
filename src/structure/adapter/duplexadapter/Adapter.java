package structure.adapter.duplexadapter;

/**
 * Description: 双向适配器
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 11:04
 * @version : 1.0
 */
public class Adapter implements Target, Adaptee {
    private Target target;
    private Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
