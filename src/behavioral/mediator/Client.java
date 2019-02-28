package behavioral.mediator;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date: 2019/02/28-10:22
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        //定义中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事对象
        Button addBt = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTb = new TextBox();

        addBt.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTb.setMediator(mediator);

        mediator.addButton = addBt;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTb;

        addBt.changed();
        System.out.println("----------------------------------");
        list.changed();
    }
}
