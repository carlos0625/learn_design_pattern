package behavioral.mediator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/28-10:11
 * Description: 列表框类，充当具体同事类
 */
public class List extends AbstractComponent {
    @Override
    public void update() {
        System.out.println("列表框增加一项：张无忌");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女");
    }
}
