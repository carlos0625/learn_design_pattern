package behavioral.command.commandqueue;

import behavioral.command.base.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:11
 * Description: 命令队列，用于不止一个请求接收者产生相应的情况
 */
public class CommandQueue {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    /**
     * 循环调用每一个命令对象的execute()方法
     */
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
