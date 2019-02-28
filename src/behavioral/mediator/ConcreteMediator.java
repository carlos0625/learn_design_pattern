package behavioral.mediator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/28-10:16
 * Description: 具体中介者类
 */
public class ConcreteMediator extends AbstractMediator {
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;


    @Override
    public void componentChanged(AbstractComponent c) {
        //单击按钮
        if (c == addButton) {
            System.out.println(" -- 单击增加按钮 -- ");
            list.update();
            cb.update();
            userNameTextBox.update();
        }
        //从列表框选择用户
        else if (c == list) {
            System.out.println(" -- 从列表框选择客户 -- ");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if (c == cb) {
            System.out.println(" -- 从组合框选择用户 -- ");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
