package behavioral.command.base;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-9:32
 * Description: 客户端
 */
public class Client {
    public static void main(String[] args) {
        Command command = (Command) XmlUtil.getBean();
        FunctionButton functionButton = new FunctionButton();
        functionButton.setCommand(command);
        functionButton.click();
    }
}
