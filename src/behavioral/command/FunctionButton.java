package behavioral.command;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-9:17
 * Description: 功能键
 */
public class FunctionButton {
    /**
     * 维持一个抽象命令对象的引用
     */
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        System.out.print("单击功能键：");
        command.execute();
    }
}
