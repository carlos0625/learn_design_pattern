package structure.decorator;

/**
 * Description:
 *
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/14 10:38
 * @version : 1.0
 */
public class Client {
    public static void main(String[] args) {
        Component component, componentSB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
//        componentSB.display();
        componentSB = new BlackBorderDecorator(componentSB);
        componentSB.display();
    }
}
