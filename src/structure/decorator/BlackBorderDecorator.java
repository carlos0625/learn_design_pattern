package structure.decorator;

/**
 * Description:
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/14 10:35
 * @version : 1.0
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }
}
