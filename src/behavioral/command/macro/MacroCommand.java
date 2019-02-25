package behavioral.command.macro;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Leo
 * @author cleo@email.ncu.edu.cn
 * @version 1.0
 * Date:    2019/0224-10:46
 * Description: 宏命令，不自己转发请求，而是调用命令队列中的命令来转发请求
 */
public class MacroCommand extends AbstractCommand {
    private List<AbstractCommand> commands = new ArrayList<>();

    @Override
    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    @Override
    public void removeCommand(AbstractCommand command) {
        commands.remove(command);
    }

    @Override
    public AbstractCommand getCommand(int i) {
        return commands.get(i);
    }

    @Override
    public void execute() {
        for (AbstractCommand command : commands) {
            command.execute();
        }
    }
}
