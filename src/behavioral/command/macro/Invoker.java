package behavioral.command.macro;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:49
 * Description: 请求发送者
 */
public class Invoker {
    private AbstractCommand command;

    public Invoker() {
    }

    public Invoker(AbstractCommand command) {
        this.command = command;
    }

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
