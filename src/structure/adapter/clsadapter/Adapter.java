package structure.adapter.clsadapter;

/**
 * Description: 类适配器
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/3 10:30
 * @version : 1.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
