package structure.decorator;

/**
 * Description: 抽象装饰类
 * @author Carlos Leo
 * @author 1119637652@qq.com
 * Time : 2019/2/14 10:31
 * @version : 1.0
 */
public class ComponentDecorator extends Component {
    /**
     * 维持对抽象构建的唯一引用
     */
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
