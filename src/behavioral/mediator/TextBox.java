package behavioral.mediator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/28-10:14
 * Description: 文本框类，充当具体同事类
 */
public class TextBox extends AbstractComponent {
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女");
    }
}
