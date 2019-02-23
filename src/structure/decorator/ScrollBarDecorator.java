package structure.decorator;

/**
 * Description: 滚动条装饰类，充当具体装饰类
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/14 10:33
 * @version : 1.0
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条");
    }
}
